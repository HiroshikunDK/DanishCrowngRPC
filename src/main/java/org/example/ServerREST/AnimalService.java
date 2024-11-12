package org.example.ServerREST;

import org.example.Model.Animal;
import org.example.data.AnimalRegistrationSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class AnimalService /*implements AnimalRegistrationSystem*/ {

    @Autowired
    public AnimalService(){}
    //@Override
    public Animal registerAnimal(int id, int reg_nr, String name, String species, String sub_species, String birthday, float weight, int farm_reg_nr) throws SQLException {
        return null;
    }

    //@Override
    public Animal registerAnimal(Animal animal) throws SQLException {
        return null;
    }

    //@Override
    public Animal getAnimal(String animalID) throws SQLException {
        return null;
    }

    //@Override
    public List<Animal> getAllAnimals() throws SQLException {
        return null;
    }

    //@Override
    public void updateAnimal(Animal animal) throws SQLException {

    }

    //@Override
    public void removeAnimal(String animalID) throws SQLException {

    }

    //@Override
    public List<Animal> getAnimalsByDate(String date) throws SQLException {
        return null;
    }

    //@Override
    public List<Animal> getAnimalsByOrigin(String farmid) throws SQLException {
        return null;
    }
}
