package javax.edi.model.x12.v5010.segment;

import java.math.BigDecimal;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="AMT")
public class MonetaryAmountInformation {

	@EDIElement(fieldName="AMT01", dataElement="522")
	@NotNull
	@Size(min=1,max=3)
	private String amountQualifierCode;
	
	@EDIElement(fieldName="AMT02", dataElement="782")
	@NotNull
	@Size(min=1,max=18)
	private BigDecimal monetaryAmount;

	public String getAmountQualifierCode() {
		return amountQualifierCode;
	}

	public void setAmountQualifierCode(String amountQualifierCode) {
		this.amountQualifierCode = amountQualifierCode;
	}

	public BigDecimal getMonetaryAmount() {
		return monetaryAmount;
	}

	public void setMonetaryAmount(BigDecimal monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}
	
	
}
