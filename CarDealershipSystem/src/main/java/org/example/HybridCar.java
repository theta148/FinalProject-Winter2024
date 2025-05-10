package org.example;

public class HybridCar extends Vehicle{
    public HybridCar(String version, String model, int year, double price) {
        super(version, model, year, price);
    }

    @Override
    public void displayInfo() {
        System.out.println(year + " " + version + " " + model + " - $" + price);
    }

    /**
     * Test drive a hybrid car.
     */
    public void testDrive() {
        System.out.println("Test-driving the " + version + " has the best of both worlds.");
    }

}
