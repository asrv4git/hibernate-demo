package com.github.hibernatedemo.models;

import javax.persistence.Embeddable;


@Embeddable
public class Address {

    private String street;

    private String city;

    private Integer pincode;

    public String getStreet() {
        return street;
    }

    public Address() {
    }

    public Address(String street, String city, Integer pincode) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
