package net.optionfactory.whatsapp.dto.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlowParameters {
    @JsonProperty("mode")
    private String mode;
    @JsonProperty("flow_message_version")
    private String flowMessageVersion;
    @JsonProperty("flow_token")
    private String flowToken;
    @JsonProperty("flow_id")
    private String flowId;
    @JsonProperty("flow_cta")
    private String flowCta;
    @JsonProperty("flow_action")
    private String flowAction;
    @JsonProperty("flow_action_payload")
    private FlowActionPayload flowActionPayload;

    public String getMode() {
        return mode;
    }

    public String getFlowMessageVersion() {
        return flowMessageVersion;
    }

    public String getFlowToken() {
        return flowToken;
    }

    public String getFlowId() {
        return flowId;
    }

    public String getFlowCta() {
        return flowCta;
    }

    public String getFlowAction() {
        return flowAction;
    }

    public FlowActionPayload getFlowActionPayload() {
        return flowActionPayload;
    }

    public FlowParameters setMode(String mode) {
        this.mode = mode;
        return this;
    }

    public FlowParameters setFlowMessageVersion(String flowMessageVersion) {
        this.flowMessageVersion = flowMessageVersion;
        return this;
    }

    public FlowParameters setFlowToken(String flowToken) {
        this.flowToken = flowToken;
        return this;
    }

    public FlowParameters setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    public FlowParameters setFlowCta(String flowCta) {
        this.flowCta = flowCta;
        return this;
    }

    public FlowParameters setFlowAction(String flowAction) {
        this.flowAction = flowAction;
        return this;
    }

    public FlowParameters setFlowActionPayload(FlowActionPayload flowActionPayload) {
        this.flowActionPayload = flowActionPayload;
        return this;
    }
}
