package net.optionfactory.whatsapp.dto.phone;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.optionfactory.whatsapp.dto.response.Paging;

import java.util.List;

/**
 * The Object with PhoneNumbers
 *
 * @param data   an objetc with a PhoneNumber list
 * @param paging paging
 */
public record PhoneNumbers(

        @JsonProperty("data") List<PhoneNumber> data,

        @JsonProperty("paging") Paging paging) {
}