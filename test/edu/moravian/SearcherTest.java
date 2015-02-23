/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielhuynh
 */
public class SearcherTest 
{
   @Test
   public void testAKnownBoggleBoard16Words() throws IOException, FileNotFoundException, BadFileFormatException
   {
       DiceManager dm = new DiceManager("src/dataFiles/searcher16Words.dat");
       Board boa = Board.makeFixedBoard(dm);
       Lexicon lex = new Lexicon("src/dataFiles/words.txt");
       Searcher sea = new Searcher(boa,lex);
       sea.search();
       ArrayList<String> test = new ArrayList<>();
       String str1 = "fie"; test.add(str1);
       String str2 = "fin"; test. add(str2);
       String str3 = "fink"; test. add(str3);
       String str4 = "fino"; test. add(str4);
       String str5 = "glop"; test. add(str5);
       String str6 = "ink"; test. add(str6);
       String str7 = "jin"; test. add(str7);
       String str8 = "jink"; test. add(str8);
       String str9 = "knife"; test. add(str9);
       String str10 = "knop"; test. add(str10);
       String str11 = "kop"; test. add(str11);
       String str12 = "lop"; test. add(str12);
       String str13 = "mink"; test. add(str13);
       String str14 = "nim"; test. add(str14);
       String str15 = "plonk"; test. add(str15);
       String str16 = "pol"; test. add(str16);
       for(String a : sea.getWords())
           assertTrue(test.contains(a));
       assertEquals(16,sea.getNumWords());
   }
   
   @Test
   public void testAKnownBoggleBoard1126Words() throws IOException, FileNotFoundException, BadFileFormatException
   {
       DiceManager dm = new DiceManager("src/dataFiles/searcher1126Words.dat");
       Board boa = Board.makeFixedBoard(dm);
       Lexicon lex = new Lexicon("src/dataFiles/words.txt");
       Searcher sea = new Searcher(boa,lex);
       sea.search();
       assertEquals(1126,sea.getNumWords());
   }
   @Test
   public void testWordsWithNoLessThan3Letters() throws IOException, FileNotFoundException, BadFileFormatException
   {
       DiceManager dm = new DiceManager("src/dataFiles/searcher1126Words.dat");
       Board boa = Board.makeFixedBoard(dm);
       Lexicon lex = new Lexicon("src/dataFiles/words.txt");
       Searcher sea = new Searcher(boa,lex);
       sea.search();
       for(String a : sea.getWords())
           if(a.length()<3)
               fail("There are words that have length less than 3");
       assertEquals(1126,sea.getNumWords());
   }
   @Test
   public void testWordsWithNoDuplicate() throws IOException, FileNotFoundException, BadFileFormatException
   {
       DiceManager dm = new DiceManager("src/dataFiles/searcher1126Words.dat");
       Board boa = Board.makeFixedBoard(dm);
       Lexicon lex = new Lexicon("src/dataFiles/words.txt");
       Searcher sea = new Searcher(boa,lex);
       sea.search();
       ArrayList<String> test = new ArrayList<>();
       for(String a : sea.getWords())
       {
           if(test.contains(a))
               fail("There is duplicate");
           test.add(a);
       }
       assertEquals(1126,sea.getNumWords());
   }
   @Test
   public void testSearch0WordWithEmptyLexicon() throws IOException, FileNotFoundException, BadFileFormatException
   {
       DiceManager dm = new DiceManager("src/dataFiles/searcher1126Words.dat");
       Board boa = Board.makeFixedBoard(dm);
       Lexicon lex = new Lexicon("src/dataFiles/searcher0Words.txt");
       Searcher sea = new Searcher(boa,lex);
       sea.search();
       Iterator<String> test = sea.getWords().iterator();
       assertFalse(test.hasNext());
       assertEquals(0,sea.getNumWords());
   }
   @Test
   public void testGetWordsAKnownBoggleBoard16Words() throws IOException, FileNotFoundException, BadFileFormatException
   {
       DiceManager dm = new DiceManager("src/dataFiles/searcher16Words.dat");
       Board boa = Board.makeFixedBoard(dm);
       Lexicon lex = new Lexicon("src/dataFiles/words.txt");
       Searcher sea = new Searcher(boa,lex);
       sea.search();
       ArrayList<String> test = new ArrayList<>();
       String str1 = "fie"; test.add(str1);
       String str2 = "fin"; test. add(str2);
       String str3 = "fink"; test. add(str3);
       String str4 = "fino"; test. add(str4);
       String str5 = "glop"; test. add(str5);
       String str6 = "ink"; test. add(str6);
       String str7 = "jin"; test. add(str7);
       String str8 = "jink"; test. add(str8);
       String str9 = "knife"; test. add(str9);
       String str10 = "knop"; test. add(str10);
       String str11 = "kop"; test. add(str11);
       String str12 = "lop"; test. add(str12);
       String str13 = "mink"; test. add(str13);
       String str14 = "nim"; test. add(str14);
       String str15 = "plonk"; test. add(str15);
       String str16 = "pol"; test. add(str16);
       for(String a : sea.getWords())
           assertTrue(test.contains(a));
   }
   @Test
   public void testSearchMoreThanOnceException() throws IOException, FileNotFoundException, BadFileFormatException
   {
       try
       {
           DiceManager dm = new DiceManager("src/dataFiles/searcher16Words.dat");
           Board boa = Board.makeFixedBoard(dm);
           Lexicon lex = new Lexicon("src/dataFiles/words.txt");
           Searcher sea = new Searcher(boa,lex);
           sea.search();
           sea.search();
           fail("Does not throw any exception");
       }
       catch(IllegalStateException ex)
       {
       }
   }
   @Test
   public void testGetWordsBeforeSearchException() throws IOException, FileNotFoundException, BadFileFormatException
   {
       try
       {
           DiceManager dm = new DiceManager("src/dataFiles/searcher16Words.dat");
           Board boa = Board.makeFixedBoard(dm);
           Lexicon lex = new Lexicon("src/dataFiles/words.txt");
           Searcher sea = new Searcher(boa,lex);
           String b;
           for(String a : sea.getWords())
               b = a;
       }
       catch(IllegalStateException ex)
       {
           
       }
   }
   
   @Test
   public void testGetNumWordsBeforeSearchException() throws IOException, FileNotFoundException, BadFileFormatException
   {
       try
       {
           DiceManager dm = new DiceManager("src/dataFiles/searcher16Words.dat");
           Board boa = Board.makeFixedBoard(dm);
           Lexicon lex = new Lexicon("src/dataFiles/words.txt");
           Searcher sea = new Searcher(boa,lex);
           int a = sea.getNumWords();
       }
       catch(IllegalStateException ex)
       {
       }
   }
}
