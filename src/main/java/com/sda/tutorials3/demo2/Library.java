package com.sda.tutorials3.demo2;

import com.sda.tutorials3.demo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Library {

    private String address;
    private List<Book> booksInLibrary;

    private UserService userService;

    @Autowired
    public Library(UserService userService) {
        this.userService = userService;
    }

    public String login(){
        return userService.login();
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBooksInLibrary() {
        return booksInLibrary;
    }

    public void setBooksInLibrary(List<Book> booksInLibrary) {
        this.booksInLibrary = booksInLibrary;
    }

    @Override
    public String toString() {
        return "Library{" +
                "address='" + address + '\'' +
                ", booksInLibrary=" + booksInLibrary +
                '}';
    }
}
