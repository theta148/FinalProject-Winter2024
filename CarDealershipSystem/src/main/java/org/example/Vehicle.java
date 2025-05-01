package org.example;

import java.util.Objects;

public abstract class Vehicle {
    protected String version;
    protected String model;
    protected int year;
    protected double price;

    public Vehicle(String version, String model, int year, double price) {
        this.version = version;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Displays the car model, version, year, and price.
     */
    public abstract void displayInfo();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return year == vehicle.year && Double.compare(price, vehicle.price) == 0 && Objects.equals(version, vehicle.version) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, model, year, price);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "version='" + version + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
