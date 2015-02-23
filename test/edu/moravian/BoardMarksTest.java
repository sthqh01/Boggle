/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian;

import java.util.ArrayList;
import java.util.Iterator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author danielhuynh
 */
public class BoardMarksTest 
{
    @Test
    public void testGetNeighborsAKnownLocationWithSomeMarks()
    {
        BoardMarks bm = new BoardMarks();
        Location loc = new Location(1,1);
        Location loc1 = new Location(0,0);
        Location loc2 = new Location(0,1);
        Location loc3 = new Location(0,2);
        bm.mark(loc1);
        bm.mark(loc2);
        bm.mark(loc3);
        ArrayList<Location> test = new ArrayList<Location>();
        for(int i = 1; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                Location a = new Location(i,j);
                test.add(a);
            }
        }
        for(Location loca : bm.getNeighbors(loc))
        {
            assertTrue(test.contains(loca));
        }
    }
    
    @Test
    public void testUnmarkNotMarkedException()
    {
        try
        {
            BoardMarks bm = new BoardMarks();
            Location loc = new Location(0,0);
            bm.unmark(loc);
            fail("Does not throw any exception");
        }
        catch(IllegalStateException ex)
        {
        }
    }
    
    @Test
    public void testMarkAlreadyMarkedException()
    {
        try
        {
            BoardMarks bm = new BoardMarks();
            Location loc = new Location(0,0);
            bm.mark(loc);
            bm.mark(loc);
            fail("Does not throw any exception");
        }
        catch(IllegalStateException ex)
        {
        }
    }
    
    @Test
    public void testNewBoardGetNeighborsAtLoc00()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(0,0);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 2; i ++)
        {
            for(int j = 0; j < 2; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    
    @Test
    public void testNewBoardGetNeighborsAtLoc01()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(0,1);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 2; i ++)
        {
            for(int j = 0; j < 3; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    
    @Test
    public void testNewBoardGetNeighborsAtLoc02()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(0,2);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 2; i ++)
        {
            for(int j = 1; j < 4; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    
    @Test
    public void testNewBoardGetNeighborsAtLoc03()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(0,3);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 2; i ++)
        {
            for(int j = 2; j < 3; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
        @Test
    public void testNewBoardGetNeighborsAtLoc10()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(1,0);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 0; j < 2; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    
    @Test
    public void testNewBoardGetNeighborsAtLoc11()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(1,1);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 0; j < 3; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc12()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(1,2);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 1; j < 4; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc13()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(1,3);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 0; i < 3; i ++)
        {
            for(int j = 2; j < 4; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc20()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(2,0);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 1; i < 4; i ++)
        {
            for(int j = 0; j < 2; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc21()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(2,1);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 1; i < 4; i ++)
        {
            for(int j = 0; j < 3; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc22()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(2,2);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 1; i < 4; i ++)
        {
            for(int j = 1; j < 4; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc23()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(2,3);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 1; i < 4; i ++)
        {
            for(int j = 2; j < 4; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc30()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(3,0);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 2; i < 4; i ++)
        {
            for(int j = 0; j < 2; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    
    @Test
    public void testNewBoardGetNeighborsAtLoc31()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(3,1);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 2; i < 4; i ++)
        {
            for(int j = 0; j < 3; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    
    @Test
    public void testNewBoardGetNeighborsAtLoc32()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(3,2);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 2; i < 4; i ++)
        {
            for(int j = 1; j < 4; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }
    @Test
    public void testNewBoardGetNeighborsAtLoc33()
    {
        BoardMarks bm = new BoardMarks();
        Location lo = new Location(3,3);
        Iterator<Location> test = bm.getNeighbors(lo).iterator();
        ArrayList<Location> expects = new ArrayList<Location>();
        for(int i = 2; i < 4; i ++)
        {
            for(int j = 2; j < 4; j++)
            {
                Location loc = new Location(i,j);
                if(!loc.equals(lo))
                {
                    expects.add(loc);
                }
            }
        }
        for(int i = 0; i < expects.size(); i++)
        {
            Location loca = test.next();
            assertTrue(expects.contains(loca));
        }
    }

    @Test
    public void testGetNeighborsOfAllMarks()
    {
        BoardMarks bm = new BoardMarks();
        for(int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Location a = new Location(i,j);
                bm.mark(a);
            }
        }
        for(int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Location a = new Location(i,j);
                ArrayList<Location> test = new ArrayList<Location>();
                for(Location loc : bm.getNeighbors(a))
                {
                    test.add(loc);
                }
                assertEquals(0,test.size());
            }
        }
    }
}
