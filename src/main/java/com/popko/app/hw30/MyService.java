package com.popko.app.hw30;

public class MyService {
    private String name;

    public MyService(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyService: " + name;
    }
}

