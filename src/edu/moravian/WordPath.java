package edu.moravian;

/**
 * This class represents the characters as they are added and
 * removed during a search of the board.
 * 
 * @author mebjc01
 */
public class WordPath
{
    StringBuffer word = new StringBuffer();

    /**
     * Create a new instance with no characters
     */
    public WordPath()
    {
    }

    /**
     * Push the character onto the end of the word.  'q' will be added
     * as a "qu"
     * @param ch the character to add
     * 
     * @throws IllegalStateException if the path contains 16 letters
     */
    public void push(char ch)
    {
        if (word.length() > 15)
        {
            throw new IllegalStateException("The path contains more than 15 letters");
        }
        word.append(ch);
    }

    /**
     * Remove the last character from the word.  "qu" will be removed
     * together.
     *
     * @throws IllegalStateException if there are no letters currently
     *  in the path.
     */
    public void pop()
    {
        if (word.length() == 0)
        {
            throw new IllegalStateException("The string is currently empty");
        }
        word.deleteCharAt(word.length()-1);
    }

    /**
     * Get the word represented by this path.
     *
     * @return the current word (possibly the empty string)
     */
    public String getWord()
    {
        StringBuilder word2 = new StringBuilder();
        for (int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == 'q')
            {
                word2.append('q');
                word2.append('u');
            }
            else if(word.charAt(i) == 'Q')
            {
                word2.append('Q');
                word2.append('U');
            }
            else
            {
                char letter = word.charAt(i);
                word2.append(letter);
            }
        }
        return word2.toString();
    }
}
