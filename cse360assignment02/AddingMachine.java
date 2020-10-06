package cse360assignment02;

/**
* 360 Assignment 01 java example class Adding Machine
*
* @author  Gaurav Vipat
* @version 1.0
* @since   10.05.2020
*/
public class AddingMachine {

  private int total; // int to track total
  private String history = "";
  
  /**
   * Adding machine contrsuctor initializes total to 0
   * @param none
   * @return none
   */
  public AddingMachine () {

	total = 0;  // not needed - included for clarity
	history = "0";
  }
  
  /**
   * Accessor method for private total variable
   * @param none
   * @return total
   */
  public int getTotal () {

    return total;
  }
  
  /**
   * Add method adds param to total and updates history
   * @param value some integer
   * @return none
   */
  public void add (int value) {

	total += value;
	history = history + " + " + value;
  }

  /**
   * Subtract method subtracts param from total
   * @param value value to subtract
   * @return none
   */
  public void subtract (int value) {

	total -= value;
	history = history + " - " + value;
  }

  /**
   * To string method prinotus out history
   * @param none
   * @return none
   */
  public String toString() {

	return history;
  }

  /**
   * Clear method resets history
   * @param none
   * @return none
   */
  public void clear() {

	history = "0";
  }

  public static void main(String[]  args){}

}