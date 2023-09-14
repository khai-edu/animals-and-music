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
    public void feed(FeedUnit feedUnit)
    {

    }
}
