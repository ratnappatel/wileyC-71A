package com.wiley.myonlineshopsolution;

public class Product {
   
    private double regularPrice;
   
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
    // Method that will be overridden
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