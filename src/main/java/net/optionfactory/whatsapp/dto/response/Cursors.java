package net.optionfactory.whatsapp.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Cursors.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record Cursors(

        @JsonProperty("before") String before,

        @JsonProperty("after") String after) {
}