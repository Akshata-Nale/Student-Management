package com.akshata.studentManagement;

public class Student {

    private String name;
    private int age;
    private int id;
    private String state;

    public Student(String name, int age, int id, String state) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getid() {
        return id;
    }

    public void setAdmNo(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
