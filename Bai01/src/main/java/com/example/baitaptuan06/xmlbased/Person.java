package com.example.baitaptuan06.xmlbased;

import java.util.List;

public class Person {
    private int age;
    private String name;
    private List<Address> address;
    private List<String> emails;

    public Person() {
    }

    public Person(int age, String name, List<Address> address, List<String> emails) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.emails = emails;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", emails=" + emails +
                '}';
    }
}
