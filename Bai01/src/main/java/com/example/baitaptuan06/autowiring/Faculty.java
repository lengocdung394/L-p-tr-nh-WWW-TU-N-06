package com.example.baitaptuan06.autowiring;

public class Faculty {
    private  String id;
    private  String name;

    public Faculty() {
    }

    public Faculty(String id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Faculty{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
