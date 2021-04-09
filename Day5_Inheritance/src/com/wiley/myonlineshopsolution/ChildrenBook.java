
package com.wiley.myonlineshopsolution;

public class ChildrenBook extends Book{
    
    int age; // age this book is written for
    
    /** Creates a new instance of ChildrenBook */
    public ChildrenBook(double regularPrice,
            String publisher,
            int yearPublished,
            int age) {
        super(100, "Sun press", 2002);
        this.age = age;
    }
    
    // Override this method
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }
    
}
