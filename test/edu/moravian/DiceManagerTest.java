/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielhuynh
 */
public class DiceManagerTest 
{
    @Test
    public void testStandardBoggleDice() throws IOException, FileNotFoundException, BadFileFormatException
    {
        DiceManager a = new DiceManager("src/dataFiles/boggle.dat");
        //Test 1st die
        Die d = a.getDie(0);
        int[] track = new int[6];
        double numTimes = 10000.0;
        char upside;
        for(int i = 0; i < numTimes; i++){
            d.roll();
            upside = d.getValue();
            
            if(upside == 'L'){
                track[0] += 1;
            }
            if(upside == 'R'){
                track[1] += 1;
            }
            if(upside == 'Y'){
                track[2] += 1;
            }
            if(upside == 'T'){
                track[3] += 1;
            }
            if(upside == 'E'){
                track[5] += 1;
            }
        }
        assertEquals(.1666, (track[0]/numTimes), .1);
        assertEquals(.1666, (track[1]/numTimes), .1);
        assertEquals(.1666, (track[2]/numTimes), .1);
        assertEquals(.3413, (track[3]/numTimes), .1);
        assertEquals(.1666, (track[5]/numTimes), .1);
        //Test 2nd die
        Die d1 = a.getDie(1);
        int[] track1 = new int[6];
        double numTimes1 = 10000.0;
        char upside1;
        
        for(int i = 0; i < numTimes; i++){
            d1.roll();
            upside = d1.getValue();
            
            if(upside == 'V'){
                track1[0] += 1;
            }
            if(upside == 'T'){
                track1[1] += 1;
            }
            if(upside == 'H'){
                track1[2] += 1;
            }
            if(upside == 'R'){
                track1[3] += 1;
            }
            if(upside == 'W'){
                track1[4] += 1;
            }
            if(upside == 'E'){
                track1[5] += 1;
            }
        }
        assertEquals(.1666, (track1[0]/numTimes), .1);
        assertEquals(.1666, (track1[1]/numTimes), .1);
        assertEquals(.1666, (track1[2]/numTimes), .1);
        assertEquals(.1666, (track1[3]/numTimes), .1);
        assertEquals(.1666, (track1[4]/numTimes), .1);
        assertEquals(.1666, (track1[5]/numTimes), .1);
        //Test 3rd die
        Die d2 = a.getDie(2);
        int[] track2 = new int[6];
        double numTimes2 = 10000.0;
        char upside2;
        
        for(int i = 0; i < numTimes; i++){
            d2.roll();
            upside = d2.getValue();
            
            if(upside == 'E'){
                track2[0] += 1;
            }
            if(upside == 'G'){
                track2[1] += 1;
            }
            if(upside == 'H'){
                track2[2] += 1;
            }
            if(upside == 'W'){
                track2[3] += 1;
            }
            if(upside == 'N'){
                track2[4] += 1;
            }
        }
        assertEquals(.3413, (track2[0]/numTimes), .1);
        assertEquals(.1666, (track2[1]/numTimes), .1);
        assertEquals(.1666, (track2[2]/numTimes), .1);
        assertEquals(.1666, (track2[3]/numTimes), .1);
        assertEquals(.1666, (track2[4]/numTimes), .1);
        //Test 4rd die
        Die d3 = a.getDie(3);
        int[] track3 = new int[6];
        double numTimes3 = 10000.0;
        char upside3;
        
        for(int i = 0; i < numTimes; i++){
            d3.roll();
            upside = d3.getValue();
            
            if(upside == 'S'){
                track3[0] += 1;
            }
            if(upside == 'E'){
                track3[1] += 1;
            }
            if(upside == 'O'){
                track3[2] += 1;
            }
            if(upside == 'I'){
                track3[3] += 1;
            }
            if(upside == 'T'){
                track3[4] += 1;
            }
        }
        assertEquals(.3413, (track3[0]/numTimes), .1);
        assertEquals(.1666, (track3[1]/numTimes), .1);
        assertEquals(.1666, (track3[2]/numTimes), .1);
        assertEquals(.1666, (track3[3]/numTimes), .1);
        assertEquals(.1666, (track3[4]/numTimes), .1);
        //Test 5th die
        Die d4 = a.getDie(4);
        int[] track4 = new int[6];
        double numTimes4 = 10000.0;
        char upside4;
        
        for(int i = 0; i < numTimes; i++){
            d4.roll();
            upside = d4.getValue();
            
            if(upside == 'A'){
                track4[0] += 1;
            }
            if(upside == 'N'){
                track4[1] += 1;
            }
            if(upside == 'E'){
                track4[2] += 1;
            }
            if(upside == 'G'){
                track4[3] += 1;
            }
        }
        assertEquals(.3413, (track4[0]/numTimes), .1);
        assertEquals(.1666, (track4[1]/numTimes), .1);
        assertEquals(.3413, (track4[2]/numTimes), .1);
        assertEquals(.1666, (track4[3]/numTimes), .1);
        //Test 6th die
        Die d5 = a.getDie(5);
        int[] track5 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d5.roll();
            upside = d5.getValue();
            
            if(upside == 'I'){
                track5[0] += 1;
            }
            if(upside == 'D'){
                track5[1] += 1;
            }
            if(upside == 'S'){
                track5[2] += 1;
            }
            if(upside == 'Y'){
                track5[3] += 1;
            }
            if(upside == 'T'){
                track5[4] += 1;
            }
        }
        assertEquals(.1666, (track5[0]/numTimes), .1);
        assertEquals(.1666, (track5[1]/numTimes), .1);
        assertEquals(.1666, (track5[2]/numTimes), .1);
        assertEquals(.1666, (track5[3]/numTimes), .1);
        assertEquals(.3413, (track5[4]/numTimes), .1);
        //Test 7th die
        Die d6 = a.getDie(6);
        int[] track6 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d6.roll();
            upside = d6.getValue();
            
