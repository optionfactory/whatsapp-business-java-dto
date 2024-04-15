package net.optionfactory.whatsapp.dto.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import net.optionfactory.whatsapp.dto.messages.type.ComponentType;

@JsonInclude(Include.NON_NULL)

public class HeaderComponent extends Component<HeaderComponent> {
    /**
     * Instantiates a new Component.
     */
    public HeaderComponent() {
        super(ComponentType.HEADER);
    }


}
