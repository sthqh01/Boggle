package edu.moravian;

import java.util.Random;

/**
 * This class represents a die for the game Boggle.  A Die is
 * rolled when it is created, and "remembers" its face value until
 * rolled again.
 * 
 * @author mebjc01
 */
public class Die
{    
    private final char side1;
    private final char side2;
    private final char side3;
    private final char side4;
    private final char side5;
    private final char side6;
    private char facevalue;
    /**
     * Create a new die and roll it. Note that 'q' should be used
     * when 'qu' is on the die
     *
     * @param side1 the character on the first side
     * @param side2 the character on the second side
     * @param side3 the character on the third side
     * @param side4 the character on the fourth side
     * @param side5 the character on the fifth side
     * @param side6 the character on the sixth side
     * @throws IllegalArgumentException if a non letter is passed
     */
    public Die(char side1, char side2, char side3,
               char side4, char side5, char side6)
    {
        if (Character.isLetter(side1) && Character.isLetter(side2) && Character.isLetter(side3) && Character.isLetter(side4) && Character.isLetter(side5) && Character.isLetter(side6))
        {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.side4 = side4;
            this.side5 = side5;
            this.side6 = side6;
            roll();
        }
        else
        {
            throw new IllegalArgumentException("A non-letter is passed");
        }
    }

    /**
     * Roll the die.
     */
    public void roll()
    {
        Random rand = new Random();
        int randomNum = rand.nextInt(6);
        if (randomNum == 1)
        {
            facevalue = side1;
        }
        else if (randomNum == 2)
        {
            facevalue = side2;
        }
        else if (randomNum == 3)
        {
            facevalue = side3;
        }
        else if (randomNum == 4)
        {
            facevalue = side4;
        }
        else if (randomNum == 5)
        {
            facevalue = side5;
        }
        else
        {
            facevalue = side6;
        }
    }

    /**
     * Get the character "face up" on the die after the last roll.  Note
     * that 'q' will be returned when 'qu' is showing.
     * @return the character showing after the last roll.
     */
    public char getValue()
    {
        return facevalue;
    }
}
