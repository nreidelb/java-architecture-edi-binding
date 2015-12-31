package javax.edi.model.x12.edi856.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.Currency;
import javax.edi.model.x12.segment.DateTimeReference;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.edi.model.x12.segment.QuantityWeightCarrierDetails;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.edi.model.x12.segment.RoutingCarrierDetails;
import javax.edi.model.x12.segment.ShipmentCarrierDetails;

@EDISegmentGroup
public class ShipmentLevelGroup {

	private HierarchicalLevel shipmentInformationLevel;
	private QuantityWeightCarrierDetails quantityWeightCarrierDetails;
	private RoutingCarrierDetails routingCarrierDetails;
	private ShipmentCarrierDetails shipmentCarrierDetails;
	private ReferenceNumber referenceNumber1;
	private ReferenceNumber referenceNumber2;
	private DateTimeReference shipmentDateTime;
	
	private Name shipFromNameInformation;
	private AddressInformation shipFromAddress;
	private GeographicLocation shipmentFromLocation;
        private PersonContact personContact;
	
	private Name shipToNameInformation;
	private AddressInformation shipToAddress;
	private GeographicLocation shipToCityStateZip;
	
	private Currency currency;
	
	@EDICollectionType(OrderInformationGroup.class)
	private Collection<OrderInformationGroup> orderInformationGroup;
	
	
	public Collection<OrderInformationGroup> getOrderInformationGroup() {
		return orderInformationGroup;
	}

	public void setOrderInformationGroup(
			Collection<OrderInformationGroup> orderInformationGroup) {
		this.orderInformationGroup = orderInformationGroup;
	}
	
	public HierarchicalLevel getShipmentInformationLevel() {
		return shipmentInformationLevel;
	}
	public void setShipmentInformationLevel(
			HierarchicalLevel shipmentInformationLevel) {
		this.shipmentInformationLevel = shipmentInformationLevel;
	}
	public QuantityWeightCarrierDetails getQuantityWeightCarrierDetails() {
		return quantityWeightCarrierDetails;
	}
	public void setQuantityWeightCarrierDetails(
			QuantityWeightCarrierDetails quantityWeightCarrierDetails) {
		this.quantityWeightCarrierDetails = quantityWeightCarrierDetails;
	}
	public RoutingCarrierDetails getRoutingCarrierDetails() {
		return routingCarrierDetails;
	}
	public void setRoutingCarrierDetails(RoutingCarrierDetails routingCarrierDetails) {
		this.routingCarrierDetails = routingCarrierDetails;
	}
	public ReferenceNumber getReferenceNumber1() {
		return referenceNumber1;
	}
	public void setReferenceNumber1(ReferenceNumber referenceNumber1) {
		this.referenceNumber1 = referenceNumber1;
	}
	public ReferenceNumber getReferenceNumber2() {
		return referenceNumber2;
	}
	public void setReferenceNumber2(ReferenceNumber referenceNumber2) {
		this.referenceNumber2 = referenceNumber2;
	}
	public DateTimeReference getShipmentDateTime() {
		return shipmentDateTime;
	}
	public void setShipmentDateTime(DateTimeReference shipmentDateTime) {
		this.shipmentDateTime = shipmentDateTime;
	}
	public Name getShipFromNameInformation() {
		return shipFromNameInformation;
	}
	public void setShipFromNameInformation(Name shipFromNameInformation) {
		this.shipFromNameInformation = shipFromNameInformation;
	}
	public GeographicLocation getShipmentFromLocation() {
		return shipmentFromLocation;
	}
	public void setShipmentFromLocation(GeographicLocation shipmentFromLocation) {
		this.shipmentFromLocation = shipmentFromLocation;
	}
	public Name getShipToNameInformation() {
		return shipToNameInformation;
	}
	public void setShipToNameInformation(Name shipToNameInformation) {
		this.shipToNameInformation = shipToNameInformation;
	}

	public AddressInformation getShipToAddress() {
		return shipToAddress;
	}
	
	public void setShipToAddress(AddressInformation shipToAddress) {
		this.shipToAddress = shipToAddress;
	}
	
	public GeographicLocation getShipToCityStateZip() {
		return shipToCityStateZip;
	}
	public void setShipToCityStateZip(GeographicLocation shipToCityStateZip) {
		this.shipToCityStateZip = shipToCityStateZip;
	}

	public AddressInformation getShipFromAddress() {
		return shipFromAddress;
	}

	public void setShipFromAddress(AddressInformation shipFromAddress) {
		this.shipFromAddress = shipFromAddress;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

    /**
     * @return the personContact
     */
    public PersonContact getPersonContact() {
        return personContact;
    }

    /**
     * @param personContact the personContact to set
     */
    public void setPersonContact(PersonContact personContact) {
        this.personContact = personContact;
    }

	public ShipmentCarrierDetails getShipmentCarrierDetails() {
		return shipmentCarrierDetails;
	}

	public void setShipmentCarrierDetails(ShipmentCarrierDetails shipmentCarrierDetails) {
		this.shipmentCarrierDetails = shipmentCarrierDetails;
	}
	
	
}
