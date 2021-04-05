
package myaccessmodifierexampleproject;

public class DummyClass {
    
    // Private field. Can be accessed only within the
    // same class.
    private String s1 = "private string";
    
    // Protected field. Can be accessed only within
    // the same package.
    protected String s2 = "protected string";
    
    // Public field. Can be accessed from anybody.
    public String s3 = "public string";
    
    // Default is protected
    String s4 = "string without access modifier";
    
    // Private method. Can be accessed only within the
    // same class.
    private void method1(){
    }
    
    // Protected method. Can be accessed only within
    // the same package.
    protected void method2(){
    }
    
    // Public method. Can be accessed from anybody.
    public void method3(){
    }
    
    // Default is protected.
    void method4(){
    }
}
