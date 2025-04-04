package org.example;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Ace", "Beagle", 45.6, "red");
        Dog dog2 = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "black");
        System.out.println();
        System.out.println("Dog name : " + dog1.getName());
        System.out.println("Dog breed : " + dog1.getBreed());
        System.out.print("Bark noise: ");
        dog1.bark();
        System.out.println("Dog weight: " + dog1.getWeight());
        System.out.println("Dog name : " + dog2.getName());
        System.out.println("Dog breed : " + dog2.getBreed());
        System.out.print("Bark noise: ");
        dog2.bark();
        System.out.println("Dog weight: " + dog2.getWeight());
        Fish fish1 = new Fish("Goldfish", "cold", "red");
        System.out.println("Fish breed : " + fish1.getBreed());
        System.out.println("Fish water type: " + fish1.getWaterType());
        System.out.println("Fish color : " + fish1.getColor());
    }

}