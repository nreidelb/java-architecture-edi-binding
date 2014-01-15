package javax.edi.model.x12.edi855.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.edi850.segment.ShipmentInformationGroup;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.LineItemAcknowledgement;
import javax.edi.model.x12.segment.POBaselineItemData;
import javax.edi.model.x12.segment.TermsOfSale;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ItemAcknowledgementGroup {

	@NotNull
	@Valid
	private POBaselineItemData itemData;
        
        private TermsOfSale termsOfSale; 
	
	@NotNull
	@Size(min=0, max=25)
	@Valid
	@EDICollectionType(LineItemAcknowledgement.class)
	private Collection<LineItemAcknowledgement> itemAcknowledgements;
        
        private ShipmentInformationGroup shipmentInformationGroup;
	
	public POBaselineItemData getItemData() {
		return itemData;
	}
	public void setItemData(POBaselineItemData itemData) {
		this.itemData = itemData;
	}

	public Collection<LineItemAcknowledgement> getItemAcknowledgements() {
		return itemAcknowledgements;
	}
	public void setItemAcknowledgements(
			Collection<LineItemAcknowledgement> itemAcknowledgements) {
		this.itemAcknowledgements = itemAcknowledgements;
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
     * @return the shipmentInformationGroup
     */
    public ShipmentInformationGroup getShipmentInformationGroup() {
        return shipmentInformationGroup;
    }

    /**
     * @param shipmentInformationGroup the shipmentInformationGroup to set
     */
    public void setShipmentInformationGroup(ShipmentInformationGroup shipmentInformationGroup) {
        this.shipmentInformationGroup = shipmentInformationGroup;
    }
	
	
}
