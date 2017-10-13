package com.tanle.tax;

import java.math.BigDecimal;

public enum IncomeGrade {

	GRADE_ONE(new BigDecimal(Double.MIN_VALUE), new BigDecimal(5_0000_000), new BigDecimal(5), new BigDecimal(0)),
	GRADE_TWO(new BigDecimal(5_0000_000), new BigDecimal(10_0000_000), new BigDecimal(10), new BigDecimal(250_000)),
	GRADE_THREE(new BigDecimal(10_0000_000), new BigDecimal(18_000_000), new BigDecimal(15), new BigDecimal(750_000)),
	GRADE_FOUR(new BigDecimal(18_000_000), new BigDecimal(32_000_000), new BigDecimal(20), new BigDecimal(1_950_000)),
	GRADE_FIVE(new BigDecimal(32_000_000), new BigDecimal(52_000_000), new BigDecimal(25), new BigDecimal(4_750_000)),
	GRADE_SIX(new BigDecimal(52_000_000), new BigDecimal(80_000_000), new BigDecimal(30), new BigDecimal(9_750_000)),
	GRADE_SEVEN(new BigDecimal(80_000_000), new BigDecimal(Double.MAX_VALUE),new BigDecimal(35), new BigDecimal(18_150_000));
	
	private BigDecimal minIncome;
	private BigDecimal maxIncome;
	private BigDecimal percentage;
	private BigDecimal staticAmount;
	
	IncomeGrade(BigDecimal minIncome, BigDecimal maxIncome, BigDecimal percentage, BigDecimal staticAmount) {
		this.percentage = percentage;
		this.staticAmount = staticAmount;
		this.minIncome = minIncome;
		this.maxIncome = maxIncome;
	}
	
	public BigDecimal getPercentage() {
		return percentage;
	}
	public void setPercentage(BigDecimal percentage) {
		this.percentage = percentage;
	}
	public BigDecimal getStaticAmount() {
		return staticAmount;
	}
	public void setStaticAmount(BigDecimal staticAmount) {
		this.staticAmount = staticAmount;
	}
	
	public BigDecimal getMinIncome() {
		return minIncome;
	}

	public void setMinIncome(BigDecimal minIncome) {
		this.minIncome = minIncome;
	}

	public BigDecimal getMaxIncome() {
		return maxIncome;
	}

	public void setMaxIncome(BigDecimal maxIncome) {
		this.maxIncome = maxIncome;
	}

}
