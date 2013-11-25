package javax.edi.model.x12.v5010.edi850.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.TransactionSetTrailer;
import javax.edi.model.x12.segment.TransactionSetTotals;
import javax.edi.model.x12.v5010.segment.MonetaryAmountInformation;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class Trailer {

	@NotNull
	private TransactionSetTotals transactionSetTotals;
	
	private MonetaryAmountInformation transactionMonetaryTotal;
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;

	public TransactionSetTotals getTransactionSetTotals() {
		return transactionSetTotals;
	}

	public void setTransactionSetTotals(TransactionSetTotals transactionSetTotals) {
		this.transactionSetTotals = transactionSetTotals;
	}

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}

	public MonetaryAmountInformation getTransactionMonetaryTotal() {
		return transactionMonetaryTotal;
	}

	public void setTransactionMonetaryTotal(MonetaryAmountInformation transactionMonetaryTotal) {
		this.transactionMonetaryTotal = transactionMonetaryTotal;
	}
	
}
