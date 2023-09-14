package org.example.music;

public class Song implements Soundable
{
    String name;

    @Override
    public void play()
    {
	System.out.println("Making sound...");
	// Тут повинна бути конкретна реалізація того, як грає музика
    }
}
