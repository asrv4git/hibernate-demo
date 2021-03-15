package com.github.hibernatedemo.models;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.util.*;

@Entity
public class UserDetails {

    @Id
    private Integer userId;

    //    do not persist this column
    //    @Transient
    private String userName;

    //    @Lob
    private String description;

    //store only date
    @Temporal(TemporalType.DATE)
    private Date dateOfJoining;

    /*@Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street", column =@Column(name = "street_name")),
            @AttributeOverride(name="city",column =@Column(name = "city_name")),
            @AttributeOverride(name="pincode",column =@Column(name = "zipcode"))
    })
    private Address address;*/

    /*@ElementCollection
    fix weird name of table
    @JoinTable(name = "user_address",
    joinColumns = {
            @JoinColumn(name = "userId"), //fix weird name of ID
    })
    private Set<Address> listOfAddress = new HashSet();*/

    /*@ElementCollection(fetch = FetchType.EAGER)
    @JoinTable(name = "user_address",
            joinColumns = @JoinColumn(name = "userId")) //fix weird name of ID
   */
    //to add a Id to the new child table
    /* @GenericGenerator(name ="increment-gen", strategy = "increment")
    @CollectionId(columns = {@Column(name="address_id")}, type =@Type(type = "long"), generator ="increment-gen") //provided by hibernate only
   private Collection<Address> listOfAddress = new ArrayList();*/

    /*public Set<Address> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(Set<Address> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }*/

    /*public Collection<Address> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(Collection<Address> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }*/

    @OneToMany(mappedBy = "userDetails", cascade = CascadeType.ALL)
    private Collection<Vehicle> vehicle = new ArrayList();

    @OneToOne
    @JoinColumn(name = "dl_id")
    //Specifies a column for joining an entity association or element
    //collection.
    private DrivingLicence drivingLicence;

    @ManyToMany(mappedBy = "appliedBy")
    private Collection<Application> applicationsAppliedTo = new LinkedHashSet();

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setVehicle(Collection<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    public Collection<Vehicle> getVehicle() {
        return vehicle;
    }

    /*    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/

    public DrivingLicence getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(DrivingLicence drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public Collection<Application> getApplicationsAppliedTo() {
        return applicationsAppliedTo;
    }

    public void setApplicationsAppliedTo(Collection<Application> applicationsAppliedTo) {
        this.applicationsAppliedTo = applicationsAppliedTo;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", dateOfJoining=" + dateOfJoining +
                ", vehicle=" + vehicle +
                ", drivingLicence=" + drivingLicence +
                ", applicationsAppliedTo=" + applicationsAppliedTo +
                '}';
    }
}
