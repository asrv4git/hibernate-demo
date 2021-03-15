package com.github.hibernatedemo.models.models2;

import javax.persistence.Embeddable;

@Embeddable
//child table for Person class
public class ContactNumber {

    private String countryCode;

    private String number;

    public ContactNumber() {
    }

    public ContactNumber(String countryCode, String number) {
        this.countryCode = countryCode;
        if (number.length() > 10)
            throw new IllegalArgumentException("number cannot be longer than 10 in size");
        this.number = number;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (number.length() > 10)
            throw new IllegalArgumentException("number cannot be longer than 10 in size");
        this.number = number;
    }
}
