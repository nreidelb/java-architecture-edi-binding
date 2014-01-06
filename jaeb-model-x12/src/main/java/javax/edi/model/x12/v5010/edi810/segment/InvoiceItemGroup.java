package javax.edi.model.x12.v5010.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.segment.AllowanceChargeOrService;
import javax.edi.model.x12.v5010.segment.BaselineItemData;
import javax.edi.model.x12.v5010.segment.CarrierDetails;
import javax.edi.model.x12.v5010.segment.ItemPhysicalDetail;
import javax.edi.model.x12.v5010.segment.ProductItemDescription;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class InvoiceItemGroup {

	private BaselineItemData baselineItemData;
	
	private ProductItemDescription productItemDescription;
	
	@Size(min=1,max=1000)
	@EDICollectionType(ItemPhysicalDetail.class)
	private ItemPhysicalDetail itemPhysicalDetail; 
	
	private CarrierDetails carrierDetails;
	
	@Size(min=1)
	@EDICollectionType(AllowanceChargeOrService.class)
	private Collection<AllowanceChargeOrService> allowanceChargeOrServices;

	public BaselineItemData getBaselineItemData() {
		return baselineItemData;
	}

	public void setBaselineItemData(BaselineItemData baselineItemData) {
		this.baselineItemData = baselineItemData;
	}

	public ItemPhysicalDetail getItemPhysicalDetail() {
		return itemPhysicalDetail;
	}

	public void setItemPhysicalDetail(ItemPhysicalDetail itemPhysicalDetail) {
		this.itemPhysicalDetail = itemPhysicalDetail;
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

	public ProductItemDescription getProductItemDescription() {
		return productItemDescription;
	}

	public void setProductItemDescription(ProductItemDescription productItemDescription) {
		this.productItemDescription = productItemDescription;
	}
	

}
