package org.example.data;

import org.example.Model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import via.pro3.grpcspringbootexample.grpc.Farm;

import java.sql.SQLException;
import java.util.List;

public interface AnimalRegistrationSystem extends JpaRepository<Animal, Long> {
    Animal registerAnimal(int id, int reg_nr, String name, String species, String sub_species, String birthday, float weight, int farm_reg_nr) throws SQLException;
    Animal registerAnimal(Animal animal) throws SQLException;
    Animal getAnimal(String animalID) throws SQLException;
    List<Animal> getAllAnimals() throws SQLException;
    void updateAnimal(Animal animal) throws SQLException;
    void removeAnimal(String animalID) throws SQLException;

    //Assignment 3 calls
    //Date signature on sql yyyy-MM-dd
    List<Animal> getAnimalsByDate(String date) throws SQLException;
    List<Animal> getAnimalsByOrigin(String farmid) throws SQLException;
    /*
    List<String> getFarmsInSystemByDate(String date)throws SQLException;
    List<String> getDatesInSystemByFarm(String date)throws SQLException;

     */
}
