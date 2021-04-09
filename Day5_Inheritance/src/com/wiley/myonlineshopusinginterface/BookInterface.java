
package com.wiley.myonlineshopusinginterface;

public interface BookInterface extends ProductInterface {  
    public String getPublisher();
    public void setPublisher(String publisher);
    public int getYearPublished();
    public void setYearPublished(int yearPublished);
}
