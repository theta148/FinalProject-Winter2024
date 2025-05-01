package org.example;

public class Customer extends User{
    public Customer(String name, String email, String id) {
        super(name, email, id);
    }

    @Override
    public void accessSystem() {
        System.out.println(name + " (Customer) has accessed into the system.");
    }

    /**
     * Allows a customer to buy a vehicle.
     * @param vehicle Vehicle
     */
    public void buyVehicle(Vehicle vehicle) {
        System.out.println(name + " is purchasing a " + vehicle.getVersion() + " " + vehicle.getModel() + " for $" + vehicle.getPrice());
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
