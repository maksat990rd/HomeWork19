package com.company;

import java.time.LocalDate;

public class Car implements AutoCloseable {
    private String name;
    private String brand;
    private String color;
    private double volume;
    private LocalDate yearOfIssue;

    public Car() {
    }

    public Car(String name, String brand, String color, double volume, LocalDate yearOfIssue) {
        this.name = name;
        this.brand = brand;
        this.color = color;
        this.volume = volume;
        this.yearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car name: " + name + '\'' +
                ", brand: " + brand + '\'' +
                ", color: " + color + '\'' +
                ", volume: " + volume +
                ", yearOfIssue: " + yearOfIssue;
    }

    public void drive() {
        System.out.println("The " + name + " is driving.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("The " + name + " car is closing.");

    }
}
