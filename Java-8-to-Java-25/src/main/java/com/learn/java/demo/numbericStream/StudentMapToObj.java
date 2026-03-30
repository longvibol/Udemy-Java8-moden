package com.learn.java.demo.numbericStream;
class StudentMapToObj {
    int id;
    String name;

    public StudentMapToObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + "-" + name;
    }
}