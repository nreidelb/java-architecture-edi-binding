package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.ItemIdentification;
import javax.edi.model.x12.segment.MarksAndNumbers;
import javax.edi.model.x12.segment.ProductItemDescription;
import javax.edi.model.x12.segment.ShipmentItemDetail;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class PackageCartonOrItemLevelGroup {

	@NotNull
	private HierarchicalLevel packageCartonHeader;
	private MarksAndNumbers cartonSSCCCode;
	private MarksAndNumbers cartonA;
	private MarksAndNumbers carrierTrackingNumber;
        private ItemIdentification itemIdentification;
	private ShipmentItemDetail shipmentItemDetail;
	private ProductItemDescription productItemDescription;
	
	@NotNull
	@EDICollectionType(ItemLevelInformationGroup.class)
	private Collection<ItemLevelInformationGroup> itemLevelInformationGroup;


	public HierarchicalLevel getPackageCartonHeader() {
		return packageCartonHeader;
	}
	public void setPackageCartonHeader(HierarchicalLevel packageCartonHeader) {
		this.packageCartonHeader = packageCartonHeader;
	}
	public MarksAndNumbers getCartonSSCCCode() {
		return cartonSSCCCode;
	}
	public void setCartonSSCCCode(MarksAndNumbers cartonSSCCCode) {
		this.cartonSSCCCode = cartonSSCCCode;
	}
	public MarksAndNumbers getCarrierTrackingNumber() {
		return carrierTrackingNumber;
	}
	public void setCarrierTrackingNumber(MarksAndNumbers carrierTrackingNumber) {
		this.carrierTrackingNumber = carrierTrackingNumber;
	}
	public MarksAndNumbers getCartonA() {
		return cartonA;
	}
	public void setCartonA(MarksAndNumbers cartonA) {
		this.cartonA = cartonA;
	}
	public Collection<ItemLevelInformationGroup> getItemLevelInformationGroup() {
		return itemLevelInformationGroup;
	}
	public void setItemLevelInformationGroup(
			Collection<ItemLevelInformationGroup> itemLevelInformationGroup) {
		this.itemLevelInformationGroup = itemLevelInformationGroup;
	}

    /**
     * @return the itemIdentification
     */
    public ItemIdentification getItemIdentification() {
        return itemIdentification;
    }

    /**
     * @param itemIdentification the itemIdentification to set
     */
    public void setItemIdentification(ItemIdentification itemIdentification) {
        this.itemIdentification = itemIdentification;
    }

    /**
     * @return the shipmentItemDetail
     */
    public ShipmentItemDetail getShipmentItemDetail() {
        return shipmentItemDetail;
    }

    /**
     * @param shipmentItemDetail the shipmentItemDetail to set
     */
    public void setShipmentItemDetail(ShipmentItemDetail shipmentItemDetail) {
        this.shipmentItemDetail = shipmentItemDetail;
    }

    /**
     * @return the productItemDescription
     */
    public ProductItemDescription getProductItemDescription() {
        return productItemDescription;
    }

    /**
     * @param productItemDescription the productItemDescription to set
     */
    public void setProductItemDescription(ProductItemDescription productItemDescription) {
        this.productItemDescription = productItemDescription;
    }
	
	
}
