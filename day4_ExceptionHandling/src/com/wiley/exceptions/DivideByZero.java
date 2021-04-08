package com.wiley.exceptions;

public class DivideByZero {    
 
    public static void main(String[] args) {
       int a=0,b=0;
    	
    	int c=0;
    	try
    	{
    		a=Integer.parseInt(args[0]);
        	b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("c = "+c);
			
		}
    	catch(Exception e)
    	{
    		System.out.println(e);   // default exception handler will execute 
    	}
		/*
		 * catch(Exception e) { System.out.println(e.getMessage());
		 * 
		 * if(e instanceof ArithmeticException)
		 * System.out.println("You must enter both argument > 0"); else if(e instanceof
		 * ArrayIndexOutOfBoundsException)
		 * System.out.println("You Must pass atleast Two arguments."); else
		 * System.out.println("You must enter valid nos"); }
		 */
    	finally
    	{
    		System.out.println("I am releasing all unused resources....");
    	}
		/*
		 * catch (ArithmeticException e) {
		 * System.out.println("You must enter both argument > 0"); } catch
		 * (ArrayIndexOutOfBoundsException e) {
		 * System.out.println("You Must pass atleast Two arguments."); } catch
		 * (NumberFormatException e) { System.out.println("You must enter valid nos"); }catch(Excepiton e){System.out.println(e);}
		 */
    	
    	System.out.println("try exiting...");
    	
    	System.out.println("Main Exited....");
    }
   
}
