package net.optionfactory.whatsapp.dto.templates.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.templates.Component;
import net.optionfactory.whatsapp.dto.templates.type.Category;

import java.util.List;

/**
 * The type Data item.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record Template(

        @JsonProperty("components") List<Component<?>> components,

        @JsonProperty("name") String name,

        @JsonProperty("language") String language,

        @JsonProperty("id") String id,

        @JsonProperty("category") Category category,
        @JsonProperty("previous_category") Category previousCategory,
        @JsonProperty("status") String status) {
}