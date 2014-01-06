/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javax.edi.model.x12.edi850.segment;

import javax.edi.model.x12.segment.MessageText;
import java.util.Collection;
import javax.edi.bind.annotations.EDICollectionType;
import javax.edi.bind.annotations.EDISegmentGroup;
import javax.edi.model.x12.segment.ReferenceIdentification;
import javax.validation.constraints.Size;

/**
 *
 * @author nreidelb
 */
@EDISegmentGroup
public class ReferenceMessageGroup {
    private ReferenceIdentification referenceIdentification;
    
    @Size(max=200)
    @EDICollectionType(MessageText.class)
    private Collection<MessageText> messageTexts;

    /**
     * @return the messageTexts
     */
    public Collection<MessageText> getMessageTexts() {
        return messageTexts;
    }

    /**
     * @param messageTexts the messageTexts to set
     */
    public void setMessageTexts(Collection<MessageText> messageTexts) {
        this.messageTexts = messageTexts;
    }

    /**
     * @return the referenceIdentification
     */
    public ReferenceIdentification getReferenceIdentification() {
        return referenceIdentification;
    }

    /**
     * @param referenceIdentification the referenceIdentification to set
     */
    public void setReferenceIdentification(ReferenceIdentification referenceIdentification) {
        this.referenceIdentification = referenceIdentification;
    }
}
