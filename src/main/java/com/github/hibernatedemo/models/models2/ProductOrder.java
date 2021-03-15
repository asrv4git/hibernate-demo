package com.github.hibernatedemo.models.models2;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProductOrder {
    @Id
    @GeneratedValue
    private Integer orderId;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    private String orderedItem;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person personWhoPutThisOrder;

    public ProductOrder() {
    }

    public ProductOrder(Date orderDate, String orderedItem) {
        this.orderDate = orderDate;
        this.orderedItem = orderedItem;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderedItem() {
        return orderedItem;
    }

    public void setOrderedItem(String orderedItem) {
        this.orderedItem = orderedItem;
    }

    public Person getPersonWhoPutThisOrder() {
        return personWhoPutThisOrder;
    }

    public void setPersonWhoPutThisOrder(Person personWhoPutThisOrder) {
        this.personWhoPutThisOrder = personWhoPutThisOrder;
    }
}
