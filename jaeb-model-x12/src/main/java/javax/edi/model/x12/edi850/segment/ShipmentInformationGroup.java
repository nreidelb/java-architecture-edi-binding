package javax.edi.model.x12.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AdditionalNameInformation;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.Name;
import javax.edi.model.x12.segment.PersonContact;
import javax.edi.model.x12.segment.ReferenceNumber;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class ShipmentInformationGroup {

	private Name shipToName;
        @EDICollectionType(AdditionalNameInformation.class)
	@Size(max=2)
	private Collection<AdditionalNameInformation> additionalNameInformation;
	private AddressInformation addressInformation;
	private GeographicLocation geographicLocation;
	
	@EDICollectionType(PersonContact.class)
	@Size(max=3)
	private Collection<PersonContact> administrativeContact;
        
        private ReferenceNumber referenceNumber;

	public Name getShipToName() {
		return shipToName;
	}

	public void setShipToName(Name shipToName) {
		this.shipToName = shipToName;
	}

	public AddressInformation getAddressInformation() {
		return addressInformation;
	}

	public void setAddressInformation(AddressInformation addressInformation) {
		this.addressInformation = addressInformation;
	}

	public GeographicLocation getGeographicLocation() {
		return geographicLocation;
	}

	public void setGeographicLocation(GeographicLocation geographicLocation) {
		this.geographicLocation = geographicLocation;
	}

	public Collection<PersonContact> getAdministrativeContact() {
		return administrativeContact;
	}

	public void setAdministrativeContact(
			Collection<PersonContact> administrativeContact) {
		this.administrativeContact = administrativeContact;
	}

    /**
     * @return the additionalNameInformation
     */
    public Collection<AdditionalNameInformation> getAdditionalNameInformation() {
        return additionalNameInformation;
    }

    /**
     * @param additionalNameInformation the additionalNameInformation to set
     */
    public void setAdditionalNameInformation(Collection<AdditionalNameInformation> additionalNameInformation) {
        this.additionalNameInformation = additionalNameInformation;
    }

    /**
     * @return the referenceNumber
     */
    public ReferenceNumber getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * @param referenceNumber the referenceNumber to set
     */
    public void setReferenceNumber(ReferenceNumber referenceNumber) {
        this.referenceNumber = referenceNumber;
    }
	
	
}
