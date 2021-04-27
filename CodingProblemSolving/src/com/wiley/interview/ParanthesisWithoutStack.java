package com.wiley.interview;

import java.util.Arrays;

public class ParanthesisWithoutStack {

			static char findClosing(char c)
			{
				if (c == '(')
					return ')';
				if (c == '{')
					return '}';
				if (c == '[')
					return ']';
				return Character.MIN_VALUE;
			}

			// function to check if parenthesis are
			// balanced.
			static boolean check(char expr[], int n)
			{
				// Base cases
				if (n == 0)
					return true;
				if (n == 1)
					return false;
				if (expr[0] == ')' || expr[0] == '}' || expr[0] == ']')
					return false;

				// Search for closing bracket for first
				// opening bracket.
				char closing = findClosing(expr[0]);

				// count is used to handle cases like
				// "((()))". We basically need to
				// consider matching closing bracket.
				int i, count = 0;
				for (i = 1; i < n; i++) {
					if (expr[i] == expr[0])
						count++;
					if (expr[i] == closing) {
						if (count == 0)
							break;
						count--;
					}
				}

				// If we did not find a closing
				// bracket
				if (i == n)
					return false;

				// If closing bracket was next
				// to open
				if (i == 1)
					return check(Arrays.copyOfRange(expr, i + 1, n), n - 2);
				// If closing bracket was somewhere
				// in middle.
				return check(Arrays.copyOfRange(expr, 1, n), i - 1) && check(Arrays.copyOfRange(expr, (i + 1), n), n - i - 1);
			}

			// Driver code
			public static void main(String[] args)
			{
				char expr[] = "([()])".toCharArray();
				int n = expr.length;
				if (check(expr, n))
					System.out.println("Balanced");
				else
					System.out.println("Not Balanced");
			}
		}


