package com.github.hibernatedemo.models.models2;

import com.github.hibernatedemo.models.Address;
import com.github.hibernatedemo.models.DrivingLicence;

import javax.persistence.*;
import java.util.*;

@Entity
//Parent table for Order class
public class Person {
    @Id
    @GeneratedValue()
    private Integer personId;

    @Column(name = "person_first_name")
    private String firstName;

    @Column(name = "person_last_name")
    private String lastName;

    @Column(name = "person_age")
    private Integer age;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "address_street")),
            @AttributeOverride(name = "city", column = @Column(name = "address_city")),
            @AttributeOverride(name = "pincode", column = @Column(name = "address_zipcode"))
    })
    private Address address;

    @ElementCollection
    @JoinTable(name = "person_contact_numbers",//name of child table created
            joinColumns = @JoinColumn(name = "person_id")
            //The name of the foreign key columns
    )

    List<ContactNumber> contactNumbersList = new ArrayList();

    @OneToOne
    //set the name of foreign key
    @JoinColumn(name = "person_driving_license_id")
    DrivingLicence personDrivingLicence;

    @OneToMany
    //@OneToMany(mappedBy = "personWhoPutThisOrder") //used when we don't want to create a separate table
    @JoinTable(name = "order_made_by_person", joinColumns = @JoinColumn
            (name = "person_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
    List<ProductOrder> orders = new LinkedList<>();

    @ManyToMany
    Collection<Book> booksReadByPerson = new HashSet();

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ProductOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<ProductOrder> orders) {
        this.orders = orders;
    }

    public List<ContactNumber> getContactNumbersList() {
        return contactNumbersList;
    }

    public void setContactNumbers(List<ContactNumber> contactNumbersList) {
        this.contactNumbersList = contactNumbersList;
    }

    public void setContactNumbersList(List<ContactNumber> contactNumbersList) {
        this.contactNumbersList = contactNumbersList;
    }

    public DrivingLicence getPersonDrivingLicence() {
        return personDrivingLicence;
    }

    public void setPersonDrivingLicence(DrivingLicence personDrivingLicence) {
        this.personDrivingLicence = personDrivingLicence;
    }

    public Collection<Book> getBooksReadByPerson() {
        return booksReadByPerson;
    }

    public void setBooksReadByPerson(Collection<Book> booksReadByPerson) {
        this.booksReadByPerson = booksReadByPerson;
    }
}
