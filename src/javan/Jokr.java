package javan;

public class Jokr
{
    String[] jokes = {
            "The chicken built the road. Pass along.",
            "Are you a Rabbi? Please walk into a bar.",
            "Donkey balls.",
            "Sane people to not read jokes.",
            "Dead joke."
    };

    public Jokr(String[] jokes)
    {
        this.jokes = jokes;
    }

    /**
     * Method returns a string from jokes String array
     */
    public String getRandomJoke()
    {
        /* jokes.length does ot need -1 because of int rounding */
        return jokes[(int)(Math.random() * (jokes.length))];
    }
}
