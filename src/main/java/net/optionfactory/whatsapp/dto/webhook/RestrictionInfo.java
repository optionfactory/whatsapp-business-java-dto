package net.optionfactory.whatsapp.dto.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.webhook.type.RestrictionType;

/**
 * The type Restriction info.
 */
public record RestrictionInfo(

        @JsonProperty("restriction_type") RestrictionType restrictionType,

        @JsonProperty("expiration") String expiration


) {
}
