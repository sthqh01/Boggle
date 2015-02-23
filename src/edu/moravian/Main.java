package edu.moravian;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author mebjc01
 */
public class Main
{
    public static void main(String[] args) throws IOException, FileNotFoundException, BadFileFormatException
    {
        int sum = 0;
        int numTimes = 10000;
        int average;
        Lexicon lex = new Lexicon("src/dataFiles/words.txt");
        for (int i = 0; i < numTimes; i++)
        {
            DiceManager dm = new DiceManager("src/dataFiles/boggle.dat");
            Board boa = Board.makeRandomBoard(dm);
            Searcher sea = new Searcher(boa, lex);
            sea.search();
            sum += sea.getNumWords();
        }
        System.out.print("Average Number of Words: ");
        System.out.println(average = sum/numTimes);
    }
}
