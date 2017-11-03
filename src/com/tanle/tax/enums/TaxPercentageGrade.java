package com.tanle.tax.enums;

import java.math.BigDecimal;

import com.tanle.tax.constants.TaxConstants;

public enum TaxPercentageGrade {
	
	ONE(TaxConstants._5),
	TWO(TaxConstants._10),
	THREE(TaxConstants._15),
	FOUR(TaxConstants._20),
	FIVE(TaxConstants._25),
	SIX(TaxConstants._30),
	SEVEN(TaxConstants._35);
	
	TaxPercentageGrade(BigDecimal percent) {
		this.percent = percent;
	}
	
	private BigDecimal percent;

	public BigDecimal getPercent() {
		return percent;
	}

	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}
}
