package org.example.data;

import org.example.Model.Animal;
import org.example.data.Persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AnimalBase /*implements AnimalRegistrationSystem*/ {
    private final Map<String, Animal> AnimalCache = new HashMap<>();
    private final Persistence persistence;

    @Autowired
    public AnimalBase(Persistence persistence) {
        this.persistence = persistence;
    }

    //@Override
    public Animal registerAnimal(int id, int reg_nr, String name, String species,String sub_species,String birthday,float weight,int farm_reg_nr) throws SQLException {
        return persistence.create(id,  reg_nr, name, species, sub_species, birthday, weight, farm_reg_nr);

    }
    //@Override
    public Animal registerAnimal(Animal animal) throws SQLException {
        return persistence.create(animal);
    }

    //@Override
    public Animal getAnimal(String id) throws SQLException {
        return persistence.read(id);
    }

    //@Override
    public List<Animal> getAllAnimals() throws SQLException {
        return persistence.readAll().stream().toList();
    }

    //@Override
    public void updateAnimal(Animal animal) throws SQLException {
        persistence.update(animal);
    }

    //@Override
    public void removeAnimal(String id) throws SQLException {
        persistence.delete(id);
    }
    //Todo: implement this!
    //@Override
    public List<Animal> getAnimalsByDate(String date) throws SQLException {
        return persistence.getAllAnimalsByDate(date).stream().toList();
    }

    //@Override
    public List<Animal> getAnimalsByOrigin(String farmID) throws SQLException {
        return persistence.getAllAnimalsByFarm(farmID).stream().toList();
    }

    /*
    @Override
    public List<String> getFarmsInSystemByDate(String date) throws SQLException {
        return null;
    }

    @Override
    public List<String> getDatesInSystemByFarm(String date) throws SQLException {
        return null;
    }
    */

}
