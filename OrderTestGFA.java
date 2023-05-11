
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Interface for an Order
 * 
 * @author Farnaz Eivazi
 * @version 8/22/2022
 *
 */

public class OrderTestGFA {
	Order orderOne, orderTwo, orderThree, orderFour;

	//@Before
	public void setUp() throws Exception {
		orderOne = new Order(8, Days.MONDAY, new Customer("Mary", 22));
		orderTwo = new Order(12, Days.SATURDAY, new Customer("John", 45));
		orderThree = new Order(10, Days.SUNDAY, new Customer("Kate", 21));
	}

	//@After
	public void tearDown() throws Exception {
		orderOne = orderTwo = orderThree = null;
	}

	//@Test
	public void testGetBeverage() {
		Coffee cf = new Coffee("regular Coffee", DrinkSizes.SMALL, false, false);
		Alcohol al = new Alcohol("Mohito", DrinkSizes.SMALL, false);
		Smoothie sm1 = new Smoothie("Detox", DrinkSizes.MEDIUM, 1, false);
		Smoothie sm2 = new Smoothie("Detox", DrinkSizes.LARGE, 1, false);

		orderOne.addNewBeverage("regular Coffee", DrinkSizes.SMALL, false, false);
		orderOne.addNewBeverage("Mohito", DrinkSizes.SMALL);
		orderOne.addNewBeverage("Detox", DrinkSizes.MEDIUM, 1, false);
		assertTrue(orderOne.getBeverage(0).equals(cf));
		assertTrue(orderOne.getBeverage(1).equals(al));
		assertTrue(orderOne.getBeverage(2).equals(sm1));
		assertFalse(orderOne.getBeverage(2).equals(sm2));
	}

	private void assertFalse(boolean equals) {
		// TODO Auto-generated method stub
		
	}

	//@Test
	public void testAddNewBeverage() throws NullPointerException {

		assertTrue(orderOne.getTotalItems() == 0);
		orderOne.addNewBeverage("regular Coffee", DrinkSizes.SMALL, false, false);
		assertTrue(orderOne.getBeverage(0).getType().equals(Type.COFFEE));
		orderOne.addNewBeverage("Mohito", DrinkSizes.SMALL);
		assertTrue(orderOne.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderOne.addNewBeverage("Detox", DrinkSizes.MEDIUM, 1, false);
		assertTrue(orderOne.getBeverage(2).getType().equals(Type.SMOOTHIE));
		assertTrue(orderOne.getTotalItems() == 3);

		orderTwo.addNewBeverage("Detox", DrinkSizes.MEDIUM, 4, true);
		assertTrue(orderTwo.getBeverage(0).getType().equals(Type.SMOOTHIE));
		orderTwo.addNewBeverage("Mohito", DrinkSizes.SMALL);
		assertTrue(orderTwo.getBeverage(1).getType().equals(Type.ALCOHOL));
		orderTwo.addNewBeverage("regular Coffee", DrinkSizes.MEDIUM, true, false);
		assertTrue(orderTwo.getBeverage(2).getType().equals(Type.COFFEE));
		assertTrue(orderTwo.getTotalItems() == 3);

	}

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}

	//@Test
	public void testCalcOrderTotal() {
		orderOne.addNewBeverage("regular Coffee", DrinkSizes.SMALL, false, false);
		orderOne.addNewBeverage("Mohito", DrinkSizes.SMALL);
		orderOne.addNewBeverage("Detox", DrinkSizes.MEDIUM, 1, false);

		assertEquals(7.5, orderOne.calcOrderTotal(), .01);

		orderTwo.addNewBeverage("regular Coffee", DrinkSizes.MEDIUM, true, false);
		orderTwo.addNewBeverage("Mohito", DrinkSizes.SMALL);
		orderTwo.addNewBeverage("Detox", DrinkSizes.MEDIUM, 4, true);

		assertEquals(12.6, orderTwo.calcOrderTotal(), .01);

	}

	private void assertEquals(double d, double calcOrderTotal, double e) {
		// TODO Auto-generated method stub
		
	}

}
