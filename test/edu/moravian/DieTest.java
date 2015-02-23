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
 * @author danielhuynh
 */
public class DieTest 
{
    @Test
    public void testAllFacesHaveTheSameValue()
    {
        Die a = new Die('a','a','a','a','a','a');
        assertEquals('a', a.getValue());
        
        Die b = new Die('b','b','b','b','b','b');
        assertEquals('b', b.getValue());
    }
    
    @Test
    public void testInputNonCharacterNumbersException()
    {
        try
        {
            Die a = new Die('a','1','1','1','1','1');
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
    @Test
    public void testInputNonCharacterMarksException()
    {
        try
        {
            Die a = new Die('/','a','a','a','a','a');
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
    @Test
    public void testDifferentFacesHaveDifferentValuesFromAtoF()
    {
        Die a = new Die('a', 'b', 'c', 'd', 'e', 'f');
        int[] track = new int[6];
        double numTimes = 10000.0;
        char upside;
        
        for(int i = 0; i < numTimes; i++){
            a.roll();
            upside = a.getValue();
            
            if(upside == 'a'){
                track[0] += 1;
            }
            if(upside == 'b'){
                track[1] += 1;
            }
            if(upside == 'c'){
                track[2] += 1;
            }
            if(upside == 'd'){
                track[3] += 1;
            }
            if(upside == 'e'){
                track[4] += 1;
            }
            if(upside == 'f'){
                track[5] += 1;
            }
        }
        assertEquals(.1666, (track[0]/numTimes), .1);
        assertEquals(.1666, (track[1]/numTimes), .1);
        assertEquals(.1666, (track[2]/numTimes), .1);
        assertEquals(.1666, (track[3]/numTimes), .1);
        assertEquals(.1666, (track[4]/numTimes), .1);
        assertEquals(.1666, (track[5]/numTimes), .1);
    }
    
    @Test
    public void testDifferentFacesHaveDifferentValuesFromGtoL()
    {
        Die a = new Die('g', 'h', 'i', 'j', 'k', 'l');
        int[] track = new int[6];
        double numTimes = 10000.0;
        char upside;
        
        for(int i = 0; i < numTimes; i++){
            a.roll();
            upside = a.getValue();
            
            if(upside == 'g'){
                track[0] += 1;
            }
            if(upside == 'h'){
                track[1] += 1;
            }
            if(upside == 'i'){
                track[2] += 1;
            }
            if(upside == 'j'){
                track[3] += 1;
            }
            if(upside == 'k'){
                track[4] += 1;
            }
            if(upside == 'l'){
                track[5] += 1;
            }
        }
        assertEquals(.1666, (track[0]/numTimes), .1);
        assertEquals(.1666, (track[1]/numTimes), .1);
        assertEquals(.1666, (track[2]/numTimes), .1);
        assertEquals(.1666, (track[3]/numTimes), .1);
        assertEquals(.1666, (track[4]/numTimes), .1);
        assertEquals(.1666, (track[5]/numTimes), .1);
    }
    
    @Test
    public void testDifferentFacesHaveDifferentValuesFromMtoR()
    {
        Die a = new Die('m', 'n', 'o', 'p', 'q', 'r');
        int[] track = new int[6];
        double numTimes = 10000.0;
        char upside;
        
        for(int i = 0; i < numTimes; i++){
            a.roll();
            upside = a.getValue();
            
            if(upside == 'm'){
                track[0] += 1;
            }
            if(upside == 'n'){
                track[1] += 1;
            }
            if(upside == 'o'){
                track[2] += 1;
            }
            if(upside == 'p'){
                track[3] += 1;
            }
            if(upside == 'q'){
                track[4] += 1;
            }
            if(upside == 'r'){
                track[5] += 1;
            }
        }
        assertEquals(.1666, (track[0]/numTimes), .1);
        assertEquals(.1666, (track[1]/numTimes), .1);
        assertEquals(.1666, (track[2]/numTimes), .1);
        assertEquals(.1666, (track[3]/numTimes), .1);
        assertEquals(.1666, (track[4]/numTimes), .1);
        assertEquals(.1666, (track[5]/numTimes), .1);
    }
    
    @Test
    public void testDifferentFacesHaveDifferentValuesFromStoX()
    {
        Die a = new Die('s', 't', 'u', 'v', 'w', 'x');
        int[] track = new int[6];
        double numTimes = 10000.0;
        char upside;
        
        for(int i = 0; i < numTimes; i++){
            a.roll();
            upside = a.getValue();
            
            if(upside == 's'){
                track[0] += 1;
            }
            if(upside == 't'){
                track[1] += 1;
            }
            if(upside == 'u'){
                track[2] += 1;
            }
            if(upside == 'v'){
                track[3] += 1;
            }
            if(upside == 'w'){
                track[4] += 1;
            }
            if(upside == 'x'){
                track[5] += 1;
            }
        }
        assertEquals(.1666, (track[0]/numTimes), .1);
        assertEquals(.1666, (track[1]/numTimes), .1);
        assertEquals(.1666, (track[2]/numTimes), .1);
        assertEquals(.1666, (track[3]/numTimes), .1);
        assertEquals(.1666, (track[4]/numTimes), .1);
        assertEquals(.1666, (track[5]/numTimes), .1);
    }
    
    @Test
    public void testDifferentFacesHaveDifferentValuesFromUtoZ()
    {
        Die a = new Die('u', 'v', 'w', 'x', 'y', 'z');
        int[] track = new int[6];
        double numTimes = 10000.0;
        char upside;
        
        for(int i = 0; i < numTimes; i++){
            a.roll();
            upside = a.getValue();
            
            if(upside == 'u'){
                track[0] += 1;
            }
            if(upside == 'v'){
                track[1] += 1;
            }
            if(upside == 'w'){
                track[2] += 1;
            }
            if(upside == 'x'){
                track[3] += 1;
            }
            if(upside == 'y'){
                track[4] += 1;
            }
            if(upside == 'z'){
                track[5] += 1;
            }
        }
        assertEquals(.1666, (track[0]/numTimes), .1);
        assertEquals(.1666, (track[1]/numTimes), .1);
        assertEquals(.1666, (track[2]/numTimes), .1);
        assertEquals(.1666, (track[3]/numTimes), .1);
        assertEquals(.1666, (track[4]/numTimes), .1);
        assertEquals(.1666, (track[5]/numTimes), .1);
    }
}
