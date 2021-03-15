package com.github.hibernatedemo.models;

import com.github.hibernatedemo.models.models2.Person;

import javax.persistence.*;

@Entity
public class DrivingLicence {
    @Id
    @GeneratedValue
    private Integer dId;

    private String issueBy;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserDetails userDetails;

    @OneToOne
    //set the name of foreign id
    @JoinColumn(name = "person_id_who_own_this_dl")
    private Person person;

    public DrivingLicence() {
    }

    public DrivingLicence(Integer dId, String issueBy) {
        this.dId = dId;
        this.issueBy = issueBy;
    }

    public Integer getDId() {
        return dId;
    }

    public void setDId(Integer dId) {
        this.dId = dId;
    }

    public String getIssueBy() {
        return issueBy;
    }

    public void setIssueBy(String issueBy) {
        this.issueBy = issueBy;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "DrivingLicence{" +
                "dId=" + dId +
                ", issueBy='" + issueBy + '\'' +
                ", userDetails=" + userDetails.getUserId() +
                '}';
    }
}
