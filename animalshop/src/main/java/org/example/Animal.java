package org.example;

public class Animal {
    private String breed;
    private String color;

    public Animal(String breed, String color){
        this.breed = breed;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
