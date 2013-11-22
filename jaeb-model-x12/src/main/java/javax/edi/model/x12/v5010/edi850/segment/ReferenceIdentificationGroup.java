package javax.edi.model.x12.v5010.edi850.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.v5010.segment.ReferenceIdentification;
import javax.validation.constraints.NotNull;

@EDISegmentGroup
public class ReferenceIdentificationGroup {

	@NotNull
	private ReferenceIdentification referenceIdentification;
	
	@EDICollectionType(TextualData.class)
	private Collection<TextualData> textualDatas;

	public ReferenceIdentification getReferenceIdentification() {
		return referenceIdentification;
	}

	public void setReferenceIdentification(
			ReferenceIdentification referenceIdentification) {
		this.referenceIdentification = referenceIdentification;
	}

	public Collection<TextualData> getTextualDatas() {
		return textualDatas;
	}

	public void setTextualDatas(Collection<TextualData> textualDatas) {
		this.textualDatas = textualDatas;
	}
	
	

}
