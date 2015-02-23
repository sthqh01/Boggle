package edu.moravian;

import java.util.LinkedList;

/**
 * This class keeps track of which locations of the board are
 * currently being used (marked), and based on this information
 * provides iterable lists of neighbors.
 * 
 * @author mebjc01
 */
public class BoardMarks
{
    boolean[][] marked;
    /**
     * Create a new instance with all locations unmarked.
     */
    public BoardMarks()
    {
        marked = new boolean[4][4];
    }

    /**
     * Mark the specified location
     * @param loc the location to mark
     * @throws IllegalStateException if the location is already marked.
     */
    public void mark(Location loc)
    {
        if(!marked[loc.getRow()][loc.getCol()])
        {
            marked[loc.getRow()][loc.getCol()] = true;
        }
        else
        {
            throw new IllegalStateException("The location is already marked");
        }
    }

    /**
     * Unmark the specified location
     * @param loc the location to unmark
     * @throws IllegalStateException if the location is not marked
     */
    public void unmark(Location loc)
    {
        if(marked[loc.getRow()][loc.getCol()])
        {
            marked[loc.getRow()][loc.getCol()] = false;
        }
        else
        {
            throw new IllegalStateException("The location is not marked");
        }
               
    }

    /**
     * Get an iterable "list" of unmarked neighbors.  This method is intended to
     * be used with the for each construct: for(Location l : b.getNeighbors(loc))
     *
     * @param loc the location to get neighbors for
     * @return an iterable list of neighbors (possibly empty)
     */
    public Iterable<Location> getNeighbors(Location loc)
    {
        LinkedList<Location> ret = new LinkedList<Location>();
        int initRow, endRow, initCol, endCol;
        //Determine init row of 3x3 to find neightbors
        if (loc.getRow()==0)
        {
            initRow = loc.getRow();
        }
        else
        {
            initRow = loc.getRow()-1;
        }
        //Determine end row of 3x3 to find neightbors
        if (loc.getRow() == 3)
        {
            endRow = loc.getRow();
        }
        else
        {
            endRow = loc.getRow()+1;
        }
        //Determine init col of 3x3 to find neightbors
        if (loc.getCol() == 0)
        {
            initCol = loc.getCol();
        }
        else
        {
            initCol = loc.getCol()-1;
        }
        //Determine end col of 3x3 to find neightbors
        if (loc.getCol() == 3)
        {
            endCol = loc.getCol();
        }
        else
        {
            endCol = loc.getCol()+1;
        }
        //Check for neightbors within 3x3 cells
        for (int i = initRow; i < endRow + 1; i++)
        {
            for(int j = initCol; j < endCol + 1; j++)
            {
                if(i == loc.getRow() && j ==loc.getCol())
                {
                    continue;
                }
                else
                {
                    if (marked[i][j] == false)
                    {
                        Location a = new Location(i,j);
                        ret.add(a);
                    }
                }
            }
        }
        return ret;
    }
}
