/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: This program helps the user diagnose there wifi problems. 
 * Due: 05/11/2023
   Print your Name here: Harlene Kaur
*/
public class BevShopDriverApp {

	public static void main(String[] args) {

		BevShop shop = new BevShop();

		System.out.println("Creating new order");
		shop.startNewOrder(22, Days.SUNDAY, "Jay", 16);
		System.out.println(shop.getCurrentOrder());
		System.out.println("Adding Mocha and Banana Smoothie to order");
		shop.processCoffeeOrder("Mocha", DrinkSizes.MEDIUM, false, false);
		shop.processSmoothieOrder("Banana Smoothie", DrinkSizes.MEDIUM, 3, false);
		System.out.println(shop.getCurrentOrder());
		System.out.println("Adding Whiskey to order");
		shop.processAlcoholOrder("Whiskey", DrinkSizes.MEDIUM);
		System.out.println(shop.getCurrentOrder());
		System.out.println("");

		System.out.println("Creating new order");
		shop.startNewOrder(22, Days.SUNDAY, "John", 25);
		System.out.println(shop.getCurrentOrder());
		System.out.println("Adding Whiskey, Wine, and Beer to order");
		shop.processAlcoholOrder("Whiskey", DrinkSizes.MEDIUM);
		shop.processAlcoholOrder("Wine", DrinkSizes.SMALL);
		shop.processAlcoholOrder("Beer", DrinkSizes.LARGE);
		System.out.println(shop.getCurrentOrder());
		System.out.println("Adding Vodka to order");
		shop.processAlcoholOrder("Vodka", DrinkSizes.MEDIUM);
		System.out.println(shop.getCurrentOrder());
		System.out.println("Getting total order price");
		System.out.println(shop.totalOrderPrice(shop.getCurrentOrder().getOrderNo()));
		System.out.println("");

		System.out.println("Creating new order");
		shop.startNewOrder(22, Days.SUNDAY, "Emily", 36);
		System.out.println(shop.getCurrentOrder());
		System.out.println("");

		System.out.println("Creating new order");
		shop.startNewOrder(22, Days.SUNDAY, "Becky", 57);
		System.out.println(shop.getCurrentOrder());
		System.out.println("");

		System.out.println(shop);
		shop.sortOrders();
		System.out.println(shop);

	}

}