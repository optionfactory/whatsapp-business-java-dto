package net.optionfactory.whatsapp.dto.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Email.
 */
public record Email(

        @JsonProperty("type")
        String type,

        @JsonProperty("email")
        String email
) {

}