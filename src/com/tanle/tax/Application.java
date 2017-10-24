package com.tanle.tax;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.println("Please input your income.");
		
		Scanner scanner = new Scanner(System.in);
		BigDecimal income = scanner.nextBigDecimal();
		
		scanner.close();
		BigDecimal tax = IncomeTaxCalculator.calculateTax(income);
		DecimalFormat formatter = (DecimalFormat)NumberFormat.getNumberInstance();
		formatter.applyPattern("###,###.###");
				
		System.out.println("Your income is: " + formatter.format(income) + " VND");
		System.out.println("Your tax is: " + formatter.format(tax) + " VND");
		
		
	}
}
