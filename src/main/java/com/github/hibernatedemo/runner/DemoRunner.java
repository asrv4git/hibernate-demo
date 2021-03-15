/*
package com.github.hibernatedemo.runner;

import com.github.hibernatedemo.models.*;
import com.github.hibernatedemo.models.models2.Book;
import com.github.hibernatedemo.models.models2.ContactNumber;
import com.github.hibernatedemo.models.models2.Person;
import com.github.hibernatedemo.models.models2.ProductOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManagerFactory;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.Vector;

@Component
public class DemoRunner implements CommandLineRunner {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    @Override
    public void run(String... args) throws Exception {

        SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);

        //add new application
        Application application1 = new Application();
        application1.setApplicationDescription("application1 description");

        Application application2 = new Application();
        application2.setApplicationDescription("application2 description");

        //add new drivingLicence
        DrivingLicence drivingLicence1 = new DrivingLicence();
        drivingLicence1.setIssueBy("RTO Indore");

        DrivingLicence drivingLicence2 = new DrivingLicence();
        drivingLicence2.setIssueBy("Gurugram RTO");

        //add book
        Book book1 = new Book();
        book1.setBookName("Sapiens");

        Book book2 = new Book();
        book2.setBookName("The clash of Nations");

        //add Vehicles
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setvName("Car");

        TwoWheeler bike = new TwoWheeler();
        bike.setvName("Apache");
        bike.setSteeringHandle("Bike Handle");

        FourWheeler mercedes = new FourWheeler();
        mercedes.setvName("S class");
        mercedes.setSteeringWheel("Car Handle");


        Vehicle vehicle2 = new Vehicle();
        vehicle2.setvName("Bike");

        //add order
        ProductOrder order1 = new ProductOrder(new Date(System.currentTimeMillis()-86877687),"Laptop");
        ProductOrder order2 = new ProductOrder(new Date(System.currentTimeMillis()-181697697),"Mobile");

        ProductOrder order3 = new ProductOrder(new Date(System.currentTimeMillis()),"Pen Drive");
        ProductOrder order4 = new ProductOrder(new Date(System.currentTimeMillis()-186697697),"Car Washer");


        //addNewUserDetails
        UserDetails userDetails = new UserDetails();
        userDetails.setUserId(1);
        userDetails.setUserName("Anmol");
        userDetails.setDateOfJoining(new Date());
        userDetails.setDescription("Description of first user");
        userDetails.setDrivingLicence(drivingLicence1);
        userDetails.getVehicle().addAll(Set.of(vehicle1, vehicle2));
        userDetails.getApplicationsAppliedTo().addAll(Set.of(application1, application2));

        application1.getAppliedBy().addAll(List.of(userDetails));
        application2.getAppliedBy().addAll(List.of(userDetails));


        vehicle1.setUserDetails(userDetails);
        vehicle2.setUserDetails(userDetails);

        drivingLicence1.setUserDetails(userDetails);


//        userDetails.setAddress(new Address("18th Lincoln Street","New York", 122012));
        */
/*userDetails.getListOfAddress().addAll(Set.of(new Address("First street","city 1", 12201),
                new Address("Second street","city 2", 12201),
                new Address("Third street","city 3", 12202)));*//*

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(userDetails);



        session.save(vehicle1);
        session.save(vehicle2);
        session.save(bike);
        session.save(mercedes);

        session.save(application1);
        session.save(application2);

//        session.getTransaction().commit();
//        session.close();

//        userDetails = null;

//        session = sessionFactory.openSession();
//        session.beginTransaction();

        Person person1 = new Person();
        person1.setFirstName("Ken"); person1.setLastName("Miles");
        person1.setAge(45);
        person1.setAddress(new Address("Baker Street", "San Francisco", 4238474));
        person1.setOrders(List.of(order3,order4));
        person1.setBooksReadByPerson(Set.of(book1, book2));

        person1.setContactNumbers(List.of(
                new ContactNumber("+91", "987336732"),
                new ContactNumber("+1", "652345773")
        ));
        person1.setPersonDrivingLicence(drivingLicence1);

        Person person2 = new Person();
        person2.setFirstName("Mark"); person2.setLastName("Webber");
        person2.setAge(37);
        person2.setAddress(new Address("Lincoln Street", "New York", 42384576));
        person2.setOrders(List.of(order2,order1));
        person2.setContactNumbers(List.of(
                new ContactNumber("+91", "987338932"),
                new ContactNumber("+1", "751345773")
        ));
        person2.setPersonDrivingLicence(drivingLicence2);
        person2.setBooksReadByPerson(Set.of(book1));


        drivingLicence1.setPerson(person1);
        drivingLicence2.setPerson(person2);

        book1.setBookReadByPersons(Set.of(person1, person2));
        book2.setBookReadByPersons(Set.of(person2));

        order1.setPersonWhoPutThisOrder(person2);
        order2.setPersonWhoPutThisOrder(person2);
        order3.setPersonWhoPutThisOrder(person1);
        order4.setPersonWhoPutThisOrder(person1);

        session.save(drivingLicence1);
        session.save(drivingLicence2);

        session.save(order1);
        session.save(order2);

        session.save(order3);
        session.save(order4);

        session.save(book1);
        session.save(book2);

        //persist person
        session.persist(person1);
        session.persist(person2);





        session.getTransaction().commit();
        session.close();
    }
}*/
