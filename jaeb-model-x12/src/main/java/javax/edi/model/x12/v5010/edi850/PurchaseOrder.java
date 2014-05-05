package javax.edi.model.x12.v5010.edi850;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDIMessage;
import javax.edi.model.x12.v5010.X12Message;
import javax.edi.model.x12.v5010.edi850.segment.PurchaseOrderBody;
import javax.edi.model.x12.v5010.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.v5010.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.v5010.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.v5010.segment.InterchangeEnvelopeTrailer;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDIMessage
public class PurchaseOrder implements X12Message {

	@NotNull
	private InterchangeEnvelopeHeader interchangeEnvelopeHeader;
	@NotNull
	private GroupEnvelopeHeader groupEnvelopeHeader;
	
	@NotNull
	@Size(min=1)
	@EDICollectionType(PurchaseOrderBody.class)
	private Collection<PurchaseOrderBody> body;
	
	@NotNull
	private GroupEnvelopeTrailer groupEnvelopeTrailer;
	@NotNull
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
	public Collection<PurchaseOrderBody> getBody() {
		return body;
	}
	public void setBody(Collection<PurchaseOrderBody> body) {
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
