package org.example;

public class Fish extends Animal
{
    private double lengthSideLine;


    @Override
    public void makeSound()
    {
	System.out.println("-");
    }

    @Override
    public void feed(FeedUnit feedUnit) throws FeedException
    {
        super.feed(feedUnit);
    }
}
