package com.example.slackbot.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

public class AdaptiveCardTaskFetchValue<T> {
    @JsonProperty(value = "msteams")
    private Object type = new HashMap<String, String>() {{
        put("type", "task/fetch");
    }};

    @JsonProperty(value = "data")
    private T data;

    public Object getType() {
        return type;
    }

    public void setType(Object type) {
        this.type = type;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
