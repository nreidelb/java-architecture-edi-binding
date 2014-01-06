/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javax.edi.model.x12.segment;

import javax.edi.bind.annotations.EDIElement;
import javax.edi.bind.annotations.EDISegment;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author nreidelb
 */
@EDISegment(tag="MSG")
public class MessageText {
    @EDIElement(fieldName="MSG01",dataElement="933")
    @NotNull
    @Size(min=1,max=255)
    private String freeFormMessageText;

    /**
     * @return the freeFormMessageText
     */
    public String getFreeFormMessageText() {
        return freeFormMessageText;
    }

    /**
     * @param freeFormMessageText the freeFormMessageText to set
     */
    public void setFreeFormMessageText(String freeFormMessageText) {
        this.freeFormMessageText = freeFormMessageText;
    }
}
