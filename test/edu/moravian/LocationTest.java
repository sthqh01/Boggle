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
public class LocationTest 
{
    @Test
    public void testOneLocation()
    {
        Location a = new Location (3,2);
        assertEquals(3,a.getRow());
        assertEquals(2,a.getCol());
    }
    
    @Test
    public void test16Locations()
    {
        int rowCheck = 0;
        for(int i = 0; i < 4; i++)
        {
            int colCheck = 0;
            for(int j = 0; j < 4; j++)
            {
                Location loc = new Location(i,j);
                assertEquals(rowCheck,loc.getRow());
                assertEquals(colCheck,loc.getCol());
                colCheck++;
            }
            rowCheck++;
        }
    }
    
    @Test
    public void testRowLessThan0Exception()
    {
        try
        {
            Location a = new Location(-1,0);
            Location b = new Location(-2,0);
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
    @Test
    public void testRowMoreThan3Exception()
    {
        try
        {
            Location a = new Location(4,0);
            Location b = new Location(5,0);
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
    @Test
    public void testColLessThan0Exception()
    {
        try
        {
            Location a = new Location(0,-1);
            Location b = new Location(0,-2);
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
    @Test
    public void testColMoreThan3Exception()
    {
        try
        {
            Location a = new Location(0,4);
            Location b = new Location(0,5);
            fail("Does not throw any exception");
        }
        catch(IllegalArgumentException ex)
        {
        }
    }
    
    @Test
    public void testGetRow()
    {
        int rowCheck = 0;
        for(int i = 0; i < 4; i++)
        {
            Location a = new Location(i,0);
            assertEquals(rowCheck, a.getRow());
            rowCheck++;
        }
    }
    
    @Test
    public void testGetCol()
    {
        int colCheck = 0;
        for(int i = 0; i < 4; i++)
        {
            Location a = new Location(0,i);
            assertEquals(colCheck, a.getCol());
            colCheck++;
        }
    }
}
