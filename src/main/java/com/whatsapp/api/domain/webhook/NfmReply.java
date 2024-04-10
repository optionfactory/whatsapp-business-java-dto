package com.whatsapp.api.domain.webhook;

import com.fasterxml.jackson.annotation.JsonProperty;

public record NfmReply(
        @JsonProperty("name") String name,
        @JsonProperty("body") String body,
        @JsonProperty("response_json") String responseJson
) {
}
