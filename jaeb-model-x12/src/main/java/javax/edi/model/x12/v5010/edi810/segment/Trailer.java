package javax.edi.model.x12.v5010.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.segment.AllowanceChargeOrService;
import javax.edi.model.x12.v5010.segment.CarrierDetails;
import javax.edi.model.x12.v5010.segment.InvoiceShipmentSummary;
import javax.edi.model.x12.v5010.segment.TaxInformation;
import javax.edi.model.x12.v5010.segment.TotalMonetaryValueSummary;
import javax.edi.model.x12.v5010.segment.TransactionSetTrailer;
import javax.edi.model.x12.v5010.segment.TransactionTotal;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Trailer {

	@NotNull
	private TotalMonetaryValueSummary totalMonetaryValueSummary;
	
	private TaxInformation taxInformation;
	
	private CarrierDetails carrierDetails;
	
	@EDICollectionType(AllowanceChargeOrService.class)
	@Size(min=0, max=10)
	private Collection<AllowanceChargeOrService> allowanceChargeOrServices;
	
	private InvoiceShipmentSummary invoiceShipmentSummary;
	
	@NotNull
	private TransactionTotal transactionTotals;
	
	@NotNull
	private TransactionSetTrailer transactionSetTrailer;

	public TotalMonetaryValueSummary getTotalMonetaryValueSummary() {
		return totalMonetaryValueSummary;
	}

	public void setTotalMonetaryValueSummary(
			TotalMonetaryValueSummary totalMonetaryValueSummary) {
		this.totalMonetaryValueSummary = totalMonetaryValueSummary;
	}

	public TaxInformation getTaxInformation() {
		return taxInformation;
	}

	public void setTaxInformation(TaxInformation taxInformation) {
		this.taxInformation = taxInformation;
	}

	public CarrierDetails getCarrierDetails() {
		return carrierDetails;
	}

	public void setCarrierDetails(CarrierDetails carrierDetails) {
		this.carrierDetails = carrierDetails;
	}

	public Collection<AllowanceChargeOrService> getAllowanceChargeOrServices() {
		return allowanceChargeOrServices;
	}

	public void setAllowanceChargeOrServices(
			Collection<AllowanceChargeOrService> allowanceChargeOrServices) {
		this.allowanceChargeOrServices = allowanceChargeOrServices;
	}

	public InvoiceShipmentSummary getInvoiceShipmentSummary() {
		return invoiceShipmentSummary;
	}

	public void setInvoiceShipmentSummary(
			InvoiceShipmentSummary invoiceShipmentSummary) {
		this.invoiceShipmentSummary = invoiceShipmentSummary;
	}

	public TransactionTotal getTransactionTotals() {
		return transactionTotals;
	}

	public void setTransactionTotals(TransactionTotal transactionTotals) {
		this.transactionTotals = transactionTotals;
	}

	public TransactionSetTrailer getTransactionSetTrailer() {
		return transactionSetTrailer;
	}

	public void setTransactionSetTrailer(TransactionSetTrailer transactionSetTrailer) {
		this.transactionSetTrailer = transactionSetTrailer;
	}


	
}
