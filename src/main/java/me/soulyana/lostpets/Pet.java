package me.soulyana.lostpets;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2)
    private String name;

    @NotNull
    @Min(1)
    private int age;

    @NotNull
    @Size(min = 3)
    private String type;

    @NotNull
    @Size(min = 3)
    private String breed;

    @NotNull
    @Size(min = 3)
    private String colour;

    @NotNull
    @Size(min = 10)
    private String distFeatures;

    @NotNull
    @Size(min = 10)
    private int contactNum;

    @NotNull
    @Size(min = 4)
    private String currStatus;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getDistFeatures() {
        return distFeatures;
    }

    public void setDistFeatures(String distFeatures) {
        this.distFeatures = distFeatures;
    }

    public int getContactNum() {
        return contactNum;
    }

    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    public String getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(String currStatus) {
        this.currStatus = currStatus;
    }
}
