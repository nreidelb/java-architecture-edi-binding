package javax.edi.model.x12.edi816.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
<<<<<<< HEAD
=======
import javax.edi.bind.annotations.EDISegmentGroup;
>>>>>>> 82bf0b410ffadef60ba28960e9bcb18f9c50a158
import javax.edi.model.x12.segment.HierarchicalLevel;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

<<<<<<< HEAD
=======
@EDISegmentGroup
>>>>>>> 82bf0b410ffadef60ba28960e9bcb18f9c50a158
public class OrgRelationshipsGroupChild {
	
	@NotNull
	@Size(min = 1)
	private HierarchicalLevel level; 
	
	@NotNull
	@Size(min = 1)
	@EDICollectionType(OrgRelationshipsIdentificationGroup.class)
	private Collection<OrgRelationshipsIdentificationGroup> orgRelationshipsIdentificationGroup;


	public HierarchicalLevel getLevel() {
		return level;
	}

	public void setLevel(HierarchicalLevel level) {
		this.level = level;
	}

	public Collection<OrgRelationshipsIdentificationGroup> getOrgRelationshipsIdentificationGroup() {
		return orgRelationshipsIdentificationGroup;
	}

	public void setOrgRelationshipsIdentificationGroup(
			Collection<OrgRelationshipsIdentificationGroup> orgRelationshipsIdentificationGroup) {
		this.orgRelationshipsIdentificationGroup = orgRelationshipsIdentificationGroup;
	}

	
	
	
<<<<<<< HEAD
}
=======
}
>>>>>>> 82bf0b410ffadef60ba28960e9bcb18f9c50a158
