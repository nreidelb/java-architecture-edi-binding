/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javax.edi.model.x12.edi810.segment;

import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.AddressInformation;
import javax.edi.model.x12.segment.GeographicLocation;
import javax.edi.model.x12.segment.Name;

/**
 *
 * @author nreidelb
 */
@EDISegmentGroup
public class InvoiceAddressGroup {
    private Name name;
    private AddressInformation addressInformation;
    private GeographicLocation geographicLocation;

    /**
     * @return the name
     */
    public Name getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(Name name) {
        this.name = name;
    }

    /**
     * @return the addressInformation
     */
    public AddressInformation getAddressInformation() {
        return addressInformation;
    }

    /**
     * @param addressInformation the addressInformation to set
     */
    public void setAddressInformation(AddressInformation addressInformation) {
        this.addressInformation = addressInformation;
    }

    /**
     * @return the geographicLocation
     */
    public GeographicLocation getGeographicLocation() {
        return geographicLocation;
    }

    /**
     * @param geographicLocation the geographicLocation to set
     */
    public void setGeographicLocation(GeographicLocation geographicLocation) {
        this.geographicLocation = geographicLocation;
    }
    
}
