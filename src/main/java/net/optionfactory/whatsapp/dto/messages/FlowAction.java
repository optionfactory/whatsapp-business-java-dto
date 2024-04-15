package net.optionfactory.whatsapp.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlowAction extends Action {

    @JsonProperty("name")
    private String name;

    @JsonProperty("parameters")
    private FlowParameters parameters;

    public FlowAction setName(String name) {
        this.name = name;
        return this;
    }

    public FlowAction setParameters(FlowParameters parameters) {
        this.parameters = parameters;
        return this;
    }

}
