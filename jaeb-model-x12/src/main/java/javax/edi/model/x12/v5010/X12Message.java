package javax.edi.model.x12.v5010;

import java.util.Collection;

import javax.edi.model.x12.v5010.segment.GroupEnvelopeHeader;
import javax.edi.model.x12.v5010.segment.GroupEnvelopeTrailer;
import javax.edi.model.x12.v5010.segment.InterchangeEnvelopeHeader;
import javax.edi.model.x12.v5010.segment.InterchangeEnvelopeTrailer;


public interface X12Message {
	public InterchangeEnvelopeHeader getInterchangeEnvelopeHeader();

	public GroupEnvelopeHeader getGroupEnvelopeHeader();
	
	public Collection<? extends X12Body> getBody();
	
	public GroupEnvelopeTrailer getGroupEnvelopeTrailer();

	public InterchangeEnvelopeTrailer getInterchangeEnvelopeTrailer();
}
