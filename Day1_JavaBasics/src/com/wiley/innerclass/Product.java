package com.wiley.innerclass;

public abstract class Product {
	String name;
	double price;
	String desc;
	public abstract void calc_sale_price();
	
}

// why product should become base class to any class : code-reusability
/* inheritance can help to improve [add additional functionality]
an existing application getter/setter ,initialization
*/
class Electronics extends Product
{

	public void calc_sale_price() {
	
	}
	
}
class Books
{
	
}

class Apperale
{
	
}