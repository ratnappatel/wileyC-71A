
package com.wiley.myonlineshopsolution;

public class TV extends Electronics {
   
    int size;
   
    /** Creates a new instance of TV */
    public TV(double regularPrice,
              String manufacturer,
              int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.8;
    }
}