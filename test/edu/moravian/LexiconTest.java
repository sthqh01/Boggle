/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielhuynh
 */
public class LexiconTest 
{
    @Test
    public void testKnownPrefixes() throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lex = new Lexicon("src/dataFiles/words.txt");
        assertTrue(lex.isPrefix("r"));
        assertTrue(lex.isPrefix("re"));
        assertTrue(lex.isPrefix("reg"));
        assertTrue(lex.isPrefix("regi"));
        assertTrue(lex.isPrefix("regio"));
        assertTrue(lex.isPrefix("region"));
        assertTrue(lex.isPrefix("regiona"));
        assertTrue(lex.isPrefix("regional"));
        assertTrue(lex.isPrefix("regionali"));
        assertTrue(lex.isPrefix("regionaliz"));
        assertTrue(lex.isPrefix("regionaliza"));
        assertTrue(lex.isPrefix("regionalizat"));
        assertTrue(lex.isPrefix("regionalizati"));
        assertTrue(lex.isPrefix("regionalizatio"));
        assertTrue(lex.isPrefix("regionalization"));
        assertTrue(lex.isPrefix("regionalizations"));
    }
    
    @Test
    public void testTooManyWordsPerLineException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            Lexicon lex = new Lexicon("src/dataFiles/lexiconTooManyWords.txt");
            fail("Does not throw any exception");
        }
        catch(BadFileFormatException ex)
        {
        }
    }
    
    @Test
    public void testFileNotFoundException() throws IOException, BadFileFormatException
    {
        try
        {
            Lexicon lex = new Lexicon("src/dataFiles/nonExistedFile.txt");
            fail("Does not throw any exception");
        }
        catch(FileNotFoundException ex)
        {
        }
    }
    
    @Test
    public void testFileHashTagsAndBlank() throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lex = new Lexicon("src/dataFiles/lexiconHashTagsAndBlank.txt");
        assertTrue(lex.isPrefix("kil"));
        assertTrue(lex.isWord("kill"));
    }

    @Test
    public void testAllWordsFromTheLexicon() throws IOException, FileNotFoundException, BadFileFormatException
    {
        Lexicon lex = new Lexicon("src/dataFiles/words.txt");
        BufferedReader infile = new BufferedReader(new FileReader("src/dataFiles/words.txt"));
        String line;
        while ((line = infile.readLine()) != null)
        {
            line = line.trim();

            if(line.length() == 0)
                continue;

            if(line.startsWith("#"))
                continue;
            assertTrue(lex.isWord(line));
        }
    }
}
