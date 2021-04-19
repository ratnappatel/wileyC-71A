package com.wiley.comparators;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductList {

	public static void main(String[] args) {
		
		TreeSet<Product> products=null;
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("How would you like to see product list\n 1. Price Low to High\n 2. Price High To Low");
		int ch=sc.nextInt();
		if(ch==1)
			products=new TreeSet<Product>(new PriceLH());
		else if(ch==2)
			products=new TreeSet<Product>(new PriceHL());
		else
			products=new TreeSet<Product>();
			
		
		products.add(new Product(2, "Grapes", 34.90));
		products.add(new Product(4, "Water Melon", 20.90));
		products.add(new Product(3, "Pineapple", 78.90));
		products.add(new Product(2, "Grapes", 34.90));
		
		
		
		System.out.println(products);
	}

}
class PriceLH implements Comparator<Product>
{

	@Override
	public int compare(Product arg0, Product arg1) {
		return (int) (arg0.getPrice()-arg1.getPrice());
	}
	
}
class PriceHL implements Comparator<Product>{

	@Override
	public int compare(Product arg0, Product arg1) {
		return (int) (arg1.getPrice()-arg0.getPrice());
	}
}