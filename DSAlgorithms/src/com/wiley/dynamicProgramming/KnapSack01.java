package com.wiley.dynamicProgramming;
import java.util.HashMap;
import java.util.Map;

class KnapSack01
{
	// Values (stored in array `v`)
	// Weights (stored in array `w`)
	// Total number of distinct items `n`
	// Knapsack capacity `W`
	
	public static int knapsack(int[] v, int[] w, int n, int W,
							Map<String, Integer> lookup)
	{
		// base case: Negative capacity
		if (W < 0) {
			return Integer.MIN_VALUE;
		}

		// base case: no items left or capacity becomes 0
		if (n < 0 || W == 0) {
			return 0;
		}

		// construct a unique map key from dynamic elements of the input
		String key = n + "|" + W;
		System.out.println(n+"  |   "+W);

		// if the subproblem is seen for the first time, solve it and
		// store its result in a map
		if (!lookup.containsKey(key))
		{
			// Case 1. Include current item `n` in knapsack (v[n]) and recur
			// for remaining items `n-1` with decreased capacity `W-w[n]`
			int include = v[n] + knapsack(v, w, n - 1, W - w[n], lookup);
			

			// Case 2. Exclude current item `v[n]` from the knapsack and recur for
			// remaining items `n-1`
			
			int exclude = knapsack(v, w, n - 1, W, lookup);

			System.out.println("include : "+include+"  Exclude :"+exclude);
			// assign the max value we get by including or excluding the current item
			lookup.put(key, Integer.max(include, exclude));
		}

		// return solution to the current subproblem
		System.out.println(lookup);
		System.out.println("=====================================================================================");
		return lookup.get(key);
	}

	// 0–1 Knapsack problem
	public static void main(String[] args)
	{
		// input: a set of items, each with a weight and a value
		int[] v = { 20, 5, 10, 40, 15, 25 }; // profit
		int[] w = { 1, 2, 3, 8, 7, 4 }; // weight 

		// knapsack capacity
		int W = 10;

		// create a map to store solutions to a subproblem
		
		System.out.println("Profits { 20, 5, 10, 40, 15, 25 }");
		System.out.println("Weights : { 1, 2, 3, 8, 7, 4 }");
		Map<String, Integer> lookup = new HashMap<>();

		System.out.println("Knapsack value is " +
				knapsack(v, w, v.length - 1, W, lookup));
	}
}