
package javax.edi.model.x12.segment;

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
	private Date termsDiscountDueDate;
	
	@EDIElement(fieldName="IDT05", dataElement="351")
	private Integer termsDiscountDaysDue;
	
	@EDIElement(fieldName="ITD06", dataElement="446")
	@EDIElementFormat("yyyyMMdd")
	private Date termsNetDueDate;
        
        @EDIElement(fieldName="ITD07")
        private String boilerplate1;
        
        @EDIElement(fieldName="ITD08")
        private String boilerplate2;
        
        @EDIElement(fieldName="ITD09")
        private String boilerplate3;
        
        @EDIElement(fieldName="ITD10")
        private String boilerplate4;
        
        @EDIElement(fieldName="ITD11")
        private String boilerplate5;
        
        @EDIElement(fieldName="ITD12")
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

    /**
     * @return the boilerplate1
     */
    public String getBoilerplate1() {
        return boilerplate1;
    }

    /**
     * @param boilerplate1 the boilerplate1 to set
     */
    public void setBoilerplate1(String boilerplate1) {
        this.boilerplate1 = boilerplate1;
    }

    /**
     * @return the boilerplate2
     */
    public String getBoilerplate2() {
        return boilerplate2;
    }

    /**
     * @param boilerplate2 the boilerplate2 to set
     */
    public void setBoilerplate2(String boilerplate2) {
        this.boilerplate2 = boilerplate2;
    }

    /**
     * @return the boilerplate3
     */
    public String getBoilerplate3() {
        return boilerplate3;
    }

    /**
     * @param boilerplate3 the boilerplate3 to set
     */
    public void setBoilerplate3(String boilerplate3) {
        this.boilerplate3 = boilerplate3;
    }

    /**
     * @return the boilerplate4
     */
    public String getBoilerplate4() {
        return boilerplate4;
    }

    /**
     * @param boilerplate4 the boilerplate4 to set
     */
    public void setBoilerplate4(String boilerplate4) {
        this.boilerplate4 = boilerplate4;
    }

    /**
     * @return the boilerplate5
     */
    public String getBoilerplate5() {
        return boilerplate5;
    }

    /**
     * @param boilerplate5 the boilerplate5 to set
     */
    public void setBoilerplate5(String boilerplate5) {
        this.boilerplate5 = boilerplate5;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
	

}
