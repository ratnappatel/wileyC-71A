
package com.wiley.myonlineshopabstract;

public abstract class Product {
    
    private double regularPrice;
    
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    // Abstract method
    public abstract double computeSalePrice();

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
}
