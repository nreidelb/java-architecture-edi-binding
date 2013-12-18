package javax.edi.model.x12.edi850.segment;

import java.util.Collection;
import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.POBaselineItemData;
import javax.edi.model.x12.segment.ProductItemDescription;
import javax.edi.model.x12.segment.ReferenceIdentification;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.RoutingCarrierDetails;
import javax.edi.model.x12.v5010.segment.TermsOfSale;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class PurchaseOrderItemGroup {

	@NotNull
	private POBaselineItemData baselineItemData;
        
        @Size(max=200)
        @EDICollectionType(ReferenceNumber.class)
        private Collection<ReferenceNumber> referenceNumber;
        
        private TermsOfSale termsOfSale;
        
        private DateTimeReference dateTimeReference;
        
        private RoutingCarrierDetails carrierDetails;
	
	private ProductItemDescription itemDescription;
        
        @Size(max=200)
        @EDICollectionType(ReferenceMessageGroup.class)
        private Collection<ReferenceMessageGroup> referenceMessageGroup;
        
        @Size(max=200)
        @EDICollectionType(ShipmentInformationGroup.class)
        private Collection<ShipmentInformationGroup> shipmentInformationGroup;

	public POBaselineItemData getBaselineItemData() {
		return baselineItemData;
	}

	public void setBaselineItemData(POBaselineItemData baselineItemData) {
		this.baselineItemData = baselineItemData;
	}

	public ProductItemDescription getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(ProductItemDescription itemDescription) {
		this.itemDescription = itemDescription;
	}

    /**
     * @return the termsOfSale
     */
    public TermsOfSale getTermsOfSale() {
        return termsOfSale;
    }

    /**
     * @param termsOfSale the termsOfSale to set
     */
    public void setTermsOfSale(TermsOfSale termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    /**
     * @return the dateTimeReference
     */
    public DateTimeReference getDateTimeReference() {
        return dateTimeReference;
    }

    /**
     * @param dateTimeReference the dateTimeReference to set
     */
    public void setDateTimeReference(DateTimeReference dateTimeReference) {
        this.dateTimeReference = dateTimeReference;
    }

    /**
     * @return the carrierDetails
     */
    public RoutingCarrierDetails getCarrierDetails() {
        return carrierDetails;
    }

    /**
     * @param carrierDetails the carrierDetails to set
     */
    public void setCarrierDetails(RoutingCarrierDetails carrierDetails) {
        this.carrierDetails = carrierDetails;
    }

    /**
     * @return the referenceMessageGroup
     */
    public Collection<ReferenceMessageGroup> getReferenceMessageGroup() {
        return referenceMessageGroup;
    }

    /**
     * @param referenceMessageGroup the referenceMessageGroup to set
     */
    public void setReferenceMessageGroup(Collection<ReferenceMessageGroup> referenceMessageGroup) {
        this.referenceMessageGroup = referenceMessageGroup;
    }

    /**
     * @return the shipmentInformationGroup
     */
    public Collection<ShipmentInformationGroup> getShipmentInformationGroup() {
        return shipmentInformationGroup;
    }

    /**
     * @param shipmentInformationGroup the shipmentInformationGroup to set
     */
    public void setShipmentInformationGroup(Collection<ShipmentInformationGroup> shipmentInformationGroup) {
        this.shipmentInformationGroup = shipmentInformationGroup;
    }

    /**
     * @return the referenceNumber
     */
    public Collection<ReferenceNumber> getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * @param referenceNumber the referenceNumber to set
     */
    public void setReferenceNumber(Collection<ReferenceNumber> referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
}
