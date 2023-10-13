package org.example;

public class FeedUnit
{
    public static String[] feedTypes = new String[]{"meat", "fishFeed"};
    Double weightKilogram;
    String type;

    static class SaltLevel{}

    private static final SaltLevel defaultSaltLevel = new SaltLevel();

    SaltLevel saltLevel;

    private boolean isFed;

    public FeedUnit(double weight, String type){
        this.weightKilogram = weight;
        this.type = type;
        this.isFed = false;
    }

    public void addSalt(){
        this.weightKilogram += 0.001;
        this.saltLevel = defaultSaltLevel;
    }

    public void addSalt(SaltLevel saltLevel){
        addSalt();
        this.saltLevel = saltLevel;
    }
    public void makeFed(){
        isFed = true;
    }
}
