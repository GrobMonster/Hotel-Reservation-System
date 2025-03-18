/*
Hotel Reservation System
Invoice Information
Created by: Cody Sandford and Wyatt Brusseau

*/
import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceInformation{
    private ArrayList<InvoiceInformation> invoices;
    private Scanner scanner;

    //Constructor
    public InvoiceInformation(){
        this.invoices = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    //Create an Invoice
    public void createInvoice(ReservationManager reservation){
        System.out.println("Enter total price per night: ");
        double pricePerNight = scanner.nextDouble();

        System.out.println("Enter other charges: ");
        double otherCharges = scanner.nextDouble();

        double totalPrice = (pricePerNight * reservation.getNumOfNights()) + otherCharges;

        InvoiceInformation newInvoice = new InvoiceInformation(pricePerNight, otherCharges, totalPrice);
        invoices.add(newInvoice);

        System.out.println("Invoice added successfully");
    }

    // Search for an invoice by customer name
    public InvoiceInformation searchInvoice(String customerName) {
        for (InvoiceInformation invoice : invoices) {
            if (invoice.getCustomerName().equalsIgnoreCase(customerName)) {
                return invoice;
            }
        }
        return null;
    }

    //Update Invoice
    public void updateInvoice(){
        System.out.println("Enter the customer's name for the invoice to update: ");
        String customerName = scanner.nextLine();
        InvoiceInformation invoice = searchInvoice(customerName);

        if (invoice != null){
            System.out.println("Updating invoice for: " + customerName);
            System.out.println("Enter new price per night (leave as 0 to keep current): ");
            double pricePerNight = scanner.nextDouble();
            if (pricePerNight > 0) invoice.setTotalPricePerNight(pricePerNight);

            System.out.println("Enter new other charges (leave as 0 to keep current): ");
            double otherCharges = scanner.nextDouble();
            if (otherCharges > 0) invoice.setOtherCharges(otherCharges);

            double totalPrice = (invoice.getTotalPricePerNight() * invoice.getNumOfNights() + invoice.getOtherCharges());
            invoice.setTotalPriceOfStay(totalPrice);

            System.out.println("Invoice updated successfully");
        }
        else{
            System.out.println("Invoice not found");
        }
    }

    //Delete Invoice
    public void deleteInvoice(){
        System.out.println("Enter the customer name for the invoice to delete: ");
        String customerName = scanner.nextLine();
        InvoiceInformation invoice = searchInvoice(customerName);

        if (invoice != null){
            invoices.remove(invoice);
            System.out.println("Invoice deleted successfully");
        }
        else{
            System.out.println("Invoice not found");
        }
    }

    //Show invoice
    public void showInvoice(){
        System.out.println("Enter the customer name for the invoice to display: ");
        String customerName = scanner.nextLine();
        InvoiceInformation invoice = searchInvoice(customerName);

        if (invoice != null){
            System.out.println("\nInvoice Details: ");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Price per Night: $" + invoice.getTotalPricePerNight());
            System.out.println("Other Charges: $" + invoice.getOtherCharges());
            System.out.println("Total Price of Stay: $" + invoice.getTotalPriceOfStay());
        }
        else{
            System.out.println("Invoice not found");
        }
    }

    //Show all invoices
    public void listAllInvoices(){
        if (invoices.isEmpty()){
            System.out.println("No invoices found");
            return;
        }

        for (InvoiceInformation invoice : invoices){
            System.out.println("\nInvoice Details: ");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Price per Night: $" + invoice.getTotalPricePerNight());
            System.out.println("Other Charges: $" + invoice.getOtherCharges());
            System.out.println("Total Price of Stay: $" + invoice.getTotalPriceOfStay());
        }
    }
}
