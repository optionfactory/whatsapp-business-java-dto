package net.optionfactory.whatsapp.dto.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.templates.type.LanguageType;

/**
 * @param code Language code. See {@link LanguageType}
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record Language(@JsonProperty("code") LanguageType code) {
}
