package org.BlogWebApp;

import com.google.gson.JsonElement;

public class StandardResponse {
    private StatusResponce status;
    private String message;
    private JsonElement data;

    public StandardResponse() {
    }

    public StandardResponse(StatusResponce status) {
        this.status = status;
    }

    public StandardResponse(StatusResponce status, String message) {
        this.status = status;
        this.message = message;
    }

    public StandardResponse(StatusResponce status, JsonElement data) {
        this.status = status;
        this.data = data;
    }

}
