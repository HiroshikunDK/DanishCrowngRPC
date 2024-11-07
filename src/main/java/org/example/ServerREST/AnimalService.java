package org.example.ServerREST;

import org.springframework.web.bind.annotation.*;
import org.example.Model.Animal;
import org.example.data.AnimalRegistrationSystem;

import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/animals")
public class AnimalService {
    private final AnimalRegistrationSystem sales;


    public AnimalService(AnimalRegistrationSystem sales) {
        this.sales = sales;
    }

    /*
    @ExceptionHandler
    public ResponseEntity<String> handleNoSuchElementFoundException (DuplicateKeyException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<String> handleNoSuchElementFoundException (NotFoundException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }

    @ExceptionHandler
    public ResponseEntity<String> handleNoSuchElementFoundException (ValidationException exception) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(exception.getMessage());
    }
*/
    @PostMapping
    public Animal registerAnimal(@RequestBody Animal animal) throws SQLException {
        return sales.registerAnimal(animal.getId(), animal.getReg_nr(), animal.getName(), animal.getSpecies(), animal.getSub_species(), animal.getBirthday(), animal.getWeight(), animal.getFarm_reg_nr());
    }

    @GetMapping("/{animalID}")
    public Animal getAnimal(@PathVariable("animalID") String animalID) throws SQLException {
        return sales.getAnimal(animalID);
    }

    @GetMapping
    public List<Animal> getAllCars() throws SQLException {
        return sales.getAllAnimals();
    }

    @PutMapping("/{animalID}")
    public void updateCar(@PathVariable("animalID") String animalID, @RequestBody Animal animal) throws SQLException {
        if (!animalID.equals(animal.getId())) {
            throw new IllegalArgumentException("License number does not match");
        }
        sales.updateAnimal(animal);
    }

    @DeleteMapping("/{animalID}")
    public void deleteCar(@PathVariable("animalID") String animalID) throws SQLException {
        sales.removeAnimal(animalID);
    }

    @RequestMapping("/animalListByDate")
    public List<Animal> getAnimalByProductionDate(@PathVariable("productionDate") String productionDate) throws SQLException{
        return sales.getAnimalsByDate(productionDate);
    }
    @RequestMapping("/animalListByFarm")
    public List<Animal> getAnimalByProductionFarm(@PathVariable("productionDate") String productionDate) throws SQLException{
        return sales.getAnimalsByDate(productionDate);
    }
}
