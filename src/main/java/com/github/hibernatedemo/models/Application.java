package com.github.hibernatedemo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.LinkedHashSet;

@Entity
public class Application {

    @Id
    @GeneratedValue
    private Integer id;


    private String applicationDescription;

    @ManyToMany
    private Collection<UserDetails> appliedBy = new LinkedHashSet();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Collection<UserDetails> getAppliedBy() {
        return appliedBy;
    }

    public void setAppliedBy(Collection<UserDetails> appliedBy) {
        this.appliedBy = appliedBy;
    }

    public String getApplicationDescription() {
        return applicationDescription;
    }

    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", applicationDescription='" + applicationDescription + '\'' +
                ", appliedBy=" + appliedBy +
                '}';
    }
}
