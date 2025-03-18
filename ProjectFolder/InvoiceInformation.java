/*
Hotel Reservation System
Invoice Information
Created by: Cody Sandford and Wyatt Brusseau
*/

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceInformation {
    private double totalPricePerNight, otherCharges, totalPriceOfStay;
    private static ArrayList<InvoiceInformation> invoices = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private String customerName;

    // Constructor
    public InvoiceInformation(String customerName, double totalPricePerNight, double otherCharges, double totalPriceOfStay) {
        this.customerName = customerName;
        this.totalPricePerNight = totalPricePerNight;
        this.otherCharges = otherCharges;
        this.totalPriceOfStay = totalPriceOfStay;
    }

    // Create an Invoice
    public static void createInvoice() {
        System.out.println("Enter Customer Name: ");
        String customerName = scanner.nextLine();

        System.out.println("Enter total price per night: ");
        double pricePerNight = scanner.nextDouble();

        System.out.println("Enter number of nights: ");
        int numOfNights = scanner.nextInt();

        System.out.println("Enter other charges: ");
        double otherCharges = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        double totalPrice = (pricePerNight * numOfNights) + otherCharges;

        InvoiceInformation newInvoice = new InvoiceInformation(customerName, pricePerNight, otherCharges, totalPrice);
        invoices.add(newInvoice);

        System.out.println("Invoice added successfully!");
    }

    // Search for an invoice by customer name
    public static InvoiceInformation searchInvoice(String customerName) {
        for (InvoiceInformation invoice : invoices) {
            if (invoice.getCustomerName().equalsIgnoreCase(customerName)) {
                return invoice;
            }
        }
        return null;
    }

    // Update Invoice
    public static void updateInvoice() {
        System.out.println("Enter the customer's name for the invoice to update: ");
        String customerName = scanner.nextLine();
        InvoiceInformation invoice = searchInvoice(customerName);

        if (invoice != null) {
            System.out.println("Updating invoice for: " + customerName);
            System.out.println("Enter new price per night (leave as 0 to keep current): ");
            double pricePerNight = scanner.nextDouble();
            if (pricePerNight > 0) invoice.setTotalPricePerNight(pricePerNight);

            System.out.println("Enter new other charges (leave as 0 to keep current): ");
            double otherCharges = scanner.nextDouble();
            if (otherCharges > 0) invoice.setOtherCharges(otherCharges);

            invoice.calculateTotalPrice();
            System.out.println("Invoice updated successfully!");
        } else {
            System.out.println("Invoice not found.");
        }
    }

    // Delete Invoice
    public static void deleteInvoice() {
        System.out.println("Enter the customer name for the invoice to delete: ");
        String customerName = scanner.nextLine();
        InvoiceInformation invoice = searchInvoice(customerName);

        if (invoice != null) {
            invoices.remove(invoice);
            System.out.println("Invoice deleted successfully.");
        } else {
            System.out.println("Invoice not found.");
        }
    }

    // Show invoice
    public static void showInvoice() {
        System.out.println("Enter the customer name for the invoice to display: ");
        String customerName = scanner.nextLine();
        InvoiceInformation invoice = searchInvoice(customerName);

        if (invoice != null) {
            System.out.println("\nInvoice Details: ");
            System.out.println("Customer Name: " + invoice.getCustomerName());
            System.out.println("Price per Night: $" + invoice.getTotalPricePerNight());
            System.out.println("Other Charges: $" + invoice.getOtherCharges());
            System.out.println("Total Price of Stay: $" + invoice.getTotalPriceOfStay());
        } else {
            System.out.println("Invoice not found.");
        }
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPricePerNight() {
        return totalPricePerNight;
    }

    public double getOtherCharges() {
        return otherCharges;
    }

    public double getTotalPriceOfStay() {
        return totalPriceOfStay;
    }

    // Setter methods
    public void setTotalPricePerNight(double totalPricePerNight) {
        this.totalPricePerNight = totalPricePerNight;
    }

    public void setOtherCharges(double otherCharges) {
        this.otherCharges = otherCharges;
    }

    public void calculateTotalPrice() {
        this.totalPriceOfStay = this.totalPricePerNight + this.otherCharges;
    }
}
