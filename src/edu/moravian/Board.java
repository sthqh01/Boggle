package edu.moravian;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A board is an immutable object that represents one game board of
 * Boggle.
 *
 * @author mebjc01
 */
public class Board
{
    private ArrayList<Die> board = new ArrayList<Die>();
    /**
     * Place the 16 dice into the board.  No shuffle or roll
     * @param dice the dice to add
     */
    private Board(DiceManager dice, boolean randomize)
    {
        if(randomize == true)
        {
            for (int i = 0; i < 16; i++)
            {
                board.add(dice.getDie(i));
            }
            Collections.shuffle(board);
        }
        else
        {
            for (int i = 0; i < 16; i++)
            {
                board.add(dice.getDie(i));
            }
        }
    }

    /**
     * Create a game board from the collection of dice provided.
     * The board will contain all the dice exactly once, each in
     * a random position on the board.  Each die will be rolled.
     *
     * @param dice the collection of dice to use.
     * @return the board randomly filled with rolled dice.
     */
    public static Board makeRandomBoard(DiceManager dice)
    {
        return new Board(dice, true);
    }

    /**
     * Create a game board from the collection of dice provided.
     * The board will contain all the dice "in order" from the top
     * left and working row-by-row to the bottom right.
     *
     * @param dice the collection of dice to use.
     * @return the board filled with unrolled dice in order.
     */
    public static Board makeFixedBoard(DiceManager dice)
    {
        return new Board(dice, false);
    }

    /**
     * Get the value in the specified row or column.  Note that this will
     * return 'q' if the value is 'qu'
     * 
     * @param loc the location to consider
     * @return the character shown in the specified row or column
     */
    public char getValue(Location loc)
    {
        int index = loc.getRow()*4 + loc.getCol();
        return board.get(index).getValue();
    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < board.size(); i++)
        {
            if(i == 4 || i == 8 || i == 12)
            {
                str.append("\n");
            }
            Die a = board.get(i);
            char b = a.getValue();
            str.append(b);
        }
        return str.toString();
    }
}
