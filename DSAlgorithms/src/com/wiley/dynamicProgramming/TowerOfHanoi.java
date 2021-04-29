package com.wiley.dynamicProgramming;

public class TowerOfHanoi {
	static int loop=0;
	static void towerOfHanoi(int n, char from_rod, char to_rod, char helper_rod)
    {
		loop++;
        if (n == 1)
        {
            System.out.println("Take disk 1 from rod " +  from_rod + " to rod " + to_rod);
            System.out.println("===================================================");
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }
 
    public static void main(String args[])
    {
        int n = 5;
        towerOfHanoi(n,'A','C', 'B');
        System.out.println("\n\nTotal No. of Loop Taken To Solve :"+loop);
    }
 
}
