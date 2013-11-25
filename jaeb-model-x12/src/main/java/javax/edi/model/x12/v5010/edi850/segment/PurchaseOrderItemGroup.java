package javax.edi.model.x12.v5010.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.segment.AllowanceChargeOrService;
import javax.edi.model.x12.v5010.segment.ItemPhysicalDetail;
import javax.edi.model.x12.v5010.segment.MonetaryAmountInformation;
import javax.edi.model.x12.v5010.segment.POBaselineItemData;
import javax.edi.model.x12.v5010.segment.ProductItemDescription;
import javax.edi.model.x12.v5010.segment.ReferenceIdentification;
import javax.edi.model.x12.v5010.segment.DestinationQuantity;
import javax.edi.model.x12.v5010.segment.SubLineItemDetail;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class PurchaseOrderItemGroup {

	@NotNull
	private POBaselineItemData baselineItemData;
	
	private ItemPhysicalDetail itemPhysicalDetail;
	
	private ProductItemDescription itemDescription;
	
	private AllowanceChargeOrService allowanceChargeOrService;
	
	private DestinationQuantity destinationQuantity;
	
	private ReferenceIdentification referenceIdentification;
	
	@Size(max=100000)
	@EDICollectionType(TextualData.class)
	private Collection<TextualData> textualData;
	
	private SubLineItemDetail subLineItemDetail;
	
	private MonetaryAmountInformation monetaryAmountInformation;

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

	public ReferenceIdentification getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(
			ReferenceIdentification referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}

	public Collection<TextualData> getTextualData() {
		return textualData;
	}

	public void setTextualData(Collection<TextualData> textualData) {
		this.textualData = textualData;
	}

	public DestinationQuantity getDestinationQuantity() {
		return destinationQuantity;
	}

	public void setDestinationQuantity(DestinationQuantity destinationQuantity) {
		this.destinationQuantity = destinationQuantity;
	}

	public MonetaryAmountInformation getMonetaryAmountInformation() {
		return monetaryAmountInformation;
	}

	public void setMonetaryAmountInformation(MonetaryAmountInformation monetaryAmountInformation) {
		this.monetaryAmountInformation = monetaryAmountInformation;
	}

	public ItemPhysicalDetail getItemPhysicalDetail() {
		return itemPhysicalDetail;
	}

	public void setItemPhysicalDetail(ItemPhysicalDetail itemPhysicalDetail) {
		this.itemPhysicalDetail = itemPhysicalDetail;
	}

	public AllowanceChargeOrService getAllowanceChargeOrService() {
		return allowanceChargeOrService;
	}

	public void setAllowanceChargeOrService(AllowanceChargeOrService allowanceChargeOrService) {
		this.allowanceChargeOrService = allowanceChargeOrService;
	}

	public SubLineItemDetail getSubLineItemDetail() {
		return subLineItemDetail;
	}

	public void setSubLineItemDetail(SubLineItemDetail subLineItemDetail) {
		this.subLineItemDetail = subLineItemDetail;
	}
}
