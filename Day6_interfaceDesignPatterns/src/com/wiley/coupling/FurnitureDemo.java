package com.wiley.coupling;


//titght coupling 
public class FurnitureDemo {

	public static void main(String[] args) {
		Table t1=new Table(12, 12, 12, "Sheesham");
		t1.getPrice();
	}

}class SteelItem{}

class WoodenItem
{
	int kg;
	int price;
	String type;
	public int priceRange()
	{
		if(type.equals("Sheesham"))
			price=2000;
		else
				price=1100;
		return price;
	}
	
}
class Table
{
	int length;
	int width;
	int height;
	WoodenItem wType=new WoodenItem();
	public Table(int length, int width, int height,String type) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		wType.type=type;
	}
	public void getPrice()
	{
		wType.kg=(length*width*height)*12;
		int p=wType.priceRange();
		System.out.println("Total Price for Your Customized table is :"+wType.kg*p);
		
	}
	
}