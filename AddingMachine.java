package cse360assignment02;

/**
 * A class that stores an internal value and allows simplistic operations on said value.
 * @author astrogale1
 *
 */
public class AddingMachine {
	  private int total;
	  private String memory;
	  
	  /**
	   * Adding Machine Constructor
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    memory = "0";
	  }
	  
	  /**
	   * Getter accessor for private variable 'total'
	   * @return total	integer value representing the culmination of prior operations
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * Adds given value to the internal total value
	   * @param value	integer value to be added to internal value 'total'
	   */
	  public void add (int value) {
		  total = total + value;
		  memory = memory.concat(" + ".concat(Integer.toString(value)));
	  }

	  /**
	   * Subtracts given value from the internal total value
	   * @param value	integer value to be subtracted from internal value 'total'
	   */
	  public void subtract (int value) {
		  total = total - value;
		  memory = memory.concat(" - ".concat(Integer.toString(value)));
	  }

	  /**
	   * Returns the stored total as a string
	   * @return memory	String value showcasing past operations
	   */
	  public String toString () {
	    return memory;
	  }

	  /**
	   * Resets the total and the memory
	   */
	  public void clear() {
		  total = 0;
		  memory = Integer.toString(total);
	  }
}