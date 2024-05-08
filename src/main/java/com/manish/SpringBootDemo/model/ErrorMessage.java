package com.manish.SpringBootDemo.model;

import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatusCode;

public class ErrorMessage {
    private HttpStatusCode status;
    private String message;

    public ErrorMessage() {
    }

    public ErrorMessage(HttpStatusCode status, String message) {
        this.status = status;
        this.message = message;
    }

    public HttpStatusCode getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setStatus(HttpStatusCode status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
