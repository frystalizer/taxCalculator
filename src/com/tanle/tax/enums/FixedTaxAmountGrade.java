package com.tanle.tax.enums;

import java.math.BigDecimal;

import com.tanle.tax.constants.TaxConstants;

public enum FixedTaxAmountGrade {
	
	ONE(TaxConstants._0),
	TWO(TaxConstants._250_000),
	THREE(TaxConstants._750_000),
	FOUR(TaxConstants._1_950_000),
	FIVE(TaxConstants._4_750_000),
	SIX(TaxConstants._9_750_000),
	SEVEN(TaxConstants._18_150_000);
	
	private BigDecimal amount;
	
	FixedTaxAmountGrade(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
