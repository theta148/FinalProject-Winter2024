package org.example;

public class ElectricCar extends Vehicle{
    public ElectricCar(String version, String model, int year, double price) {
        super(version, model, year, price);
    }

    @Override
    public void displayInfo() {
        System.out.println(year + " " + version + " " + model + " - $" + price);
    }

    /**
     * Test drive an electric car.
     */
    public void testDrive() {
        System.out.println("Test-driving the " + version + " more quiet than a ags car.");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "version='" + version + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
