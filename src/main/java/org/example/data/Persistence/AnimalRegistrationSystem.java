package org.example.data.Persistence;

import org.example.Model.Animal;
import via.pro3.grpcspringbootexample.grpc.Farm;

import java.sql.SQLException;
import java.util.List;

public interface AnimalRegistrationSystem {
    Animal registerAnimal(int id, int reg_nr, String name, String species, String sub_species, String birthday, float weight, int farm_reg_nr) throws SQLException;
    Animal registerAnimal(Animal animal) throws SQLException;
    Animal getAnimal(String licenseNumber) throws SQLException;
    List<Animal> getAllAnimals() throws SQLException;
    void updateAnimal(Animal animal) throws SQLException;
    void removeAnimal(String licenseNumber) throws SQLException;

    //Assignment 3 calls
    //Date signature on sql yyyy-MM-dd
    List<Animal> getAnimalsByDate(String date) throws SQLException;
    List<Animal> getAnimalsByOrigin(Farm farm) throws SQLException;
    //utility for assignment 2
    List<String> getFarmsInSystemByDate(String date)throws SQLException;
    List<String> getDatesInSystemByFarm(String date)throws SQLException;
}
