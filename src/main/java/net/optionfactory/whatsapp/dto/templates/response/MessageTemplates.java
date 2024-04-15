package net.optionfactory.whatsapp.dto.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.response.Paging;

import java.util.List;

/**
 * The type Message templates.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record MessageTemplates(

        @JsonProperty("data") List<Template> data,

        @JsonProperty("paging") Paging paging) {
}