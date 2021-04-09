
package com.wiley.myonlineshop;

public class Electronics extends Product{
   
    private String manufacturer; //imagine all possible fields
   
    /** Creates a new instance of Electronics */
    public Electronics(double regularPrice,
            String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }
   
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.6;
    }
   
    public String getManufacturer() {
        return manufacturer;
    }
   
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
   
}