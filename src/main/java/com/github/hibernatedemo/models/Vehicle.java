package com.github.hibernatedemo.models;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Vehical_type")
public class Vehicle {
    @Id
    @GeneratedValue
    private Integer vehicalId;
    private String vName;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDetails userDetails;

    public Integer getVehicalId() {
        return vehicalId;
    }

    public void setVehicalId(Integer vehicalId) {
        this.vehicalId = vehicalId;
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicalId=" + vehicalId +
                ", vName='" + vName + '\'' +
                ", userDetails=" + userDetails.getUserId() +
                '}';
    }
}