            if(upside == 'O'){
                track6[0] += 1;
            }
            if(upside == 'A'){
                track6[1] += 1;
            }
            if(upside == 'T'){
                track6[2] += 1;
            }
            if(upside == 'W'){
                track6[3] += 1;
            }
        }
        assertEquals(.3413, (track6[0]/numTimes), .1);
        assertEquals(.1666, (track6[1]/numTimes), .1);
        assertEquals(.3413, (track6[2]/numTimes), .1);
        assertEquals(.1666, (track6[3]/numTimes), .1);
        //Test 8th die
        Die d7 = a.getDie(7);
        int[] track7 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d7.roll();
            upside = d7.getValue();
            
            if(upside == 'M'){
                track7[0] += 1;
            }
            if(upside == 'T'){
                track7[1] += 1;
            }
            if(upside == 'O'){
                track7[2] += 1;
            }
            if(upside == 'I'){
                track7[3] += 1;
            }
            if(upside == 'C'){
                track7[4] += 1;
            }
            if(upside == 'U'){
                track7[5] += 1;
            }
        }
        assertEquals(.1666, (track7[0]/numTimes), .1);
        assertEquals(.1666, (track7[1]/numTimes), .1);
        assertEquals(.1666, (track7[2]/numTimes), .1);
        assertEquals(.1666, (track7[3]/numTimes), .1);
        assertEquals(.1666, (track7[4]/numTimes), .1);
        assertEquals(.1666, (track7[5]/numTimes), .1);
        //Test 9th die
        Die d8 = a.getDie(8);
        int[] track8 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d8.roll();
            upside = d8.getValue();
            
            if(upside == 'A'){
                track8[0] += 1;
            }
            if(upside == 'F'){
                track8[1] += 1;
            }
            if(upside == 'P'){
                track8[2] += 1;
            }
            if(upside == 'K'){
                track8[3] += 1;
            }
           
            if(upside == 'S'){
                track8[5] += 1;
            }
        }
        assertEquals(.1666, (track8[0]/numTimes), .1);
        assertEquals(.3413, (track8[1]/numTimes), .1);
        assertEquals(.1666, (track8[2]/numTimes), .1);
        assertEquals(.1666, (track8[3]/numTimes), .1);
        assertEquals(.1666, (track8[5]/numTimes), .1);
        //Test 10th die
        Die d9 = a.getDie(9);
        int[] track9 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d9.roll();
            upside = d9.getValue();
            
            if(upside == 'X'){
                track9[0] += 1;
            }
            if(upside == 'L'){
                track9[1] += 1;
            }
            if(upside == 'D'){
                track9[2] += 1;
            }
            if(upside == 'E'){
                track9[3] += 1;
            }
            if(upside == 'R'){
                track9[4] += 1;
            }
            if(upside == 'I'){
                track9[5] += 1;
            }
        }
        assertEquals(.1666, (track9[0]/numTimes), .1);
        assertEquals(.1666, (track9[1]/numTimes), .1);
        assertEquals(.1666, (track9[2]/numTimes), .1);
        assertEquals(.1666, (track9[3]/numTimes), .1);
        assertEquals(.1666, (track9[4]/numTimes), .1);
        assertEquals(.1666, (track9[5]/numTimes), .1);
        //Test 11th die
        Die d10 = a.getDie(10);
        int[] track10 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d10.roll();
            upside = d10.getValue();
            
            if(upside == 'H'){
                track10[0] += 1;
            }
            if(upside == 'C'){
                track10[1] += 1;
            }
            if(upside == 'P'){
                track10[2] += 1;
            }
            if(upside == 'O'){
                track10[3] += 1;
            }
            if(upside == 'A'){
                track10[4] += 1;
            }
            if(upside == 'S'){
                track10[5] += 1;
            }
        }
        assertEquals(.1666, (track10[0]/numTimes), .1);
        assertEquals(.1666, (track10[1]/numTimes), .1);
        assertEquals(.1666, (track10[2]/numTimes), .1);
        assertEquals(.1666, (track10[3]/numTimes), .1);
        assertEquals(.1666, (track10[4]/numTimes), .1);
        assertEquals(.1666, (track10[5]/numTimes), .1);
        //Test 12th die
        Die d11 = a.getDie(11);
        int[] track11 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d11.roll();
            upside = d11.getValue();
            
            if(upside == 'E'){
                track11[0] += 1;
            }
            if(upside == 'N'){
                track11[1] += 1;
            }
            if(upside == 'S'){
                track11[2] += 1;
            }
            if(upside == 'I'){
                track11[3] += 1;
            }
            if(upside == 'U'){
                track11[5] += 1;
            }
        }
        assertEquals(.3413, (track11[0]/numTimes), .1);
        assertEquals(.1666, (track11[1]/numTimes), .1);
        assertEquals(.1666, (track11[2]/numTimes), .1);
        assertEquals(.1666, (track11[3]/numTimes), .1);
        assertEquals(.1666, (track11[5]/numTimes), .1);
        //Test 13th die
        Die d12 = a.getDie(12);
        int[] track12 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d12.roll();
            upside = d12.getValue();
            
            if(upside == 'Y'){
                track12[0] += 1;
            }
            if(upside == 'L'){
                track12[1] += 1;
            }
            if(upside == 'D'){
                track12[2] += 1;
            }
            if(upside == 'E'){
                track12[3] += 1;
            }
            if(upside == 'V'){
                track12[4] += 1;
            }
            if(upside == 'R'){
                track12[5] += 1;
            }
        }
        assertEquals(.1666, (track12[0]/numTimes), .1);
        assertEquals(.1666, (track12[1]/numTimes), .1);
        assertEquals(.1666, (track12[2]/numTimes), .1);
        assertEquals(.1666, (track12[3]/numTimes), .1);
        assertEquals(.1666, (track12[4]/numTimes), .1);
        assertEquals(.1666, (track12[5]/numTimes), .1);
        //Test 14th die
        Die d13 = a.getDie(13);
        int[] track13 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d13.roll();
            upside = d13.getValue();
            
            if(upside == 'Z'){
                track13[0] += 1;
            }
            if(upside == 'N'){
                track13[1] += 1;
            }
            if(upside == 'R'){
                track13[2] += 1;
            }
            if(upside == 'H'){
                track13[4] += 1;
            }
            if(upside == 'L'){
                track13[5] += 1;
            }
        }
        assertEquals(.1666, (track13[0]/numTimes), .1);
        assertEquals(.3413, (track13[1]/numTimes), .1);
        assertEquals(.1666, (track13[2]/numTimes), .1);
        assertEquals(.1666, (track13[4]/numTimes), .1);
        assertEquals(.1666, (track13[5]/numTimes), .1);
        //Test 15th die
        Die d14 = a.getDie(14);
        int[] track14 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d14.roll();
            upside = d14.getValue();
            
            if(upside == 'N'){
                track14[0] += 1;
            }
            if(upside == 'M'){
                track14[1] += 1;
            }
            if(upside == 'I'){
                track14[2] += 1;
            }
            if(upside == 'Q'){
                track14[3] += 1;
            }
            if(upside == 'H'){
                track14[4] += 1;
            }
            if(upside == 'U'){
                track14[5] += 1;
            }
        }
        assertEquals(.1666, (track14[0]/numTimes), .1);
        assertEquals(.1666, (track14[1]/numTimes), .1);
        assertEquals(.1666, (track14[2]/numTimes), .1);
        assertEquals(.1666, (track14[3]/numTimes), .1);
        assertEquals(.1666, (track14[4]/numTimes), .1);
        assertEquals(.1666, (track14[5]/numTimes), .1);
        //Test 16th die
        Die d15 = a.getDie(15);
        int[] track15 = new int[6];
        
        for(int i = 0; i < numTimes; i++){
            d15.roll();
            upside = d15.getValue();
            
            if(upside == 'O'){
                track15[0] += 1;
            }
            if(upside == 'B'){
                track15[1] += 1;
            }
            if(upside == 'A'){
                track15[3] += 1;
            }
            if(upside == 'J'){
                track15[5] += 1;
            }
        }
        assertEquals(.3413, (track15[0]/numTimes), .1);
        assertEquals(.3413, (track15[1]/numTimes), .1);
        assertEquals(.1666, (track15[3]/numTimes), .1);
        assertEquals(.1666, (track15[5]/numTimes), .1);
}
    @Test
    public void testWrongNumberOfCharactersTooFewException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/wrongCharNumberLess.dat");
            fail("Do not throw BadFileFormatException");
        }
        catch(BadFileFormatException ex)
        {
        }
    }
    
    @Test
    public void testWrongNumberOfCharactersTooManyException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/wrongCharNumberMore.dat");
            fail("Do not throw BadFileFormatException");
        }
        catch(BadFileFormatException ex)
        {
        }
    }
    
    @Test
    public void testNonLetterNumbersException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/nonLetterNumbers.dat");
            fail("Do not throw BadFileFormatException");
        }
        catch(BadFileFormatException ex)
        {
            
        }
    }
    
    @Test
    public void testNonLetterMarksException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/nonLetterMarks.dat");
            fail("Do not throw BadFileFormatException");
        }
        catch(BadFileFormatException ex)
        {
        }
    }
    
    @Test
    public void testHashTagsAndBlank() throws IOException, FileNotFoundException, BadFileFormatException
    {
        DiceManager a = new DiceManager("src/dataFiles/hashTagsAndBlank.dat");
        assertEquals('a',a.getDie(0).getValue());
        assertEquals('b',a.getDie(1).getValue());
        assertEquals('c',a.getDie(2).getValue());
        assertEquals('d',a.getDie(3).getValue());
    }
    
    @Test
    public void testTooFewRowsException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/tooFewRows.dat");
            fail("Do not throw BadFileFormatException");
        }
        catch(BadFileFormatException ex)
        {
            
        }
    }
    
        @Test
    public void testFileNotFoundException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/doesNotExist.dat");
            fail("Do not throw FileNotFoundException");
        }
        catch(FileNotFoundException ex)
        {
            
        }
    }
    
    @Test
    public void testTooManyRowsException() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/tooManyRows.dat");
            fail("Do not throw BadFileFormatException");
        }
        catch(BadFileFormatException ex)
        {
            
        }
    }
    
    @Test
    public void test1Qu() throws IOException, FileNotFoundException, BadFileFormatException
    {
        DiceManager a = new DiceManager("src/dataFiles/1Qu.dat");
        assertEquals('q', a.getDie(0).getValue());
    }
    
    @Test
    public void testAllQu() throws IOException, FileNotFoundException, BadFileFormatException
    {
            DiceManager a = new DiceManager("src/dataFiles/16RowsQu.dat");
            char b = a.getDie(1).getValue();
            assertEquals('q', b);
            char c = a.getDie(2).getValue();
            assertEquals('q', c);
            char d = a.getDie(3).getValue();
            assertEquals('q', d);
    }
    
    @Test
    public void testGetDieOutOfBoundGreaterThan15Exception() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/boggle.dat");
            Die die = a.getDie(16);
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
    @Test
    public void testGetDieOutOfBoundLessThan0Exception() throws IOException, FileNotFoundException, BadFileFormatException
    {
        try
        {
            DiceManager a = new DiceManager("src/dataFiles/boggle.dat");
            Die die = a.getDie(-1);
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
}
