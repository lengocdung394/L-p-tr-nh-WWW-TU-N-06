package com.example.baitaptuan06.xmlbased;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private Class_ class_;
    private List<Address> addresses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String id, String name, Class_ class_) {
        this.id = id;
        this.name = name;
        this.class_ = class_;
    }

    public Class_ getClass_() {
        return class_;
    }

    public Student() {
    }

    public void setClass_(Class_ class_) {
        this.class_ = class_;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
