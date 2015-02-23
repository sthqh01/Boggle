package edu.moravian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class loads and maintains the list of dice.
 * 
 * @author mebjc01
 */
public class DiceManager
{
    private ArrayList<Die> al = new ArrayList<Die>();
    /**
     * At creation, load the 16 dice from the specified file into the new manager.
     *
     * The format for the file is 16 lines of data, each of which contain
     * exactly 6 characters separated by spaces.  Since "qu" is always
     * represented together on a single side, this pair is also legal
     * (Note that this means that 'q' and 'qu' are both legal).
     *
     * Blank lines and lines starting with '#' will be ignored.
     *
     * @param filename the filename to process
     * @throws java.io.FileNotFoundException if the file cannot be opened
     * @throws java.io.IOException if an IO error occurs during the read
     * @throws edu.moravian.BadFileFormatException if the file does not follow
     *  the specified format.
     */
    public DiceManager(String filename) throws FileNotFoundException, IOException, BadFileFormatException
    {
        BufferedReader infile = new BufferedReader (new FileReader(filename));
        
        String line;
        int linecount = 0;
        char[] a = new char[6];
        while ((line = infile.readLine()) != null)
        {
            line = line.trim();
            
            if(line.length() == 0)
                continue;
            
            if(line.startsWith("#"))
                continue;
            
            Scanner s = new Scanner(line);
            int i = 0;
            while (s.hasNext())
            {
                //catch more than 6 characters per row.
                if (i > 5)
                    throw new BadFileFormatException("To many characters per row");
                
                String check = s.next();
                if(check.equals("qu") || check.equals("QU"))
                {
                    a[i] = check.charAt(0);
                }
                else if (check.length() == 1)
                {
                    a[i] = check.charAt(0);
                }
                else
                {
                    throw new BadFileFormatException("A non-character is passed");
                }
                i++;
            }
            //catch less than 6 characters per row
            if (i != 6)
            {
                throw new BadFileFormatException("Too few characters per row");
            }
                
            try
            {
                Die b = new Die(a[0],a[1],a[2],a[3],a[4],a[5]);
                al.add(b);
            }
            catch (Exception ex)
            {
                throw new BadFileFormatException("A non-letter is passed");
            }
            linecount ++;
        }
        if(linecount < 16)
        {
            throw new BadFileFormatException("Too few rows");
        }
        else if(linecount > 16)
        {
            throw new BadFileFormatException("Too many rows");
        }
    }

    /**
     * Get the die at the specified index
     * @param index the index
     * @return the die at that index
     * @throws IllegalArgumentException if index is less than 0 or greater than 15
     */
    public Die getDie(int index)
    {
        if(index < 0 || index > 15)
            throw new IllegalArgumentException("Index is Out of Bounds");
        Die a = al.get(index);
        return a;
    }
}
