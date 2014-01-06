package javax.edi.model.x12.v5010.segment;

import java.math.BigDecimal;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="TXI")
public class TaxInformation {

	@EDIElement(fieldName="TXI01", dataElement="963")
	@Size(min=2, max=2)
	private String taxTypeCode;
	
	@EDIElement(fieldName="TXI02", dataElement="782")
	@Size(min=1, max=18)
	private BigDecimal monetaryAmount;
	
	@EDIElement(fieldName="TXI03", dataElement="954")
	@Size(min=1, max=10)
	private BigDecimal percentageAsDecimal;
	
	@EDIElement(fieldName="TXI04", dataElement="955")
	@Size(min=2, max=2)
	private String taxJurisdictionCodeQualifier;
	
	@EDIElement(fieldName="TXI05", dataElement="956")
	@Size(min=1, max=10)
	private String taxJurisdictionCode;
	
	@EDIElement(fieldName="TXI06", dataElement="956")
	private String txi06;
	
	@EDIElement(fieldName="TXI07", dataElement="956")
	private String txi07;
	
	@EDIElement(fieldName="TXI08", dataElement="828")
	@Size(min=1, max=9)
	private String dollarBasisForPercent;
	
	@EDIElement(fieldName="TXI09", dataElement="325")
	@Size(min=1, max=20)
	private String taxIdentificationNumber;

	public String getTaxTypeCode() {
		return taxTypeCode;
	}

	public void setTaxTypeCode(String taxTypeCode) {
		this.taxTypeCode = taxTypeCode;
	}

	public BigDecimal getMonetaryAmount() {
		return monetaryAmount;
	}

	public void setMonetaryAmount(BigDecimal monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}

	public BigDecimal getPercentageAsDecimal() {
		return percentageAsDecimal;
	}

	public void setPercentageAsDecimal(BigDecimal percentageAsDecimal) {
		this.percentageAsDecimal = percentageAsDecimal;
	}

	public String getTaxJurisdictionCodeQualifier() {
		return taxJurisdictionCodeQualifier;
	}

	public void setTaxJurisdictionCodeQualifier(String taxJurisdictionCodeQualifier) {
		this.taxJurisdictionCodeQualifier = taxJurisdictionCodeQualifier;
	}

	public String getTaxJurisdictionCode() {
		return taxJurisdictionCode;
	}

	public void setTaxJurisdictionCode(String taxJurisdictionCode) {
		this.taxJurisdictionCode = taxJurisdictionCode;
	}

	public String getTxi06() {
		return txi06;
	}

	public void setTxi06(String txi06) {
		this.txi06 = txi06;
	}

	public String getTxi07() {
		return txi07;
	}

	public void setTxi07(String txi07) {
		this.txi07 = txi07;
	}

	public String getDollarBasisForPercent() {
		return dollarBasisForPercent;
	}

	public void setDollarBasisForPercent(String dollarBasisForPercent) {
		this.dollarBasisForPercent = dollarBasisForPercent;
	}

	public String getTaxIdentificationNumber() {
		return taxIdentificationNumber;
	}

	public void setTaxIdentificationNumber(String taxIdentificationNumber) {
		this.taxIdentificationNumber = taxIdentificationNumber;
	}
	
	
}
