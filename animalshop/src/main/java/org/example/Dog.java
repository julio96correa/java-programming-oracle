package org.example;

public class Dog extends Animal{
    private String name = "";
    private String barkNoise = "Woof";
    private Double weight = 0.0;

    public Dog(String name, String breed, Double weight, String color) {
        super(breed, color);
        this.name = name;
        this.barkNoise = barkNoise;
        this.weight = weight;
    }

    public Dog(String name, String breed, String barkNoise, Double weight, String color) {
        super(breed, color);
        this.name = name;
        this.barkNoise = barkNoise;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void bark(){
        System.out.println(barkNoise);
    }

    public void bark(String barkNoise){
        System.out.println(barkNoise);
    }
}
