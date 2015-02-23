/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.moravian;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author huynh
 */
public class WordPathTest {
    
    public WordPathTest() {
    }
    
    @Test
    public void testEmptyWordPath()
    {
        WordPath a = new WordPath();
        assertTrue(a.getWord().equals(""));
    }
    
    @Test
    public void testPushOne(){
        
        WordPath testWord = new WordPath();
        
        testWord.push('a');
        assertEquals("a", testWord.getWord());
        
    }
    
    @Test
    public void testPopOne(){
        
        WordPath a = new WordPath();
        
        a.push('a');
        a.push('b');
        a.push('c');
        a.pop();
        assertEquals("ab", a.getWord());
        
    }
    
    @Test
    public void testPushWordWithQ(){
        
        WordPath a = new WordPath();
        
        a.push('h');
        a.push('a');
        a.push('q');
        a.push('u');
        
        assertEquals("haquu", a.getWord());
    }

    @Test
    public void testPushNumbersException()
    {
        try
        {
            WordPath a = new WordPath();
            a.push('1');
        }
        catch (IllegalStateException ex)
        {
        }
    }
    
    @Test
    public void testPushNonLettersException()
    {
        try
        {
            WordPath a = new WordPath();
            a.push('?');
        }
        catch (IllegalStateException ex)
        {
        }
    }
    
    @Test
    public void testPushASpaceException()
    {
        try
        {
            WordPath a = new WordPath();
            a.push(' ');
        }
        catch (IllegalStateException ex)
        {
        }
    }
    
    @Test
    public void testPush16SameLowerCaseCharacters()
    {
        WordPath a = new WordPath();
        for (int i = 0; i < 16; i++)
        {
            a.push('a');
        }
        String test = a.getWord();
        assertTrue(test.equals("aaaaaaaaaaaaaaaa"));
    }
    
    @Test
    public void testPush16SameUpperCaseCharacters()
    {
        WordPath a = new WordPath();
        for (int i = 0; i < 16; i++)
        {
            a.push('A');
        }
        String test = a.getWord();
        assertTrue(test.equals("AAAAAAAAAAAAAAAA"));
    }
    
    @Test
    public void testPushFromAtoNAndCheckMiddle()
    {
        WordPath a = new WordPath();
        a.push('a');
        a.push('b');
        a.push('c');
        a.push('d');
        a.push('e');
        a.push('f');
        assertEquals("abcdef", a.getWord());
        a.push('g');
        a.push('h');
        a.push('i');
        a.push('j');
        a.push('k');
        a.push('l');
        a.push('m');
        a.push('n');
        assertEquals("abcdefghijklmn", a.getWord());
    }
    
    @Test
    public void testPushFromOtoZThenPop()
    {
        WordPath a = new WordPath();
        a.push('o');
        a.push('p');
        a.push('q');
        a.push('r');
        a.push('s');
        a.push('t');
        a.push('u');
        a.push('v');
        a.push('w');
        a.push('x');
        a.push('y');
        a.push('z');
        assertEquals("opqurstuvwxyz", a.getWord());
        for(int i = 0; i < 5; i++)
            a.pop();
        assertEquals("opqurstu",a.getWord());
    }
    
    @Test
    public void testPush8Q()
    {
        WordPath a = new WordPath();
        for (int i = 0; i < 8; i++)
        {
            a.push('q');
        }
        String test = a.getWord();
        assertTrue(test.equals("ququququququququ"));
    }
    
    @Test
    public void testPush4QPop2Q()
    {
        WordPath a = new WordPath();
        for (int i = 0; i < 4; i++)
        {
            a.push('q');
        }
        a.push('a');
        a.push('c');
        String test = a.getWord();
        assertTrue(test.equals("ququququac"));
        for (int i = 0; i < 4; i ++)
            a.pop();
        assertEquals("ququ",a.getWord());
    }
   
    @Test
    public void testPushMoreThan16CharactersException()
    {
        try
        {
            WordPath a = new WordPath();
            for (int i = 0; i < 17; i++)
            {
                a.push('a');
            }
            fail("Do not throw IllegalArgumentException");
        }
        catch(IllegalStateException ex)
        {
        }
    }
    
    @Test
    public void testPopEmptyStringException()
    {
        try
        {
            WordPath a = new WordPath();
            a.pop();
            fail("Do not throw IllegalArgumentException");
        }
        catch (IllegalStateException ex)
        {
        }                
    }
    
    @Test
    public void testPop16Characters()
    {
        WordPath a = new WordPath();
        for(int i = 0; i < 16; i ++)
        {
            a.push('a');
        }
        for(int i = 0; i < 16; i ++)
        {
            a.pop();
        }
        assertEquals("", a.getWord());
    }
    
    @Test
    public void testPop5Characters()
    {
        WordPath a = new WordPath();
        for(int i = 0; i < 16; i ++)
        {
            a.push('a');
        }
        for(int i = 0; i < 5; i ++)
        {
            a.pop();
        }
        assertEquals("aaaaaaaaaaa", a.getWord());
    }
    
    @Test
    public void testPopMoreThanPushException()
    {
        try
        {
            WordPath a = new WordPath();
            for(int i = 0; i < 5; i ++)
            {
                a.push('a');
            }
            for(int i = 0; i < 7; i ++)
            {
                a.pop();
            }
            fail("Does not throw any exception");
        }
        catch(IllegalStateException ex)
        {
        }
    }
    
    @Test
    public void testPopWordWithQ(){
        
        WordPath a = new WordPath();
        
        a.push('a');
        a.push('b');
        a.push('q');
        
        assertEquals("abqu", a.getWord());
        
        a.pop();
        
        assertEquals("ab", a.getWord());
    }
}
