package net.optionfactory.whatsapp.dto.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Disable info.
 */
public record DisableInfo(@JsonProperty("disable_date") String disableDate) {
}
