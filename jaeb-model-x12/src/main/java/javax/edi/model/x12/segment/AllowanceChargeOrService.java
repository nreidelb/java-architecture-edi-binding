package javax.edi.model.x12.segment;

import java.math.BigDecimal;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.edi.bind.annotations.elements.EDIElementFormat;
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
        
        private String sac03;
        
        private String sac04;
	
	@EDIElementFormat("####.##")
	@EDIElement(fieldName="SAC05", dataElement="610")
	private BigDecimal allowanceOrChargeTotalAmount;
        
        private String sac06;
        
        private String sac07;
        
        private String sac08;
        
        private String sac09;
        
        private String sac10;
        
        private String sac11;
	
	@EDIElement(fieldName="SAC12", dataElement="331")
	@Size(min=2, max=2)
	private String methodOfHandlingCode;

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

	@Override
	public String toString() {
		return "AllowanceChargeOrService [allowanceChargeIndicator="
				+ allowanceChargeIndicator + ", specialChargeOrAllowanceCode="
				+ specialChargeOrAllowanceCode
				+ ", allowanceOrChargeTotalAmount="
				+ allowanceOrChargeTotalAmount + ", methodOfHandlingCode="
				+ methodOfHandlingCode + "]";
	}

    /**
     * @return the sac03
     */
    public String getSac03() {
        return sac03;
    }

    /**
     * @param sac03 the sac03 to set
     */
    public void setSac03(String sac03) {
        this.sac03 = sac03;
    }

    /**
     * @return the sac04
     */
    public String getSac04() {
        return sac04;
    }

    /**
     * @param sac04 the sac04 to set
     */
    public void setSac04(String sac04) {
        this.sac04 = sac04;
    }

    /**
     * @return the sac06
     */
    public String getSac06() {
        return sac06;
    }

    /**
     * @param sac06 the sac06 to set
     */
    public void setSac06(String sac06) {
        this.sac06 = sac06;
    }

    /**
     * @return the sac07
     */
    public String getSac07() {
        return sac07;
    }

    /**
     * @param sac07 the sac07 to set
     */
    public void setSac07(String sac07) {
        this.sac07 = sac07;
    }

    /**
     * @return the sac08
     */
    public String getSac08() {
        return sac08;
    }

    /**
     * @param sac08 the sac08 to set
     */
    public void setSac08(String sac08) {
        this.sac08 = sac08;
    }

    /**
     * @return the sac09
     */
    public String getSac09() {
        return sac09;
    }

    /**
     * @param sac09 the sac09 to set
     */
    public void setSac09(String sac09) {
        this.sac09 = sac09;
    }

    /**
     * @return the sac10
     */
    public String getSac10() {
        return sac10;
    }

    /**
     * @param sac10 the sac10 to set
     */
    public void setSac10(String sac10) {
        this.sac10 = sac10;
    }

    /**
     * @return the sac11
     */
    public String getSac11() {
        return sac11;
    }

    /**
     * @param sac11 the sac11 to set
     */
    public void setSac11(String sac11) {
        this.sac11 = sac11;
    }


}
