package javax.edi.model.x12.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.Currency;
import javax.edi.model.x12.segment.FOBRelatedInstruction;
import javax.edi.model.x12.segment.NoteSpecialInstructions;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.TermsOfSale;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Header {

	@NotNull
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	private InvoiceBeginningSegment beginningSegmentforInvoice;
	
	//optional
	private Currency currency;

	@EDICollectionType(NoteSpecialInstructions.class)
	@Size(min=0, max=100)
	private Collection<NoteSpecialInstructions> noteSpecialInstructions;
	
        @EDICollectionType(ReferenceNumber.class)
	@Size(min=2, max=12)
	private Collection<ReferenceNumber> referenceNumbers;
	
	@EDICollectionType(InvoiceAddressGroup.class)
	@Size(min=0, max=200)
	private Collection<InvoiceAddressGroup> invoiceAddressGroups;
	
	@EDICollectionType(TermsOfSale.class)
	@Size(max=5)
	private Collection<TermsOfSale> termsOfSale;
	
	private FOBRelatedInstruction fobRelatedInstructions;
	
	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}
	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}
	public InvoiceBeginningSegment getBeginningSegmentforInvoice() {
		return beginningSegmentforInvoice;
	}
	public void setBeginningSegmentforInvoice(
			InvoiceBeginningSegment beginningSegmentforInvoice) {
		this.beginningSegmentforInvoice = beginningSegmentforInvoice;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public Collection<NoteSpecialInstructions> getNoteSpecialInstructions() {
		return noteSpecialInstructions;
	}
	public void setNoteSpecialInstructions(
			Collection<NoteSpecialInstructions> noteSpecialInstructions) {
		this.noteSpecialInstructions = noteSpecialInstructions;
	}
        
	public Collection<TermsOfSale> getTermsOfSale() {
		return termsOfSale;
	}
	public void setTermsOfSale(Collection<TermsOfSale> termsOfSale) {
		this.termsOfSale = termsOfSale;
	}
	public FOBRelatedInstruction getFobRelatedInstructions() {
		return fobRelatedInstructions;
	}
	public void setFobRelatedInstructions(
			FOBRelatedInstruction fobRelatedInstructions) {
		this.fobRelatedInstructions = fobRelatedInstructions;
	}
	@Override
	public String toString() {
		return "Header [transactionSetHeader=" + transactionSetHeader
				+ ", beginningSegmentforInvoice=" + beginningSegmentforInvoice
				+ ", currency=" + currency + ", noteSpecialInstructions="
				+ noteSpecialInstructions + ", referenceNumbers="
				+ referenceNumbers + ", names=" + invoiceAddressGroups
				+ ", termsofSale=" + termsOfSale + ", fobRelatedInstructions="
				+ fobRelatedInstructions + "]";
	}

    /**
     * @return the referenceNumbers
     */
    public Collection<ReferenceNumber> getReferenceNumbers() {
        return referenceNumbers;
    }

    /**
     * @param referenceNumbers the referenceNumbers to set
     */
    public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
        this.referenceNumbers = referenceNumbers;
    }

    /**
     * @return the invoiceAddressGroups
     */
    public Collection<InvoiceAddressGroup> getInvoiceAddressGroups() {
        return invoiceAddressGroups;
    }

    /**
     * @param invoiceAddressGroups the invoiceAddressGroups to set
     */
    public void setInvoiceAddressGroups(Collection<InvoiceAddressGroup> invoiceAddressGroups) {
        this.invoiceAddressGroups = invoiceAddressGroups;
    }
}
