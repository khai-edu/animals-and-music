package org.example;

public abstract class Animal implements Soundable, Feedable
{
    protected Integer countPaws;

    FeedUnit[] eatenFeedTodayUnit = new FeedUnit[3];

    Integer countEaten = 0;
    String name;

    void feedCat(){
    }
    public void feed(FeedUnit feedUnit){
        eatenFeedTodayUnit[countEaten] = feedUnit;
        countEaten++;
        System.out.println("Getting some feed");
    }
}
