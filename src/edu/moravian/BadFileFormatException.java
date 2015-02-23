package edu.moravian;

/**
 * Thrown when the format of the file does not match the expected
 * format.  e.g. a line contains too many or too few elements
 * 
 * @author mebjc01
 */
public class BadFileFormatException extends Exception
{
    public BadFileFormatException(String string)
    {
        super(string);
    }
}
