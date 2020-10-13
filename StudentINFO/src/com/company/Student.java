package com.company;

import java.util.Date;

public class Student {
    private String name;
    private String surName;
    private Gender gender;
    private Date date;

    public Student(String name, String surName, Gender gender, Date date) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }
}
