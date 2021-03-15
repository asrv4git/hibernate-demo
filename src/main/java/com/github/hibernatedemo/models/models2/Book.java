package com.github.hibernatedemo.models.models2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;
import java.util.HashSet;

@Entity
public class Book {
    @Id
    @GeneratedValue
    Integer bookId;
    String bookName;

    @ManyToMany(mappedBy = "booksReadByPerson") //don't create another table
            Collection<Person> bookReadByPersons = new HashSet();

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Collection<Person> getBookReadByPersons() {
        return bookReadByPersons;
    }

    public void setBookReadByPersons(Collection<Person> bookReadByPersons) {
        this.bookReadByPersons = bookReadByPersons;
    }
}
