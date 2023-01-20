package org.BlogWebApp;

public enum StatusResponce {
    SUCCESS("Success"), ERROR("Error");

    final private String status;

    StatusResponce(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
