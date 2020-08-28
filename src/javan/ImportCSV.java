package javan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class ImportCSV
{

    public static String[] getStringsFromFile(String address)
    {
        LinkedList<String> foundStrings = new LinkedList<>();

        try
        {
            Scanner scanner = new Scanner(new File(address));
            scanner.useDelimiter(",");

            while(scanner.hasNext()) { foundStrings.add(scanner.next()); }

            String[] jokes = (String[])foundStrings.toArray(new String[foundStrings.size()]);
            return jokes;
        } catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return new String[]{};
    }
}
