package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="TD3")
public class ShipmentCarrierDetails {
	@EDIElement(fieldName="TD301", dataElement="040")
	@Size(min=2, max=2)
	private	String equipmentDescriptionCode;
	
	@EDIElement(fieldName="TD302", dataElement="206")
	@Size(min=1, max=4)
	private String equipmentInitial;
	
	@EDIElement(fieldName="TD303", dataElement="207")
	@Size(min=1, max=10)
	private String equipmentNumber;
	
	public String getEquipmentDescriptionCode() {
		return equipmentDescriptionCode;
	}
	public void setEquipmentDescriptionCode(String equipmentDescriptionCode) {
		this.equipmentDescriptionCode = equipmentDescriptionCode;
	}
	public String getEquipmentInitial() {
		return equipmentInitial;
	}
	public void setEquipmentInitial(String equipmentInitial) {
		this.equipmentInitial = equipmentInitial;
	}
	public String getEquipmentNumber() {
		return equipmentNumber;
	}
	public void setEquipmentNumber(String equipmentNumber) {
		this.equipmentNumber = equipmentNumber;
	}

}
