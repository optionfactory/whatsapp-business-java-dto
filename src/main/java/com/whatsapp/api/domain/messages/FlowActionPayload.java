package com.whatsapp.api.domain.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class FlowActionPayload {
    @JsonProperty("screen")
    private String screen;
    @JsonProperty("data")
    private Map<String, Object> data;

    public String getScreen() {
        return screen;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public FlowActionPayload setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public FlowActionPayload setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }
}
