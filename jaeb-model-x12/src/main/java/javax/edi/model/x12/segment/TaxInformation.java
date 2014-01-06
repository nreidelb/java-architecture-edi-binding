/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

/**
 *
 * @author nreidelb
 */
@EDISegment(tag="TXI")
public class TaxInformation {
    
    @EDIElement(fieldName="TXI01", dataElement="963")
    @Size(min = 2, max = 2)
    private String taxTypeCode;
    
    @EDIElement(fieldName="TXI01", dataElement="963")
    @Size(min = 1, max = 11)
    private String monetaryAmount;

    /**
     * @return the monetaryAmount
     */
    public String getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * @param monetaryAmount the monetaryAmount to set
     */
    public void setMonetaryAmount(String monetaryAmount) {
        this.monetaryAmount = monetaryAmount;
    }

    /**
     * @return the taxTypeCode
     */
    public String getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * @param taxTypeCode the taxTypeCode to set
     */
    public void setTaxTypeCode(String taxTypeCode) {
        this.taxTypeCode = taxTypeCode;
    }
    
}
