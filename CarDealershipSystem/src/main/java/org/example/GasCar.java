package org.example;

public class GasCar extends Vehicle{
    public GasCar(String version, String model, int year, double price) {
        super(version, model, year, price);
    }

    @Override
    public void displayInfo() {
        System.out.println(year + " " + version + " " + model + " - $" + price);
    }

    /**
     * Test drive a gas car.
     */
    public void testDrive() {
        System.out.println("Test-driving the " + version);
    }

    @Override
    public String toString() {
        return "GasCar{" +
                "version='" + version + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
