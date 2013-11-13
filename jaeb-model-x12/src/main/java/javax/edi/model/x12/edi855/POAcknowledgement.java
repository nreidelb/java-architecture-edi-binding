package javax.edi.model.x12.edi855;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.X12Message;
import javax.edi.model.x12.edi855.segment.POAcknowledgementBody;
import javax.edi.model.x12.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.segment.InterchangeEnvelopeTrailer;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDIMessage
public class POAcknowledgement implements X12Message {

	@NotNull
	@Valid
	private InterchangeEnvelopeHeader interchangeEnvelopeHeader;
	
	@NotNull
	@Valid
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	@NotNull
	@Size(min=1)
	//@Valid
	@EDICollectionType(POAcknowledgementBody.class)
	private Collection<POAcknowledgementBody> body;
	
	@NotNull
	@Valid
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	
	@NotNull
	@Valid
	private InterchangeEnvelopeTrailer interchangeEnvelopeTrailer;

	public InterchangeEnvelopeHeader getInterchangeEnvelopeHeader() {
		return interchangeEnvelopeHeader;
	}

	public void setInterchangeEnvelopeHeader(
			InterchangeEnvelopeHeader interchangeEnvelopeHeader) {
		this.interchangeEnvelopeHeader = interchangeEnvelopeHeader;
	}

	public GroupEnvelopeHeader getGroupEnvelopeHeader() {
		return groupEnvelopeHeader;
	}

	public void setGroupEnvelopeHeader(GroupEnvelopeHeader groupEnvelopeHeader) {
		this.groupEnvelopeHeader = groupEnvelopeHeader;
	}

	public Collection<POAcknowledgementBody> getBody() {
		return body;
	}

	public void setBody(Collection<POAcknowledgementBody> body) {
		this.body = body;
	}

	public GroupEnvelopeTrailer getGroupEnvelopeTrailer() {
		return groupEnvelopeTrailer;
	}

	public void setGroupEnvelopeTrailer(GroupEnvelopeTrailer groupEnvelopeTrailer) {
		this.groupEnvelopeTrailer = groupEnvelopeTrailer;
	}

	public InterchangeEnvelopeTrailer getInterchangeEnvelopeTrailer() {
		return interchangeEnvelopeTrailer;
	}

	public void setInterchangeEnvelopeTrailer(
			InterchangeEnvelopeTrailer interchangeEnvelopeTrailer) {
		this.interchangeEnvelopeTrailer = interchangeEnvelopeTrailer;
	}
	
	
}
