package com.RedirectSpring.entity;

public class Address {
    private String City;
    private String State;

    @Override
    public String toString() {
        return "Address{" +
                "City='" + City + '\'' +
                ", State='" + State + '\'' +
                '}';
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }
}
