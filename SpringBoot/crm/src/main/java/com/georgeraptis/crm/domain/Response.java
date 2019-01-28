package com.georgeraptis.crm.domain;

import java.io.Serializable;

public class Response implements Serializable {

    private static final long serialVersionUID = 6710935610970327805L;
    private String message;

    public Response(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
