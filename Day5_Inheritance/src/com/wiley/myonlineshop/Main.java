package com.wiley.myonlineshop;

public class Main {
   
    public static void main(String[] args) {
       
        // Declare and create Product array of size 5
        Product[] pa = new Product[5]; //items
       
        // Create object instances
        pa[0] = new TV(1000, "Samsung", 30);
        pa[1] = new TV(2000, "Sony", 50);
        pa[2] = new MP3Player(250, "Apple", "blue");
        pa[3] = new Book(34, "Sun press", 1992);
        pa[4] = new Product(1986);
       
        // Compute total regular price and total
        // sale price.
        double totalRegularPrice = 0;
        double totalSalePrice = 0;
       
        for (int i=0; i<pa.length; i++){
           
            // Call a method of the super class to get
            // the regular price.
            totalRegularPrice += pa[i].getRegularPrice();
           
            // Since the sale price is computed differently
            // depending on the product type, overriding
            // method of the object instance of the sub-class
            // gets invoked.  This is runtime polymorphic
            // behavior.
            totalSalePrice += pa[i].computeSalePrice();
           
            System.out.println("Item number " + i +
                    ": Type = " + pa[i].getClass().getName() +
                    ", Regular price = " + pa[i].getRegularPrice() +
                    ", Sale price = " + pa[i].computeSalePrice());
        }
        System.out.println("totalRegularPrice = " + totalRegularPrice);
        System.out.println("totalSalePrice = " + totalSalePrice);
    }
   
}