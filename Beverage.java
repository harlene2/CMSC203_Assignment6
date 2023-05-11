/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: This program helps the user diagnose there wifi problems. 
 * Due: 05/11/2023
   Print your Name here: Harlene Kaur
*/
public abstract class Beverage {
	
	String bevName;
	Type type;
	DrinkSizes size;
	final double BASE_PRICE = 2.0;
	final double SIZE_PRICE = 1.0;
	
	public Beverage(String b, Type t, DrinkSizes s) {
		
		bevName = b;
		type = t;
		size = s;
		
	}
	
	public abstract double calcPrice();

	
	public String toString() {
		
		return bevName + "," + size;
		
	}
	
	public boolean equals(Beverage bev) {
		
		if(bevName.equals(bev.bevName) && type == bev.type && size == bev.size)
			
			return true;
		
		else
			
			return false;
		
	}
	
	public String getBevName() {
		
		return bevName;
		
	}
	
	public Type getType() {
		
		return type;
		
	}
	
	public DrinkSizes getSize() {
		
		return size;
		
	}
	
	public double getBasePrice() {
		
		return BASE_PRICE;
		
	}
	
	public double addSizePrice() {
		
		if(size == DrinkSizes.SMALL)
			
			return BASE_PRICE;
		
		else if(size == DrinkSizes.MEDIUM)
			
			return BASE_PRICE + SIZE_PRICE;
		
		else
			
			return BASE_PRICE + 2 * SIZE_PRICE;
		
	}
	
	

}