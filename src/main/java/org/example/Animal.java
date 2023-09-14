package org.example;

public abstract class Animal implements Soundable, Feedable
{
    protected int countPaws;

    FeedUnit[] eatenFeedTodayUnit = new FeedUnit[3];

    int countEaten = 0;
    String name;

    void feedCat(){
        Cat cat = new Cat();
    }
    public void feed(FeedUnit feedUnit){
        eatenFeedTodayUnit[countEaten] = feedUnit;
        countEaten++;
        System.out.println("Getting some feed");
    }
}
