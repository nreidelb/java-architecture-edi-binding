package javax.edi.model.x12.edi855.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetHeader;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Header implements javax.edi.model.x12.Header {

	@NotNull
	@Valid
	private TransactionSetHeader transactionSetHeader;
	
	@NotNull
	@Valid
	private POAcknowledgementBeginningSegment beginningSegment;

	public TransactionSetHeader getTransactionSetHeader() {
		return transactionSetHeader;
	}

	public void setTransactionSetHeader(TransactionSetHeader transactionSetHeader) {
		this.transactionSetHeader = transactionSetHeader;
	}

	public POAcknowledgementBeginningSegment getBeginningSegment() {
		return beginningSegment;
	}

	public void setBeginningSegment(
			POAcknowledgementBeginningSegment beginningSegment) {
		this.beginningSegment = beginningSegment;
	}
	
	
}
