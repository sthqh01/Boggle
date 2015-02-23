package edu.moravian;

import java.util.ArrayList;

/**
 * This class searches a given board for words in the given lexicon
 * 
 * @author mebjc01
 */
public class Searcher
{
    private ArrayList<String> words = new ArrayList<String>();
    private Board boa;
    private Lexicon lex;
    private int numSearch;

    /**
     * Create a searcher for the specified board and words
     * @param board the board to search
     * @param words the words to search for
     */
    public Searcher(Board board, Lexicon words)
    {
        boa = board;
        lex = words;
        numSearch = 0;
    }

    /**
     * Perform the search and save a list of words found.
     * This method can only be called once per instance.
     * @throws IllegalStateException if the search was already performed
     */
    public void search()
    {
        if(numSearch == 0)
        {
            for(int i = 0; i < 4; i++)
                for(int j = 0; j < 4; j++)
                {
                    BoardMarks m = new BoardMarks();
                    Location l = new Location(i,j);
                    WordPath wp = new WordPath();
                    searchHelper(m, l, wp);
                }
            numSearch++;
        }
        else
        {
            throw new IllegalStateException("The search was already performed!");
        }
    
    }
    
    private void searchHelper(BoardMarks m, Location l, WordPath wp)
    {
        wp.push(boa.getValue(l));
        if(lex.isPrefix(wp.getWord().toLowerCase()))
        {
            if(lex.isWord(wp.getWord().toLowerCase()) && !words.contains(wp.getWord()) && wp.getWord().length()>2)
                words.add(wp.getWord());
            m.mark(l);
            for(Location loc: m.getNeighbors(l))
            {
                searchHelper(m, loc, wp);
            }
            m.unmark(l);
        }
        wp.pop();
    }

    /**
     * Get the words found by the search.  This method should not be called
     * before search() is called.  The intent of this method is to be used
     * in a for each loop: for(String word : searcher.getWords())
     * @return the iterable "list" of words
     * @throws IllegalStateException if this method is called before search
     */
    public Iterable<String> getWords()
    {
        if(numSearch == 0)
            throw new IllegalStateException("You have not run search yet");
        return words;
    }
    
    public int getNumWords()
    {
        if(numSearch == 0)
            throw new IllegalStateException("You have not run search yet");
        return words.size();
    }
}
