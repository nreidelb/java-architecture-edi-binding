
package javax.edi.model.x12.v5010.segment;

import java.util.Date;
import java.util.Set;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
import javax.validation.constraints.Size;


@EDISegment(tag="ITD")
public class TermsOfSale {

	
	@EDIElement(fieldName="ITD01", dataElement="336")
	@Size(min=2, max=2)
	private String termsTypeCode;
	
	
	@EDIElement(fieldName="ITD02", dataElement="333")
	@Size(min=1, max=2)
	private String termsBasisDateCode;
	
	
	@EDIElement(fieldName="ITD03", dataElement="338")
	@Size(min=1, max=6)
	private String termsDiscountPercent;
	
	
	@EDIElement(fieldName="ITD04", dataElement="370")
	@EDIElementFormat("yyyyMMdd")
	@Size(min=8,max=8)
	private Date termsDiscountDueDate;
	
	@EDIElement(fieldName="IDT05", dataElement="351")
	@Size(min=1,max=3)
	private Integer termsDiscountDaysDue;
	
	@EDIElement(fieldName="ITD06", dataElement="446")
	@EDIElementFormat("yyyyMMdd")
	private Date termsNetDueDate;
	
	@EDIElement(fieldName="ITD07", dataElement="386")
	@Size(min=1,max=3)
	private String termsNetDays;
	
	@EDIElement(fieldName="ITD08", dataElement="386")
	private String field8;
	
	@EDIElement(fieldName="ITD09", dataElement="386")
	private String field9;
	
	@EDIElement(fieldName="ITD10", dataElement="386")
	private String field10;
	
	@EDIElement(fieldName="ITD11", dataElement="386")
	private String field11;
	
	@EDIElement(fieldName="ITD12", dataElement="352")
	@Size(min=1,max=80)
	private String description;


	public Integer getTermsDiscountDaysDue() {
		return termsDiscountDaysDue;
	}
	
	public void setTermsDiscountDaysDue(Integer termsDiscountDaysDue) {
		this.termsDiscountDaysDue = termsDiscountDaysDue;
	}
	
	public String getTermsTypeCode() {
		return termsTypeCode;
	}


	public void setTermsTypeCode(String termsTypeCode) {
		this.termsTypeCode = termsTypeCode;
	}


	public String getTermsBasisDateCode() {
		return termsBasisDateCode;
	}


	public void setTermsBasisDateCode(String termsBasisDateCode) {
		this.termsBasisDateCode = termsBasisDateCode;
	}


	public String getTermsDiscountPercent() {
		return termsDiscountPercent;
	}


	public void setTermsDiscountPercent(String termsDiscountPercent) {
		this.termsDiscountPercent = termsDiscountPercent;
	}


	public Date getTermsDiscountDueDate() {
		return termsDiscountDueDate;
	}


	public void setTermsDiscountDueDate(Date termsDiscountDueDate) {
		this.termsDiscountDueDate = termsDiscountDueDate;
	}


	public Date getTermsNetDueDate() {
		return termsNetDueDate;
	}


	public void setTermsNetDueDate(Date termsNetDueDate) {
		this.termsNetDueDate = termsNetDueDate;
	}

	public String getTermsNetDays() {
		return termsNetDays;
	}

	public void setTermsNetDays(String termsNetDays) {
		this.termsNetDays = termsNetDays;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getField8() {
		return field8;
	}

	public void setField8(String field8) {
		this.field8 = field8;
	}

	public String getField9() {
		return field9;
	}

	public void setField9(String field9) {
		this.field9 = field9;
	}

	public String getField10() {
		return field10;
	}

	public void setField10(String field10) {
		this.field10 = field10;
	}

	public String getField11() {
		return field11;
	}

	public void setField11(String field11) {
		this.field11 = field11;
	}
	

}
