package javax.edi.model.x12.v5010.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="N2")
public class AdditionalNameInformation {

	@EDIElement(fieldName="N201", dataElement="98")
	@Size(min=1, max=35)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AdditionalNameInformation [name=" + name + "]";
	}
}
