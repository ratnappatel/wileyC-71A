package com.wiley.myonlineshop;
public class Product {
   
    private double regularPrice;
    //imaging any no.of common property required by any product
   
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
    // Method that will be overridden abstract method
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