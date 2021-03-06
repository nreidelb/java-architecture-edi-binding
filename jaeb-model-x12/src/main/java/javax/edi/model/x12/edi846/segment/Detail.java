package javax.edi.model.x12.edi846.segment;

import java.util.Collection;

import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@EDISegmentGroup
public class Detail {

	@NotNull
	@Size(min=0, max=100000)
	@EDICollectionType(ItemIdentificationGroup.class)
	private Collection<ItemIdentificationGroup> itemIdentifications;
	
	public Collection<ItemIdentificationGroup> getItemIdentifications() {
		return itemIdentifications;
	}
	
	public void setItemIdentifications(
			Collection<ItemIdentificationGroup> itemIdentifications) {
		this.itemIdentifications = itemIdentifications;
	}
}
