
package com.wiley.myonlineshopabstract;

public abstract class Electronics extends Product{
    
    private String manufacturer;
    
    /** Creates a new instance of Electronics */
    public Electronics(double regularPrice,
            String manufacturer) {
        super(regularPrice);
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
}
