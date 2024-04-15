package net.optionfactory.whatsapp.dto.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.templates.MessageTemplate;

/**
 * The type Message template id response.
 *
 * @deprecated use {@link MessageTemplate} instead
 */
@Deprecated(forRemoval = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public record MessageTemplateIDResponse(@JsonProperty("id") String id) {
}
