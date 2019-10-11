/** 
  * A JUnit Test class for testing the Appointment Class.
  * 
  * @author Shvetha Soundararajan
  * @version 09.25.2018
  */

import org.junit.*;
import static org.junit.Assert.*;

public class AppointmentTest
{
  //~ Fields ................................................................
  
  
  private Appointment appointment1;
  private Appointment appointment2;
  
  /**
   * Sets up the test fixture.
   */
  @Before
  public void setUp()
  {
    appointment1 = new Appointment("9pm", "Exam");
    appointment2 = new Appointment(10, "Lab");
  }
  
  /**
   * Tests accessor and mutator for the hour field. 
   */ 
  @Test
  public void testGetSetHour()
  {
    assertEquals(10, appointment2.getHour());
    appointment2.setHour(2);
    assertEquals(2, appointment2.getHour());
  }
  
  /**
   * Tests accessor and mutator for the description field. 
   */
  @Test
  public void testGetSetDescription()
  {
    assertEquals("Lab", appointment2.getDescription());
    appointment2.setDescription("Office Hours");
    assertEquals("Office Hours", appointment2.getDescription());
  }
  
  /**
   * Tests the second constructor.
   */
  @Test
  public void testSecondConstructor()
  {
    Appointment appointment3 = new Appointment("3pm", "CS 211");
    assertEquals(15, appointment3.getHour());
    assertEquals("CS 211", appointment3.getDescription());
  } 
  
  /**
   * Tests the setTime() method. 
   */
  @Test
  public void testSetTime()
  {             
    assertEquals(21, appointment1.getHour());
    assertEquals("Exam", appointment1.getDescription());
    
    appointment1.setTime("12am");
    assertEquals(0, appointment1.getHour());
    
    appointment1.setTime("11am");
    assertEquals(11, appointment1.getHour());
    
    appointment1.setTime("12pm");
    assertEquals(12, appointment1.getHour());
    
    appointment1.setTime("5pm");
    assertEquals(17, appointment1.getHour());        
  }
  
  /**
   * Tests toString() method.  
   */
  @Test
  public void testToString1()
  {
    assertEquals("10am: Lab", appointment2.toString());
    assertEquals("9pm: Exam", appointment1.toString());
  }
  
  /**
   * Tests toString() method. 
   */
  @Test
  public void testToString2()
  {
    appointment2.setHour(0);
    assertEquals("12am: Lab", appointment2.toString());
    
    appointment1.setHour(12);
    assertEquals("12pm: Exam", appointment1.toString()); 
    
  }
}
