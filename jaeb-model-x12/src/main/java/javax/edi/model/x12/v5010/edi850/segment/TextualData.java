package javax.edi.model.x12.v5010.edi850.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.Size;

@EDISegment(tag="MTX")
public class TextualData {

	@EDIElement(fieldName="MTX01",dataElement="1551")
	private String textualData1;
	
	@EDIElement(fieldName="MTX02",dataElement="1551")
	@Size(min=1,max=4096)
	private String textualData2;

	public String getTextualData1() {
		return textualData1;
	}

	public void setTextualData1(String textualData1) {
		this.textualData1 = textualData1;
	}

	public String getTextualData2() {
		return textualData2;
	}

	public void setTextualData2(String textualData2) {
		this.textualData2 = textualData2;
	}
	
	
	
	
}
