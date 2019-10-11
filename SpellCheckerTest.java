/**
 *  Test class for SpellChecker.
 *
 *  @author Shvetha Soundararajan
 *  @version 09.22.2018
 */
 
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;
import java.util.*;

public class SpellCheckerTest
{
  private SpellChecker checker;
  
  /**
   * Sets up the test fixture.
   */
  @Before
  public void setUp()
  {
    checker = new SpellChecker(200);
  }
  
  /**
   * Tests testAddWord / spelledCorrectly methods.
   */
  @Test
  public void test1()
  {
    String word = "rabbit";
    boolean result = checker.isSpelledCorrectly(word);
    assertFalse(result);
  }
  
  /**
   * Tests testAddWord / method.
   */
  @Test
  public void test2()
  {
    String word = "rabbit";
    checker.addWord(word);
    boolean result = checker.isSpelledCorrectly(word);
    assertTrue(result);
    word = "hat";
    result = checker.isSpelledCorrectly(word);
    assertFalse(result);
  }
  
  
  // ----------------------------------------------------------
  /**
   * Tests isSpelledCorrectly method.
   */
  @Test
  public void test3()
  {
    String word = "rabbit";
    checker.addWord(word);
    boolean result = checker.isSpelledCorrectly(word);
    assertTrue(result);
  }
  
  /**
   * Tests isSpelledCorrectly method.
   */
  
  @Test
  public void test4()
  {
    String word = "hat";
    boolean result = checker.isSpelledCorrectly(word);
    assertFalse(result);
  }
  
  /**
   * Tests isSpelledCorrectly method.
   */
  @Test
  public void test5()
  {
    String word = "hat";
    checker.addWord(word);
    word = "waistcoat";
    checker.addWord(word);
    boolean result = checker.isSpelledCorrectly(word);
    assertTrue(result);
    word = "hat";
    result = checker.isSpelledCorrectly(word);
    assertTrue(result);
  }
  
  /**
   * Tests isSpelledCorrectly method.
   */
  @Test
  public void test6()
  {
    String word = "rabbit";
    checker.addWord(word);
    word = "rabbi";
    boolean result = checker.isSpelledCorrectly(word);
    assertFalse(result);
  }
  
  /**
   * Tests adding too many words.
   */
  @Test
  public void test7()
  {
    checker = new SpellChecker(2);
    
    String word = "boy";
    checker.addWord(word);
    word = "house";
    checker.addWord(word);
    
    word = "sun";
    //try to add third word
    checker.addWord(word);
    assertFalse(checker.checkHasSpace());
  }
  
  
  /**
   * Tests addWordsFromURL method.
   */
  @Test
  public void test8() throws FileNotFoundException
  {
    String fileName = "p2dictionary.txt";
    checker.addWordsFromFile(fileName);
    String word = "rabbit";
    boolean result = checker.isSpelledCorrectly(word);
    assertTrue(result);
    
    word = "would";
    result = checker.isSpelledCorrectly(word);
    assertTrue(result);
    
    word = "as";
    result = checker.isSpelledCorrectly(word);
    assertTrue(result);
    
    word = "bio";
    result = checker.isSpelledCorrectly(word);
    assertFalse(result);
    
  }
  
}