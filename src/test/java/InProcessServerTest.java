//Resource used for making the test Suite
//https://stackoverflow.com/questions/37552468/how-to-unit-test-grpc-java-server-implementation-functions

import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.inprocess.InProcessChannelBuilder;
import org.example.Service.TrackingService;

import org.example.Service.TrackingService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import via.pro3.grpcspringbootexample.grpc.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class InProcessServerTest {
    private static final Logger logger = Logger.getLogger(InProcessServerTest.class.getName());

    private InProcessServer<TrackingService> inprocessServer;
    private ManagedChannel channel;

    private TrackingServiceGrpc.TrackingServiceBlockingStub blockingStub;
    private TrackingServiceGrpc.TrackingServiceStub asyncStub;

    public InProcessServerTest() {
        super();
    }

    @Test
    public void getAnimalFromProductRegistationTestInProcessServer() throws InterruptedException{
        try {
            List<String> testString = new ArrayList<>();
            testString.add("Gurli");
            testString.add("Piggy");
            testString.add("Svend Svin");

            AnimalList animals = getAnimalFromProductRegistationTest();
            ArrayList<String> resultString = new ArrayList<>();
            for (Animal item : animals.getAnimalsList()) {
                resultString.add(item.getName());
            }
            Assert.assertArrayEquals(testString.toArray(),resultString.toArray());
        } finally {
            shutdown();
        }
    }

    @Test
    public void getProductsFromAnimalTestInProcessServer() throws InterruptedException{
        try {
            List<Integer> testString = new ArrayList<>();
            testString.add(100001);
            testString.add(100002);

            AniProRegistrationList products = getProductsFromAnimalTest();
            List<Integer> resultString = new ArrayList<>();
            for (AniProRegistration item : products.getResultListList()) {
                resultString.add(item.getRegNr());
            }

            Assert.assertArrayEquals(testString.toArray(),resultString.toArray());

        } finally {
            shutdown();
        }
    }


    /** Tracking Service GRPC getAnimalFromProductRegistation*/
    public AnimalList getAnimalFromProductRegistationTest() {
        AnimalList response;
        //GRPC version of new object
        AniProRegistration searchObj = AniProRegistration.newBuilder()
                .setId(1)
                .setRegNr(100001)
                .setProductionDate("")
                .setWeight(1)
                .setAnimalRegNr(1)
                .setProductRegNr(1)
                .build();

        try {
            response = blockingStub.getAnimalFromProductRegistation(searchObj);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            fail();
            return null;
        }
        return response;
    }

    /** Tracking Service GRPC getAnimalFromProductRegistation*/
    public AniProRegistrationList getProductsFromAnimalTest() {
        AniProRegistrationList response;
        //GRPC version of new object
        Animal searchObj = Animal.newBuilder()
                .setId(1)
                .setRegNr(101)
                .setName("Gurli")
                .setSpecies("Gris")
                .setSubSpecies("Protest Svin")
                .setBirthday("")
                .setWeight(0)
                .setFarmRegNr(1)
                .build();

        try {
            response = blockingStub.getProductsFromAnimal(searchObj);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            fail();
            return null;
        }
        return response;
    }


    @Before
    public void beforeEachTest() throws InstantiationException, IllegalAccessException, IOException {
        inprocessServer = new InProcessServer<TrackingService>(TrackingService.class);
        inprocessServer.start();
        channel = InProcessChannelBuilder
                .forName("test")
                .directExecutor()
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build();
        blockingStub = TrackingServiceGrpc.newBlockingStub(channel);
        asyncStub = TrackingServiceGrpc.newStub(channel);
    }

    @After
    public void afterEachTest(){
        channel.shutdownNow();
        inprocessServer.stop();
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}
