package com.tanle.tax;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class IncomeTaxCalculator {

	private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);
	
	private static boolean isGradeOne(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_ONE.getMaxIncome()) <= 0;
	}
	
	private static boolean isGradeTwo(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_TWO.getMinIncome()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getMaxIncome()) <= 0;
	}
	
	private static boolean isGradeThree(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_THREE.getMinIncome()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getMaxIncome()) <= 0;
	}
	
	private static boolean isGradeFour(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_FOUR.getMinIncome()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getMaxIncome()) <= 0;
	}
	
	private static boolean isGradeFive(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_FIVE.getMinIncome()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getMaxIncome()) <= 0;
	}
	
	private static boolean isGradeSix(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_SIX.getMinIncome()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getMaxIncome()) <= 0;
	}
	
	private static boolean isGradeSeven(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_SEVEN.getMinIncome()) > 0;
	}
	
	private static BigDecimal calculateTax(BigDecimal income) {
		BigDecimal tax = new BigDecimal(0);
		if(isGradeOne(income)) {
			tax = IncomeGrade.GRADE_ONE.getStaticAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_ONE.getMinIncome())
							.divide(ONE_HUNDRED)
							.multiply(IncomeGrade.GRADE_ONE.getPercentage()));
		}
		if(isGradeTwo(income)) {
			tax = IncomeGrade.GRADE_TWO.getStaticAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_TWO.getMinIncome())
							.divide(ONE_HUNDRED)
							.multiply(IncomeGrade.GRADE_TWO.getPercentage()));
		}
		if(isGradeThree(income)) {
			tax = IncomeGrade.GRADE_THREE.getStaticAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_THREE.getMinIncome())
							.divide(ONE_HUNDRED)
							.multiply(IncomeGrade.GRADE_THREE.getPercentage()));
		}
		if(isGradeFour(income)) {
			tax = IncomeGrade.GRADE_FOUR.getStaticAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_FOUR.getMinIncome())
							.divide(ONE_HUNDRED)
							.multiply(IncomeGrade.GRADE_FOUR.getPercentage()));	
		}
		if(isGradeFive(income)) {
			tax = IncomeGrade.GRADE_FIVE.getStaticAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_FIVE.getMinIncome())
							.divide(ONE_HUNDRED)
							.multiply(IncomeGrade.GRADE_FIVE.getPercentage()));
		}
		if(isGradeSix(income)) {
			tax = IncomeGrade.GRADE_SIX.getStaticAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_SIX.getMinIncome())
							.divide(ONE_HUNDRED)
							.multiply(IncomeGrade.GRADE_SIX.getPercentage()));
		}
		if(isGradeSeven(income)) {
			tax = IncomeGrade.GRADE_SEVEN.getStaticAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_SEVEN.getMinIncome())
							.divide(ONE_HUNDRED)
							.multiply(IncomeGrade.GRADE_SEVEN.getPercentage()));
		}
		return tax;
	}
	// -1 lesser than
	// 0 equal to
	// 1 greater than
	public static void main(String[] args) {
		System.out.println("Please input your income.");
		
		Scanner scanner = new Scanner(System.in);
		BigDecimal income = scanner.nextBigDecimal();
		
		scanner.close();
		BigDecimal tax = calculateTax(income);
		DecimalFormat formatter = (DecimalFormat)NumberFormat.getNumberInstance();
		formatter.applyPattern("###,###.###");
				
		System.out.println("Your income is: " + formatter.format(income) + " VND");
		System.out.println("Your tax is: " + formatter.format(tax) + " VND");
		
		
	}
}
