package com.tanle.tax;

import java.math.BigDecimal;

import com.tanle.tax.enums.FixedTaxAmountGrade;
import com.tanle.tax.enums.IncomeGrade;
import com.tanle.tax.enums.TaxPercentageGrade;

public class IncomeTaxCalculator {

	private static final BigDecimal ONE_HUNDRED = new BigDecimal(100);
	
	private static boolean isGradeOne(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_ONE.getIncomeRange().getMax()) <= 0;
	}
	
	private static boolean isGradeTwo(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_TWO.getIncomeRange().getMin()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getIncomeRange().getMax()) <= 0;
	}
	
	private static boolean isGradeThree(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_THREE.getIncomeRange().getMin()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getIncomeRange().getMax()) <= 0;
	}
	
	private static boolean isGradeFour(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_FOUR.getIncomeRange().getMin()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getIncomeRange().getMax()) <= 0;
	}
	
	private static boolean isGradeFive(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_FIVE.getIncomeRange().getMin()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getIncomeRange().getMax()) <= 0;
	}
	
	private static boolean isGradeSix(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_SIX.getIncomeRange().getMin()) > 0 
				&& income.compareTo(IncomeGrade.GRADE_TWO.getIncomeRange().getMax()) <= 0;
	}
	
	private static boolean isGradeSeven(BigDecimal income) {
		return income.compareTo(IncomeGrade.GRADE_SEVEN.getIncomeRange().getMin()) > 0;
	}
	
	public static BigDecimal calculateTax(BigDecimal income) {
		BigDecimal tax = new BigDecimal(0);
		if(isGradeOne(income)) {
			tax = FixedTaxAmountGrade.ONE.getAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_ONE.getIncomeRange().getMin())
							.divide(ONE_HUNDRED)
							.multiply(TaxPercentageGrade.ONE.getPercent()));
		}
		if(isGradeTwo(income)) {
			tax = FixedTaxAmountGrade.TWO.getAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_TWO.getIncomeRange().getMin())
							.divide(ONE_HUNDRED)
							.multiply(TaxPercentageGrade.TWO.getPercent()));
		}
		if(isGradeThree(income)) {
			tax =  FixedTaxAmountGrade.THREE.getAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_THREE.getIncomeRange().getMin())
							.divide(ONE_HUNDRED)
							.multiply(TaxPercentageGrade.THREE.getPercent()));
		}
		if(isGradeFour(income)) {
			tax = FixedTaxAmountGrade.FOUR.getAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_FOUR.getIncomeRange().getMin())
							.divide(ONE_HUNDRED)
							.multiply(TaxPercentageGrade.FOUR.getPercent()));	
		}
		if(isGradeFive(income)) {
			tax = FixedTaxAmountGrade.FIVE.getAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_FIVE.getIncomeRange().getMin())
							.divide(ONE_HUNDRED)
							.multiply(TaxPercentageGrade.FIVE.getPercent()));
		}
		if(isGradeSix(income)) {
			tax = FixedTaxAmountGrade.SIX.getAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_SIX.getIncomeRange().getMin())
							.divide(ONE_HUNDRED)
							.multiply(TaxPercentageGrade.SIX.getPercent()));
		}
		if(isGradeSeven(income)) {
			tax = FixedTaxAmountGrade.SEVEN.getAmount()
					.add(income
							.subtract(IncomeGrade.GRADE_SEVEN.getIncomeRange().getMin())
							.divide(ONE_HUNDRED)
							.multiply(TaxPercentageGrade.SEVEN.getPercent()));
		}
		return tax;
	}
	
}
