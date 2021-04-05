
package mynewpackage;

//Import DummyClass
import myaccessmodifierexampleproject.DummyClass;

public class DummyClass2 {
    
    public DummyClass2() {
        
        DummyClass t = new DummyClass();
        
        // Comipler error expected
        System.out.println("s1 = " + t.s1);  // accessing private variable of DummayClass class
        System.out.println("s2 = " + t.s2);  // accessing protected variable
        System.out.println("s4 = " + t.s4);  // accessing default access modifer variable
        t.method1();  // calling private method of DummyClass class
        t.method2();  // calling protected method
        t.method4();  // calling default access modifer method
        
        // No compile error expected
        System.out.println("s3 = " + t.s3);  // accessing public variable
        t.method3();  // calling public method
    }
    
}