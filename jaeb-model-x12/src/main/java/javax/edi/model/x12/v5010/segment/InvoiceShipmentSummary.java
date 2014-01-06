package javax.edi.model.x12.v5010.segment;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="ISS")
public class InvoiceShipmentSummary {

	@EDIElement(fieldName="ISS01", dataElement="382")
	@Size(min=1, max=10)
	private BigInteger numberOfUnitsShipped;
	
	@EDIElement(fieldName="ISS02", dataElement="355")
	@Size(min=2, max=2)
	private String unitForMeasurementCode1;
	
	@EDIElement(fieldName="ISS03", dataElement="81")
	@Size(min=1, max=10)
	private BigDecimal weight;
	
	@EDIElement(fieldName="ISS04", dataElement="355")
	@Size(min=2, max=2)
	private String unitForMeasurementCode2;

	public BigInteger getNumberOfUnitsShipped() {
		return numberOfUnitsShipped;
	}

	public void setNumberOfUnitsShipped(BigInteger numberOfUnitsShipped) {
		this.numberOfUnitsShipped = numberOfUnitsShipped;
	}

	public String getUnitForMeasurementCode1() {
		return unitForMeasurementCode1;
	}

	public void setUnitForMeasurementCode1(String unitForMeasurementCode1) {
		this.unitForMeasurementCode1 = unitForMeasurementCode1;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

	public String getUnitForMeasurementCode2() {
		return unitForMeasurementCode2;
	}

	public void setUnitForMeasurementCode2(String unitForMeasurementCode2) {
		this.unitForMeasurementCode2 = unitForMeasurementCode2;
	}
	
	
}
