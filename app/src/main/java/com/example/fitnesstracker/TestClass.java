package com.example.fitnesstracker;

public class TestClass {
    private String id;
    private String name;

    public TestClass() {
        // Default constructor required for calls to DataSnapshot.getValue(TestClass.class)
    }

    public TestClass(String id, String name) {
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
}
