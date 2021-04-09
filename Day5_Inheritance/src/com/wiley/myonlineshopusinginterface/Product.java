
package com.wiley.myonlineshopusinginterface;

public class Product implements ProductInterface{
    
    private double regularPrice;
    
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    // Implement the methods of the ProductInterface
    public double computeSalePrice(){
        return 0;
    }
    
    public double getRegularPrice() {
        return regularPrice;
    }
    
    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
}





