package org.example.data.Persistence;


import org.example.Model.Animal;

import java.sql.SQLException;
import java.util.Collection;

public interface Persistence {
    Animal create(Animal animal) throws SQLException;
    Animal create(int id, int reg_nr, String name, String species, String sub_species, String birthday, float weight, int farm_reg_nr) throws SQLException;
    Collection<Animal> readAll() throws SQLException;
    void update(Animal animal) throws SQLException;
    void delete(String registrationNumber) throws SQLException;
    Animal read(String registrationNumber) throws SQLException;
    Collection<Animal> getAllAnimalsByDate(String date) throws SQLException;
    Collection<Animal> getAllAnimalsByFarm(String farmID) throws SQLException;
}
