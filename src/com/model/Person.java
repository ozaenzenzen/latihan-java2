package com.model;

import java.util.Date;

public class Person {
    int id;
    String name;
    String address;
    String job;
    Date birth;

    public Person(int id, String name, String address, String job, Date birth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.job = job;
        this.birth = birth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }
}
