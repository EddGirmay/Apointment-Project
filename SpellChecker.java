//include appropriate import statements

/**
 * Simple Spellchecker.
 *
 * @author     
 * @version    
 */
public class SpellChecker
{
    String[] dictionary; //spellchecker dictionary
    int numberOfWords; //number of words in the dictionary

    /**
     * SpellChecker Constructor method.
     *
     * @param  size the size of the spellchecker dictionary.   
     */
    public SpellChecker(int number)
    {
        numberOfWords = 0;
        dictionary = new String[number];
    }
    
    /**
     * Add words to the spellchecker dictionary.
     *
     * @param  word  string to add to spellchecker dictionary
     */
    public void addWord(String word)
    {
       //your code goes here
       //you can add a word only if the dictionary has space.
    }

    /**
     * Read a list of words from a file and store 
     * the words in the dictionary. 
     *
     * @param  dictionaryFromFile  path/name of the file from which 
     *         we create the spellchecker dictionary
     */
    public void addWordsFromFile(String dictionaryFromFile) throws FileNotFoundException
    {
       //your code goes here
       //reuse code - call the addWord method as appropriate
    }
  
    /**
     * Check if the dictionary has space to add a new word.
     * 
     * @return true/false the dictionary has available 
     *         space to include new words.
     */
    public boolean checkHasSpace()
    {
      //your code goes here
    }

    /**
     * Check if a given word is contained in the 
     * spellchecker dictionary 
     *
     * @param  word  string to check against spellchecker dictionary
     * @return true/false result of spellcheck
     */
    public boolean isSpelledCorrectly(String word)
    {
       //your code goes here
    }

}
