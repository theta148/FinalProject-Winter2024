package org.example;

public class Manager extends User{
    public Manager(String name, String email, String id) {
        super(name, email, id);
    }

    @Override
    public void accessSystem() {
        System.out.println(name + " (Manager) has accessed into the system.");
    }

    /**
     * Allows a manager to buy a vehicle.
     * @param vehicle Vehicle
     */
    public void buyVehicle(Vehicle vehicle) {
        System.out.println(name + " is purchasing a " + vehicle.getVersion() + " " + vehicle.getModel() + " for $" + vehicle.getPrice());
    }

    /**
     * Allows the manager to view sales report.
     */
    public void viewSalesReport() {
        System.out.println(name + "is viewing the sales report.");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
