package javax.edi.model.x12.edi855.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.edi.model.x12.segment.TransactionTotal;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Trailer {

	@NotNull
	@Valid
	private TransactionTotal transactionTotal;
	
	@NotNull
	@Valid
	private TransactionSetTrailer transactionSetTrailer;
	
	public TransactionTotal getTransactionTotal() {
		return transactionTotal;
	}
	public void setTransactionTotal(TransactionTotal transactionTotal) {
		this.transactionTotal = transactionTotal;
	}
	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}
	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}
	
	
}
