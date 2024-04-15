package net.optionfactory.whatsapp.dto.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Text.
 *
 * @param body The text of the text message.
 */
public record Text(

        @JsonProperty("body") String body) {
}