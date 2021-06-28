package com.model;

public class Car {
    int id;
    int cubicCapacity;
    String name;
    String type;
    String brand;
    String material;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Car(int id, int cubicCapacity, String name, String type, String brand, String material) {
        this.id = id;
        this.cubicCapacity = cubicCapacity;
        this.name = name;
        this.type = type;
        this.brand = brand;
        this.material = material;
    }
}
