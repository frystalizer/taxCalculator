package com.tanle.tax;

import java.math.BigDecimal;

public class IncomeRange {
	
	public IncomeRange(BigDecimal min, BigDecimal max) {
		this.min = min;
		this.max = max;
	}

	private BigDecimal min;
	private BigDecimal max;
	public BigDecimal getMin() {
		return min;
	}
	public void setMin(BigDecimal min) {
		this.min = min;
	}
	public BigDecimal getMax() {
		return max;
	}
	public void setMax(BigDecimal max) {
		this.max = max;
	}
	
}
