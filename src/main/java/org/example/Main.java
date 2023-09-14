package org.example;

public class Main
{
    public static void main(String[] args)
    {
        FeedUnit feedUnit = new FeedUnit(1, "meat");
        Animal animal = new Cat("Murchik");
        interactWithAnimal(animal, feedUnit);
    }

    private static void interactWithAnimal(Animal animal, FeedUnit feedUnit){
        animal.feed(feedUnit);
        animal.makeSound();
    }
}