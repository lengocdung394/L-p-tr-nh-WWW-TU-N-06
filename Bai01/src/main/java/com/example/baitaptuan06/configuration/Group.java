package com.example.baitaptuan06.configuration;

public class Group {
    private  String groupName;
    private  int id;
    public Group(String groupName, int id) {
        this.groupName = groupName;
        this.id = id;
    }

    public Group(String groupName) {
        this.groupName = groupName;
    }



    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}
