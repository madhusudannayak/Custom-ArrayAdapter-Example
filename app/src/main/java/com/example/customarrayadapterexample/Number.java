package com.example.customarrayadapterexample;

public class Number {
    private String name;

    private int number;

    private int imageResourceId;

    public Number(String name, int number, int imageResourceId)
    {
        this.name=name;
        this.number=number;
        this.imageResourceId=imageResourceId;

    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
}
