package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="PRF")
public class PurchaseOrderReference {

	@EDIElement(fieldName="PRF01")
	@Size(min=1, max=22)
	private String purchaseOrderNumber;
        
        private String prf2;
        
        private String prf3;
        
        private String prf4;
        
        private String prf5;
        
        private String alternativePurchaseOrderPlacement;

	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

    /**
     * @return the prf2
     */
    public String getPrf2() {
        return prf2;
    }

    /**
     * @param prf2 the prf2 to set
     */
    public void setPrf2(String prf2) {
        this.prf2 = prf2;
    }

    /**
     * @return the prf3
     */
    public String getPrf3() {
        return prf3;
    }

    /**
     * @param prf3 the prf3 to set
     */
    public void setPrf3(String prf3) {
        this.prf3 = prf3;
    }

    /**
     * @return the prf4
     */
    public String getPrf4() {
        return prf4;
    }

    /**
     * @param prf4 the prf4 to set
     */
    public void setPrf4(String prf4) {
        this.prf4 = prf4;
    }

    /**
     * @return the prf5
     */
    public String getPrf5() {
        return prf5;
    }

    /**
     * @param prf5 the prf5 to set
     */
    public void setPrf5(String prf5) {
        this.prf5 = prf5;
    }

    /**
     * @return the alternativePurchaseOrderPlacement
     */
    public String getAlternativePurchaseOrderPlacement() {
        return alternativePurchaseOrderPlacement;
    }

    /**
     * @param alternativePurchaseOrderPlacement the alternativePurchaseOrderPlacement to set
     */
    public void setAlternativePurchaseOrderPlacement(String alternativePurchaseOrderPlacement) {
        this.alternativePurchaseOrderPlacement = alternativePurchaseOrderPlacement;
    }

}
