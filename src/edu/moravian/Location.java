package edu.moravian;

/**
 * This simple immutable object represents a location in the board
 * as a row, column pair.
 * 
 * @author mebjc01
 */
public class Location
{
    final int row;
    final int col;
    /**
     * Create an instance from the given values
     *
     * @throws IllegalArgumentException if row or column are outside
     * the range 0 through 3, inclusive.
     * @param row the row to represent
     * @param col the column to represent
     */
    public Location(int row, int col)
    {
        if (row < 0 || row > 3 )
        {
            throw new IllegalArgumentException("Row value out of bounds");
        }
        else if (col < 0 || col > 3)
        {
            throw new IllegalArgumentException("Column value out of bounds");
        }
        this.row = row;
        this.col = col;
    }

    /**
     * Get the column
     * @return an integer between 0 and 3, inclusive
     */
    public int getCol()
    {
        return col;
    }

    /**
     * Get the row
     * @return an integer between - and 3, inclusive
     */
    public int getRow()
    {
        return row;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.row;
        hash = 97 * hash + this.col;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.col != other.col) {
            return false;
        }
        return true;
    }
    
}
