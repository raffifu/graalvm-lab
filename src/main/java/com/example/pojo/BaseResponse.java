package com.example.pojo;

import io.micronaut.core.annotation.Introspected;

import java.time.Instant;

@Introspected
public class BaseResponse<T> {
    Integer status;
    String timestamp;
    T response;

    public BaseResponse(Integer status, T response) {
        this.timestamp = Instant.now().toString();
        this.status = status;
        this.response = response;
    }

    public Integer getStatus() {
        return status;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public T getResponse() {
        return response;
    }
}
