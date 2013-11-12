package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {
	
	@Size(min=1)
	@NotNull
	@EDICollectionType(OrgRelationshipsGroup.class)
	private Collection<OrgRelationshipsGroup> orgRel;

	public Collection<OrgRelationshipsGroup> getorgRel() {
		return orgRel;
	}

	public void setorgRel(
			Collection<OrgRelationshipsGroup> orgRel) {
		this.orgRel = orgRel;
	}

	
}
