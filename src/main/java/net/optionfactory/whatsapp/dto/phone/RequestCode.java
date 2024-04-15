package net.optionfactory.whatsapp.dto.phone;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.phone.type.CodeMethodType;
import net.optionfactory.whatsapp.dto.templates.type.LanguageType;

/**
 * The type Request code.
 *
 * @param codeMethod Required. Specifies the method for verification. Supported options are: SMS or VOICE.
 * @param language   Required. Specifies your locale.
 */
public record RequestCode(

        @JsonProperty("code_method") CodeMethodType codeMethod,

        @JsonProperty("language") LanguageType language) {
}