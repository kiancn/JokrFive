package javan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        /* Version 2 */
        JokeTeller teller = new JokeTeller(new Jokr(ImportCSV.getStringsFromFile(
        "W:\\demo\\Jokr\\src\\javan\\Jokes.txt")));
        teller.TellJokes();


    }
}
