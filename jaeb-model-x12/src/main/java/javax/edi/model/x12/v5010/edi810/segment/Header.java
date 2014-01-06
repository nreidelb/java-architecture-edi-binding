
package javax.edi.model.x12.v5010.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.segment.Currency;
import javax.edi.model.x12.v5010.segment.DateTimeReference;
import javax.edi.model.x12.v5010.segment.FOBRelatedInstruction;
import javax.edi.model.x12.v5010.segment.NoteSpecialInstructions;
import javax.edi.model.x12.v5010.segment.ReferenceNumber;
import javax.edi.model.x12.v5010.segment.TermsOfSale;
import javax.edi.model.x12.v5010.segment.TransactionSetHeader;
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
	@Size(min=0, max=12)
	private Collection<ReferenceNumber> referenceNumbers;
	
	@EDICollectionType(PartyIdentificationGroup.class)
	@Size(min=1, max=3)
	private Collection<PartyIdentificationGroup> partyIdentificationGroups;
	
	@EDICollectionType(TermsOfSale.class)
	@Size(min=0, max=5)
	private Collection<TermsOfSale> termsOfSales;
	
	@EDICollectionType(DateTimeReference.class)
	@Size(min=0, max=10)
	private Collection<DateTimeReference> dateTimeReferences;
	
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

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}

	public Collection<PartyIdentificationGroup> getPartyIdentificationGroups() {
		return partyIdentificationGroups;
	}

	public void setPartyIdentificationGroups(
			Collection<PartyIdentificationGroup> partyIdentificationGroups) {
		this.partyIdentificationGroups = partyIdentificationGroups;
	}

	public Collection<TermsOfSale> getTermsOfSales() {
		return termsOfSales;
	}

	public void setTermsOfSales(Collection<TermsOfSale> termsOfSales) {
		this.termsOfSales = termsOfSales;
	}

	public Collection<DateTimeReference> getDateTimeReferences() {
		return dateTimeReferences;
	}

	public void setDateTimeReferences(
			Collection<DateTimeReference> dateTimeReferences) {
		this.dateTimeReferences = dateTimeReferences;
	}

	public FOBRelatedInstruction getFobRelatedInstructions() {
		return fobRelatedInstructions;
	}

	public void setFobRelatedInstructions(
			FOBRelatedInstruction fobRelatedInstructions) {
		this.fobRelatedInstructions = fobRelatedInstructions;
	}
	

}
