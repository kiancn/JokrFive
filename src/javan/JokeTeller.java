package javan;

import java.io.IOException;
import java.util.Scanner;

public class JokeTeller
{
    private Jokr jokr;

    public JokeTeller(Jokr jokr)
    {
        this.jokr = jokr;
    }

    public void TellJokes()
    {

        while(true)
        {
            System.out.println("This is joke: " + jokr.getRandomJoke());
            try
            {
                System.in.read();
            } catch(IOException e)
            {
                System.out.println(e.toString());
            }
        }
    }
}
