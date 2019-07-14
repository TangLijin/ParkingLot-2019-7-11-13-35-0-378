package com.thoughtworks.tdd;

public class Ticket {
    private Car car;
    private String response  = null;

    public Ticket(Car car) {
        this.car = car;
    }

    public Ticket(Car car, String response) {
        this.car = car;
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
