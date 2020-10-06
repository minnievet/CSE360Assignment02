package cse360assignment02;
/**
 * This is a test of AddingMachine.java to check function. 
 * Ignore if needed.
 * 
 * @author Madeleine Householder
 * @version 1.0
 * @since 2020-10-5
 */
public class test {
	public static void main(String[] args) {
		AddingMachine myCalc = new AddingMachine();
		myCalc.subtract(5);
		myCalc.add(6);
		System.out.println(myCalc.getTotal());
		System.out.println(myCalc.toString());
		myCalc.add(5);
		myCalc.subtract(1);
		System.out.println(myCalc.getTotal());
		System.out.println(myCalc.toString());
		myCalc.clear();
		System.out.println(myCalc.getTotal());
		System.out.println(myCalc.toString());
    }
}
