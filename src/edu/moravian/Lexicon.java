package edu.moravian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class represents the word list.  You can check to see if a
 * word is contained or a prefix is contained in the lexicon.
 * 
 * @author mebjc01
 */
public class Lexicon
{
    private ArrayList<String> le = new ArrayList<String>();
    private ArrayList<ArrayList> listForPrefix = new ArrayList<>();

    /**
     * Create a word list from the specified file
     * @param filename the file to read
     * @throws java.io.FileNotFoundException if the file cannot be found
     * @throws java.io.IOException if an IO Error occurs while reading
     */
    public Lexicon(String filename) throws FileNotFoundException, IOException, BadFileFormatException
    {
        BufferedReader infile = new BufferedReader (new FileReader(filename));
        String line;
        while ((line = infile.readLine()) != null)
        {
            line = line.trim();
            
            if(line.length() == 0)
                continue;
            
            if(line.startsWith("#"))
                continue;
            String lineLowerCase = line.toLowerCase();
            for(int i = 0; i < lineLowerCase.length(); i++)
            {
                if(!Character.isLetter(lineLowerCase.charAt(i)))
                    throw new BadFileFormatException("There is a problem in the words");
            }
            le.add(lineLowerCase);
        }
        Collections.sort(le);
        //Prepare an array of different lists for isPrefix
        int longest = 0;
        for(int i = 0; i < le.size(); i++)
        {
            if(longest <= le.get(i).length())
                longest = le.get(i).length();
        }
        for(int i = 0; i < longest; i++)
        {
            ArrayList<String> subList = new ArrayList<>();
            for (int j = 0; j < le.size(); j++)
            {
                String word = le.get(j);
                if(word.length()>=i)
                {
                    subList.add(word.substring(0, i));
                }
            }
            Collections.sort(subList);
            listForPrefix.add(subList);
        }
    }

    /**
     * Determine if the specified string is a prefix for any of the words
     * @param prefix the prefix to test
     * @return true if the prefix occurs in the lexicon, false otherwise
     */
    public boolean isPrefix(String prefix)
    {
        int length = prefix.length();
        String prefixLowerCase = prefix.toLowerCase();
        if(le.isEmpty())
            return false;
        int search = Collections.binarySearch(listForPrefix.get(length),prefixLowerCase);
        return search >= 0; 
    }

    /**
     * Determine if the specified word is contained in the lexicon
     * @param word the word to check
     * @return true if the word occur, false otherwise
     */
    public boolean isWord(String word)
    {
        String wordLowerCase = word.toLowerCase();
        int search = Collections.binarySearch(le, wordLowerCase);
        return search >= 0;
    }
}
