package javax.edi.model.x12.v5010.segment;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.edi.model.x12.v5010.constraint.BigDecimalConstraint.BigDecimalSize;
import javax.edi.model.x12.v5010.constraint.BigIntegerContraint.BigIntegerSize;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="SAC")
public class AllowanceChargeOrService {

	@EDIElement(fieldName="SAC01", dataElement="248")
	@NotNull
	@Size(min=1, max=1)
	private String allowanceChargeIndicator;
	
	@EDIElement(fieldName="SAC02", dataElement="1300")
	@NotNull
	@Size(min=4, max=4)
	private String specialChargeOrAllowanceCode;
	
	@EDIElement(fieldName="SAC03", dataElement="559")
	@Size(min=2, max=2)
	private String agencyQualifierCode;
	
	@EDIElement(fieldName="SAC04", dataElement="1301")
	@Size(min=1, max=10)
	private String agencyCode;
	
	@EDIElementFormat("####.##")
	@EDIElement(fieldName="SAC05", dataElement="610")
	@BigDecimalSize(min=1,max=15)
	private BigDecimal allowanceOrChargeTotalAmount;
	
	@EDIElement(fieldName="SAC06", dataElement="378")
	@Size(min=1, max=1)
	private String allowancePercentQualifier;
	
	@EDIElement(fieldName="SAC07", dataElement="332")
	@Size(min=1, max=6)
	private String percentFormat;
	
	@EDIElement(fieldName="SAC08", dataElement="118")
	@Size(min=1, max=9)
	private String rate;
	
	@EDIElement(fieldName="SAC09", dataElement="355")
	@Size(min=2, max=2)
	private String unitForMeasurementCode;
	
	@EDIElement(fieldName="SAC10", dataElement="380")
	@BigIntegerSize(min=1, max=15)
	private BigInteger quantity1;
	
	@EDIElement(fieldName="SAC11", dataElement="380")
	@BigIntegerSize(min=1, max=15)
	private BigInteger quantity2;
	
	@EDIElement(fieldName="SAC12", dataElement="331")
	@Size(min=2, max=2)
	private String methodOfHandlingCode;
	
	@EDIElement(fieldName="SAC13", dataElement="127")
	@Size(min=1, max=50)
	private String referenceIdentification;
	
	@EDIElement(fieldName="SAC14", dataElement="770")
	@Size(min=1, max=20)
	private String optionNumber;
	
	@EDIElement(fieldName="SAC15", dataElement="352")
	@Size(min=1, max=80)
	private String description;
	
	@EDIElement(fieldName="SAC16", dataElement="819")
	@Size(min=2, max=3)
	private String languageCode;

	public String getAllowanceChargeIndicator() {
		return allowanceChargeIndicator;
	}

	public void setAllowanceChargeIndicator(String allowanceChargeIndicator) {
		this.allowanceChargeIndicator = allowanceChargeIndicator;
	}

	public String getSpecialChargeOrAllowanceCode() {
		return specialChargeOrAllowanceCode;
	}

	public void setSpecialChargeOrAllowanceCode(String specialChargeOrAllowanceCode) {
		this.specialChargeOrAllowanceCode = specialChargeOrAllowanceCode;
	}

	public BigDecimal getAllowanceOrChargeTotalAmount() {
		return allowanceOrChargeTotalAmount;
	}

	public void setAllowanceOrChargeTotalAmount(
			BigDecimal allowanceOrChargeTotalAmount) {
		this.allowanceOrChargeTotalAmount = allowanceOrChargeTotalAmount;
	}

	public String getMethodOfHandlingCode() {
		return methodOfHandlingCode;
	}

	public void setMethodOfHandlingCode(String methodOfHandlingCode) {
		this.methodOfHandlingCode = methodOfHandlingCode;
	}
	
	public String getAgencyQualifierCode() {
		return agencyQualifierCode;
	}

	public void setAgencyQualifierCode(String agencyQualifierCode) {
		this.agencyQualifierCode = agencyQualifierCode;
	}

	public String getAgencyCode() {
		return agencyCode;
	}

	public void setAgencyCode(String agencyCode) {
		this.agencyCode = agencyCode;
	}

	public String getAllowancePercentQualifier() {
		return allowancePercentQualifier;
	}

	public void setAllowancePercentQualifier(String allowancePercentQualifier) {
		this.allowancePercentQualifier = allowancePercentQualifier;
	}

	public String getPercentFormat() {
		return percentFormat;
	}

	public void setPercentFormat(String percentFormat) {
		this.percentFormat = percentFormat;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getUnitForMeasurementCode() {
		return unitForMeasurementCode;
	}

	public void setUnitForMeasurementCode(String unitForMeasurementCode) {
		this.unitForMeasurementCode = unitForMeasurementCode;
	}

	public BigInteger getQuantity1() {
		return quantity1;
	}

	public void setQuantity1(BigInteger quantity1) {
		this.quantity1 = quantity1;
	}

	public BigInteger getQuantity2() {
		return quantity2;
	}

	public void setQuantity2(BigInteger quantity2) {
		this.quantity2 = quantity2;
	}

	public String getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}

	public String getOptionNumber() {
		return optionNumber;
	}

	public void setOptionNumber(String optionNumber) {
		this.optionNumber = optionNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	@Override
	public String toString() {
		return "AllowanceChargeOrService [allowanceChargeIndicator="
				+ allowanceChargeIndicator + ", specialChargeOrAllowanceCode="
				+ specialChargeOrAllowanceCode
				+ ", allowanceOrChargeTotalAmount="
				+ allowanceOrChargeTotalAmount + ", methodOfHandlingCode="
				+ methodOfHandlingCode + "]";
	}


}
