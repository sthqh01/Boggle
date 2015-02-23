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
public class BoardTest 
{
    @Test
    public void testMakeFixedBoard() throws IOException, FileNotFoundException, BadFileFormatException
    {
        DiceManager dm = new DiceManager("src/dataFiles/boardFixedBoardTest.dat");
        Board boa = Board.makeFixedBoard(dm);
        char[] test = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p'};
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
            {
                int check = i*4 + j;
                Location loc = new Location(i,j);
                char testChar = test[check];
                assertEquals(boa.getValue(loc),testChar);
            }
        assertEquals("abcd\nefgh\nijkl\nmnop", boa.toString());
    }
    
    @Test
    public void testMakeRandomBoard() throws IOException, FileNotFoundException, BadFileFormatException
    {
        DiceManager dm = new DiceManager("src/dataFiles/boggle.dat");
        int[] track = new int[16];
        double numTimes = 10000.0;
        for(int i = 0; i<numTimes;i++)
        {
            Board boa = Board.makeFixedBoard(dm);
            Location loc = new Location(0,0);
            char test = boa.getValue(loc);
            if(test == 'a')
                track[0]++;
            if(test == 'b')
                track[1]++;
            if(test == 'c')
                track[2]++;
            if(test == 'd')
                track[3]++;
            if(test == 'e')
                track[4]++;
            if(test == 'f')
                track[5]++;
            if(test == 'g')
                track[6]++;
            if(test == 'h')
                track[7]++;
            if(test == 'i')
                track[8]++;
            if(test == 'j')
                track[9]++;
            if(test == 'k')
                track[10]++;
            if(test == 'l')
                track[11]++;
            if(test == 'm')
                track[12]++;
            if(test == 'n')
                track[13]++;
            if(test == 'o')
                track[14]++;
            if(test == 'p')
                track[15]++;
        }
        assertEquals(0.0625,track[0]/numTimes,0.1);
        assertEquals(0.0625,track[1]/numTimes,0.1);
        assertEquals(0.0625,track[2]/numTimes,0.1);
        assertEquals(0.0625,track[3]/numTimes,0.1);
        assertEquals(0.0625,track[4]/numTimes,0.1);
        assertEquals(0.0625,track[5]/numTimes,0.1);
        assertEquals(0.0625,track[6]/numTimes,0.1);
        assertEquals(0.0625,track[7]/numTimes,0.1);
        assertEquals(0.0625,track[8]/numTimes,0.1);
        assertEquals(0.0625,track[9]/numTimes,0.1);
        assertEquals(0.0625,track[10]/numTimes,0.1);
        assertEquals(0.0625,track[11]/numTimes,0.1);
        assertEquals(0.0625,track[12]/numTimes,0.1);
        assertEquals(0.0625,track[13]/numTimes,0.1);
        assertEquals(0.0625,track[14]/numTimes,0.1);
        assertEquals(0.0625,track[15]/numTimes,0.1);
    }
}
