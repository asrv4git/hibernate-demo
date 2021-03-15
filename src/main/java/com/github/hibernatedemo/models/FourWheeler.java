package com.github.hibernatedemo.models;

import javax.persistence.Access;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("four_wheeler_vehicle")
public class FourWheeler extends Vehicle {
    private String steeringWheel;

    //    @Access(A)
    public String getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(String steeringWheel) {
        this.steeringWheel = steeringWheel;
    }
}
