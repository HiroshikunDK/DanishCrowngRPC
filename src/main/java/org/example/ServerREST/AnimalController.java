package org.example.ServerREST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.example.Model.Animal;
import org.example.data.AnimalRegistrationSystem;

import java.sql.SQLException;
import java.util.List;
@RestController
public class AnimalController {
    @Autowired
    private final AnimalRegistrationSystem animalReg;


    public AnimalController(AnimalRegistrationSystem animalReg) {
        this.animalReg = animalReg;
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
    @PostMapping("/animals")
    public Animal registerAnimal(@RequestBody Animal animal) throws SQLException {
        return animalReg.registerAnimal(animal.getId(), animal.getReg_nr(), animal.getName(), animal.getSpecies(), animal.getSub_species(), animal.getBirthday(), animal.getWeight(), animal.getFarm_reg_nr());
    }

    @GetMapping("animals/{animalID}")
    public Animal getAnimal(@PathVariable String animalID) throws SQLException {
        return animalReg.getAnimal(animalID);
    }

    @GetMapping("/animals")
    public List<Animal> getAllAnimals() throws SQLException {
        return animalReg.getAllAnimals();
    }

    @PutMapping("/animals/{animalID}")
    public void updateAnimals(@PathVariable("animalID") String animalID, @RequestBody Animal animal) throws SQLException {
        if (!animalID.equals(animal.getId())) {
            throw new IllegalArgumentException("License number does not match");
        }
        animalReg.updateAnimal(animal);
    }

    @DeleteMapping("/animals/{animalID}")
    public void deleteCar(@PathVariable("animalID") String animalID) throws SQLException {
        animalReg.removeAnimal(animalID);
    }

    @GetMapping("/animalListByDate/{productionDate}")
    public List<Animal> getAnimalByProductionDate(@PathVariable("productionDate") String productionDate) throws SQLException{
        return animalReg.getAnimalsByDate(productionDate);
    }
    @GetMapping("/animalListByFarm/{productionDate}")
    public List<Animal> getAnimalByProductionFarm(@PathVariable("productionDate") String productionDate) throws SQLException{
        return animalReg.getAnimalsByDate(productionDate);
    }
}
