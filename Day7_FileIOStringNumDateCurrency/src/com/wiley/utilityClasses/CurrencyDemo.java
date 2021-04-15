
package com.wiley.utilityClasses;

import java.util.Currency;

import java.util.Locale;

public class CurrencyDemo {

	public static void main(String[] args) {
		Locale locale=Locale.getDefault();
		int amount=20000;
		Currency c=Currency.getInstance(locale);
		System.out.println("Using Currency Code : "+amount+"  "+c.getCurrencyCode());
		System.out.println("Using Currency symbol : "+amount+c.getSymbol(locale));
		System.out.println("Using Currency name : "+amount+"  "+c.getDisplayName(locale));
	}
}
