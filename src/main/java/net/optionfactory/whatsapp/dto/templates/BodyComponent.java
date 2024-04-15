package net.optionfactory.whatsapp.dto.templates;

import com.fasterxml.jackson.annotation.JsonInclude;
import net.optionfactory.whatsapp.dto.templates.type.ComponentType;

/**
 * The type Body component.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BodyComponent extends Component<BodyComponent> {


    /**
     * Instantiates a new Body component.
     */
    public BodyComponent() {
        super(ComponentType.BODY);
    }


}
