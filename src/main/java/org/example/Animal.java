package org.example;

public abstract class Animal implements Soundable, Feedable
{
    protected Integer countPaws;

    FeedUnit[] eatenFeedTodayUnit = new FeedUnit[3];

    Integer countEaten = 0;
    String name;

    void feedCat(){
    }
    public void feed(FeedUnit feedUnit) throws FeedException
    {
        eatenFeedTodayUnit[countEaten] = feedUnit;
        countEaten++;
        checkOvereat();
        System.out.println("Getting some feed");
    }

    protected void checkOvereat() throws FeedException
    {
        if(countEaten > 3)
            throw new FeedException("The animal has overeaten");
    }
}
