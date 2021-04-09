
package com.wiley.myonlineshopusinginterface;

public class Cartoon extends Book {
    
    String characterName;
    
    /** Creates a new instance of Cartoon */
    public Cartoon(double regularPrice,
            String publisher,
            int yearPublished,
            String characterName) {
        super(150, "Sun press", 1978);
        this.characterName = characterName;
    }
    
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.4;
    }
    
}
