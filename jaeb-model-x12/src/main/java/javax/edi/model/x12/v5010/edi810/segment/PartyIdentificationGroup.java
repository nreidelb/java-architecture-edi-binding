package javax.edi.model.x12.v5010.edi810.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.segment.AdditionalNameInformation;
import javax.edi.model.x12.v5010.segment.AddressInformation;
import javax.edi.model.x12.v5010.segment.GeographicLocation;
import javax.edi.model.x12.v5010.segment.Name;
import javax.edi.model.x12.v5010.segment.ReferenceNumber;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class PartyIdentificationGroup {

	private Name name;
	
	private AdditionalNameInformation additionalNameInformation;
	
	private AddressInformation addressInformation;
	
	private GeographicLocation geographicLocation;
	
	@EDICollectionType(ReferenceNumber.class)
	@Size(min=0, max=12)
	private Collection<ReferenceNumber> referenceNumbers;

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public AdditionalNameInformation getAdditionalNameInformation() {
		return additionalNameInformation;
	}

	public void setAdditionalNameInformation(
			AdditionalNameInformation additionalNameInformation) {
		this.additionalNameInformation = additionalNameInformation;
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

	public Collection<ReferenceNumber> getReferenceNumbers() {
		return referenceNumbers;
	}

	public void setReferenceNumbers(Collection<ReferenceNumber> referenceNumbers) {
		this.referenceNumbers = referenceNumbers;
	}
	
	
}
