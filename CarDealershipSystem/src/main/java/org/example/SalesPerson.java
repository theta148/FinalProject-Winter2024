package org.example;

public class SalesPerson extends User{
    public SalesPerson(String name, String email, String id) {
        super(name, email, id);
    }

    @Override
    public void accessSystem() {
        System.out.println(name + " (Salesperson) has accessed into the system.");
    }

    /**
     * Allows the salesperson to view sales report.
     */
    public void viewSalesReport() {
        System.out.println(name + "is viewing the sales report.");
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
