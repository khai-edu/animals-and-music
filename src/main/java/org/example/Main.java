package org.example;

public class Main
{
    public static void main(String[] args)
    {
        FeedUnit feedUnit = new FeedUnit(1, "meat");
        Animal animal1 = new Cat("Murchik");
        Animal animal2 = new Cat("Vasya");
        interactWithAnimal(animal1, feedUnit);
        System.out.println(animal1.equals(animal2));
    }

    private static void interactWithAnimal(Animal animal, FeedUnit feedUnit)
    {
        try
        {
            animal.feed(feedUnit);
            animal.feed(feedUnit);
            animal.feed(feedUnit);
            animal.feed(feedUnit);
        }
        catch (FeedException e)
        {
            System.err.println(e.getMessage());
        }
        animal.makeSound();
    }
}