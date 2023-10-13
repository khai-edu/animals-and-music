package org.example;

public class Cat extends Animal
{
    public void makeSound(){
	System.out.println("meow");
    }

    Cat(String name){
	this.name = name;
    }

    @Override
    public int hashCode()
    {
	System.out.println("Here is hashcode");
	return super.hashCode();
    }

    @Override
    public boolean equals(Object obj)
    {
	if (obj == this)
	    return true;
	if (!(obj instanceof Cat))
	    return false;

	Cat other = (Cat)obj;
	if(other.name == this.name && other.countPaws.equals(this.countPaws) && other.countEaten.equals(this.countPaws)){
//	    for (FeedUnit feedUnit : this.eatenFeedTodayUnit){
	    //TODO: написати пошук feedUnit в массиві other.eatenFeedTodayUnit
//	    }
	    return true;
	}
	return super.equals(obj);
    }

    @Override
    public void feed(FeedUnit feedUnit)
    {

    }
}
