package org.example.data.Persistence;


import org.example.Model.Animal;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

@Component
@Scope("singleton")
public class AnimalDAO implements Persistence {
    private final DatabaseHelper<Animal> helper;

    public AnimalDAO(DatabaseHelper<org.example.Model.Animal> helper) {
        this.helper = helper;
    }

    private Animal createAnimal(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        int reg_nr = rs.getInt("reg_nr");
        String name = rs.getString("name");
        String species = rs.getString("species");
        String sub_species = rs.getString("sub_species");
        String birthday = rs.getString("birthday");
        float weight = rs.getFloat("weight");
        int farm_reg_nr = rs.getInt("farm_reg_nr");
        return new Animal(id,reg_nr,name,species,sub_species,birthday,weight,farm_reg_nr);
    }

    public Animal read(String id) throws SQLException {
        try {
            Animal animal = helper.mapSingle(this::createAnimal, "SELECT * FROM animal where id = ?", id);
            if (animal == null) throw new IllegalArgumentException();
            return animal;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }


    @Override
    public Animal create(int id, int reg_nr, String name, String species, String sub_species, String birthday, float weight, int farm_reg_nr) throws SQLException {
        try {
            helper.executeUpdate("INSERT INTO animal VALUES (?, ?, ?, ?, ?, ?, ?, ?)", id,  reg_nr, name, species, sub_species, birthday, weight, farm_reg_nr);
            return new Animal(id,  reg_nr, name, species, sub_species, birthday, weight, farm_reg_nr);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }

    }

    public Animal create(Animal animal) throws SQLException {
        try {
            helper.executeUpdate("INSERT INTO animal VALUES (?, ?, ?, ?, ?, ?, ?, ?)", animal.getId(),  animal.getReg_nr(), animal.getName(), animal.getSpecies(), animal.getSub_species(), animal.getBirthday(), animal.getWeight(), animal.getFarm_reg_nr());
            return animal;
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public Collection<Animal> readAll() throws SQLException {
        try {
            return helper.map(this::createAnimal, "SELECT * FROM animal");
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    @Override
    public void update(Animal animal) throws SQLException {
        try {
            int updated = helper.executeUpdate(
                    "UPDATE animal SET reg_nr=?, name=?, species=?, sub_species=? birthday=? weight=? farm_reg_nr=? WHERE id = ?",
                    animal.getReg_nr(), animal.getName(), animal.getSpecies(), animal.getSub_species(),animal.getBirthday(),animal.getWeight(),animal.getFarm_reg_nr(),animal.getId());
            if (updated == 0) throw new IllegalArgumentException();
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public void delete(String id) throws IllegalArgumentException {
        try {
            helper.executeUpdate("DELETE FROM animal WHERE id = ?", id);
        } catch (SQLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    //TODO: Should be replaced with at DAO object for AniProRegistration table
    //Date signature on sql yyyy-MM-dd
    public Collection<Animal> getAllAnimalsByDate(String date) throws SQLException {
        try {
            return helper.map(this::createAnimal, "SELECT * FROM animal WHERE reg_nr IN(SELECT animal_reg_nr FROM AniProRegistration WHERE production_date = ? AND product_reg_nr = 9999)");
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    //TODO: Should be replaced with at DAO object for Farm table
    //Date signature on sql yyyy-MM-dd
    public Collection<Animal> getAllAnimalsByFarm(String farmID) throws SQLException {
        try {
            return helper.map(this::createAnimal, "SELECT * FROM animal WHERE farm_reg_nr = ?",farmID);
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

}