package com.example.demo;

public class student {

    private String id;
    private String name;
    private String section;
    private String status;

    student()
    {

    }

    public student(String id, String name, String section, String status) {
        this.id = id;
        this.name = name;
        this.section = section;
        this.status = status;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
