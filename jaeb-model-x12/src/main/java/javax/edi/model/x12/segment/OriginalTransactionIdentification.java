package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegment(tag="OTI")
public class OriginalTransactionIdentification {
	
	@EDIElement(fieldName="OTI01", dataElement="110")
	@Size(min=1, max=2)
	@NotNull
	private String appAckCode;
	
	@EDIElement(fieldName="OTI02", dataElement="128")
	@Size(min=2, max=3)
	@NotNull
	private String refIdentificationQualifier;
	
	@EDIElement(fieldName="OTI03", dataElement="127")
	@Size(min=1, max=30)
	@NotNull
	private String refIdentification;
	
	@EDIElement(fieldName="OTI04", dataElement="142")
	@Size(min=2, max=15)
	private String appSenderCode;
	
	@EDIElement(fieldName="OTI05")
        private String otiFive;
        
        @EDIElement(fieldName="OTI06")
        private String otiSix;
        
        @EDIElement(fieldName="OTI07")
        private String otiSeven;
	
	@EDIElement(fieldName="OTI08", dataElement="28")
	@Size(min=1, max=9)
	private String groupControlNumber;
	
	@EDIElement(fieldName="OTI09")
        private String otiNine;
        
	
	@EDIElement(fieldName="OTI10", dataElement="143")
	@Size(min=3, max=3)
	private String txnSetIdentifierCode;

	public String getAppAckCode() {
		return appAckCode;
	}

	public void setAppAckCode(String appAckCode) {
		this.appAckCode = appAckCode;
	}

	public String getRefIdentificationQualifier() {
		return refIdentificationQualifier;
	}

	public void setRefIdentificationQualifier(String refIdentificationQualifier) {
		this.refIdentificationQualifier = refIdentificationQualifier;
	}

	public String getRefIdentification() {
		return refIdentification;
	}

	public void setRefIdentification(String refIdentification) {
		this.refIdentification = refIdentification;
	}

	public String getAppSenderCode() {
		return appSenderCode;
	}

	public void setAppSenderCode(String appSenderCode) {
		this.appSenderCode = appSenderCode;
	}

	public String getGroupControlNumber() {
		return groupControlNumber;
	}

	public void setGroupControlNumber(String groupControlNumber) {
		this.groupControlNumber = groupControlNumber;
	}

	public String getTxnSetIdentifierCode() {
		return txnSetIdentifierCode;
	}

	public void setTxnSetIdentifierCode(String txnSetIdentifierCode) {
		this.txnSetIdentifierCode = txnSetIdentifierCode;
	}

	@Override
	public String toString() {
		return "OriginalTransactionIdentification [appAckCode=" + appAckCode
				+ ", refIdentificationQualifier=" + refIdentificationQualifier
				+ ", refIdentification=" + refIdentification
				+ ", appSenderCode=" + appSenderCode + ", groupControlNumber="
				+ groupControlNumber + ", txnSetIdentifierCode="
				+ txnSetIdentifierCode + "]";
	}

    /**
     * @return the otiFive
     */
    public String getOtiFive() {
        return otiFive;
    }

    /**
     * @param otiFive the otiFive to set
     */
    public void setOtiFive(String otiFive) {
        this.otiFive = otiFive;
    }

    /**
     * @return the otiSix
     */
    public String getOtiSix() {
        return otiSix;
    }

    /**
     * @param otiSix the otiSix to set
     */
    public void setOtiSix(String otiSix) {
        this.otiSix = otiSix;
    }

    /**
     * @return the otiSeven
     */
    public String getOtiSeven() {
        return otiSeven;
    }

    /**
     * @param otiSeven the otiSeven to set
     */
    public void setOtiSeven(String otiSeven) {
        this.otiSeven = otiSeven;
    }

    /**
     * @return the otiNine
     */
    public String getOtiNine() {
        return otiNine;
    }

    /**
     * @param otiNine the otiNine to set
     */
    public void setOtiNine(String otiNine) {
        this.otiNine = otiNine;
    }

}
