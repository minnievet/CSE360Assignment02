package cse360assignment02;

/**
 * The AddingMachine class has one attribute and contains methods getTotal(), add(), subtract()
 * toString(), and clear().
 * 
 * @author Madeleine Householder
 * @version 1.0
 * @since 2020-10-5
 */
public class AddingMachine {
	  private int total;
	  
	  /**
	   * This method initializes total to 0.
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	  }
	  
	  /**
	   * The method getTotal() will return the current value of the variable total.
	   * @return the current value of total
	   */
	  public int getTotal () {
	    return 0;
	  }
	  
	  /**
	   * The method add() will add the variable value to total and store the operation
	   * into the history.
	   * @param This is the value that will be added to total.
	   * @return nothing
	   */
	  public void add (int value) {
	  }

	  /**
	   * The method subtract() will subtract the variable value from total and store the operation
	   * into the history.
	   * @param This is the value that will be subtracted from total.
	   * @return nothing
	   */
	  public void subtract (int value) {
	  }

	  /**
	   * The method toString() will print out the history of operations in AddingMachine.
	   * @return history of transactions in string format
	   */
	  public String toString () {
	    return "";
	  }
	  
	  /**
	   * The method clear() will reset total to 0 and "clear" the history of operations.
	   * @return nothing
	   */
	  public void clear() {
	  }

}