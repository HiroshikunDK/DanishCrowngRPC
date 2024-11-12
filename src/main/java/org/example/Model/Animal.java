package org.example.Model;


import jakarta.persistence.*;

@Entity
@Table(name="animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final int id;
    private final int reg_nr;
    private final String name;
    private final String species;
    private final String sub_species;
    private final String birthday;
    private final float weight;
    private final int farm_reg_nr;

    public Animal(int id, int reg_nr, String name, String species,String sub_species,String birthday,float weight,int farm_reg_nr) throws IllegalArgumentException
    {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name is required");
        if (species == null || species.isEmpty()) throw new IllegalArgumentException("Species is required");
        if (sub_species == null || sub_species.isEmpty()) throw new IllegalArgumentException("SubSpecies is required");
        if (birthday == null || birthday.isEmpty()) throw new IllegalArgumentException("Date is required");
        if(weight < 0 || weight > 3000) throw new IllegalArgumentException("Weight is Not Valid");
        this.id = id;
        this.reg_nr = reg_nr;
        this.name=name;
        this.species=species;
        this.sub_species=sub_species;
        this.birthday=birthday;
        this.weight=weight;
        this.farm_reg_nr=farm_reg_nr;
    }

    public int getId(){
        return this.id;
    }
    public int getReg_nr(){
        return this.reg_nr;
    }
    public String getName(){
        return this.name;
    }
    public String getSpecies(){
        return this.species;
    }
    public String getSub_species(){
        return this.sub_species;
    }
    public String getBirthday(){
        return this.birthday;
    }
    public float getWeight(){
        return this.weight;
    }
    public int getFarm_reg_nr(){
        return this.farm_reg_nr;
    }
}
