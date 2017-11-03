package com.tanle.tax.enums;

import static com.tanle.tax.constants.TaxConstants.*;

import com.tanle.tax.IncomeRange;

public enum IncomeGrade {

	GRADE_ONE(new IncomeRange(_0, _5_0000_000)),
	GRADE_TWO(new IncomeRange(_5_0000_000, _10_0000_000)),
	GRADE_THREE(new IncomeRange(_10_0000_000, _18_000_000)),
	GRADE_FOUR(new IncomeRange(_18_000_000, _32_000_000)),
	GRADE_FIVE(new IncomeRange(_32_000_000, _52_000_000)),
	GRADE_SIX(new IncomeRange(_52_000_000, _80_000_000)),
	GRADE_SEVEN(new IncomeRange(_80_000_000, MAX));
	
	private IncomeRange incomeRange;
	
	IncomeGrade(IncomeRange incomeRange) {
		this.incomeRange = incomeRange;
	}

	public IncomeRange getIncomeRange() {
		return incomeRange;
	}

	public void setIncomeRange(IncomeRange incomeRange) {
		this.incomeRange = incomeRange;
	}


}
