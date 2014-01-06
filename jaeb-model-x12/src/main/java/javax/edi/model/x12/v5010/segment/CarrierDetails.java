package javax.edi.model.x12.v5010.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="CAD")
public class CarrierDetails {

	@EDIElement(fieldName="CAD01", dataElement="91")
	@Size(min=1, max=2)
	private String transportMethodCode;
	
	@EDIElement(fieldName="CAD02", dataElement="350")
	private String cad02;
	
	@EDIElement(fieldName="CAD03", dataElement="350")
	private String cad03;
	
	@EDIElement(fieldName="CAD04", dataElement="140")
	@Size(min=2, max=4)
	private String standardCarrierAlphaCode;
	
	@EDIElement(fieldName="CAD05", dataElement="387")
	@Size(min=1, max=35)
	private String routing;

	@EDIElement(fieldName="CAD06", dataElement="350")
	private String cad06;
	
	@EDIElement(fieldName="CAD07", dataElement="128")
	@Size(min=2, max=3)
	private String identificationQualifier;
	
	@EDIElement(fieldName="CAD08", dataElement="127")
	@Size(min=1, max=50)
	private String referenceIdentification;

	public String getTransportMethodCode() {
		return transportMethodCode;
	}

	public void setTransportMethodCode(String transportMethodCode) {
		this.transportMethodCode = transportMethodCode;
	}

	public String getCad02() {
		return cad02;
	}

	public void setCad02(String cad02) {
		this.cad02 = cad02;
	}

	public String getCad03() {
		return cad03;
	}

	public void setCad03(String cad03) {
		this.cad03 = cad03;
	}

	public String getStandardCarrierAlphaCode() {
		return standardCarrierAlphaCode;
	}

	public void setStandardCarrierAlphaCode(String standardCarrierAlphaCode) {
		this.standardCarrierAlphaCode = standardCarrierAlphaCode;
	}

	public String getRouting() {
		return routing;
	}

	public void setRouting(String routing) {
		this.routing = routing;
	}

	public String getCad06() {
		return cad06;
	}

	public void setCad06(String cad06) {
		this.cad06 = cad06;
	}

	public String getIdentificationQualifier() {
		return identificationQualifier;
	}

	public void setIdentificationQualifier(String identificationQualifier) {
		this.identificationQualifier = identificationQualifier;
	}

	public String getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(String referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}
	
	
}
