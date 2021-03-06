package org.activiti.api.process.model.builders;

import org.activiti.api.process.model.payloads.StartProcessPayload;

import java.util.HashMap;
import java.util.Map;

public class StartProcessPayloadBuilder {

    private String processDefinitionId;
    private String processDefinitionKey;
    private String processInstanceName;
    private String businessKey;
    private Map<String, Object> variables = new HashMap<>();

    public StartProcessPayloadBuilder withVariables(Map<String, Object> variables) {
        this.variables = variables;
        return this;
    }

    public StartProcessPayloadBuilder withVariable(String name,
                                                   Object value) {
        if (this.variables == null) {
            this.variables = new HashMap<>();
        }
        this.variables.put(name,
                value);
        return this;
    }

    public StartProcessPayloadBuilder withBusinessKey(String businessKey) {
        this.businessKey = businessKey;
        return this;
    }

    public StartProcessPayloadBuilder withProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
        return this;
    }

    public StartProcessPayloadBuilder withProcessInstanceName(String processInstanceName) {
        this.processInstanceName = processInstanceName;
        return this;
    }

    public StartProcessPayloadBuilder withProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
        return this;
    }

    public StartProcessPayload build() {
        return new StartProcessPayload(processDefinitionId,
                processDefinitionKey,
                processInstanceName,
                businessKey,
                variables);
    }
}
