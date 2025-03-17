import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
    private ArrayList<CustomerInformation> customers;
    private Scanner scanner;
    Boolean isCheckedIn;

    //Constructor
    public CustomerManager() {
        this.customers = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    //Another Constructor
    public void addCustomer(){
        System.out.println ("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println ("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println ("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println ("Enter license ID: ");
        String licenseID = scanner.nextLine();
        System.out.println ("Has customer checked in? (Enter y or n)");
        String checkedIn = scanner.nextLine();
        if (checkedIn == "y"){
            isCheckedIn = true;
        }
        else{
            isCheckedIn = false;
        }

        CustomerInformation newCustomer = new CustomerInformation(firstName, lastName, phoneNumber, licenseID, isCheckedIn);
        customers.add(newCustomer);
        System.out.println("Customer added successfully");
    }

    //search for customer
    public CustomerInformation searchCustomer(String licenseID){
        for (CustomerInformation customer : customers){
            if (customer.getLicenseID().equals(licenseID)){
                System.out.println("Would you like to see the customer's information? (Enter y or n)");
                String seeInfo = scanner.nextLine();
                if (seeInfo == "y"){
                    System.out.println("First name: " + customer.firstName + "\nLast name: " + customer.lastName + "\nPhone number: " + customer.phoneNumber + "\nLicense ID: " + customer.licenseID + "\nCustomer is checked in? " + customer.isCheckedIn);
                }
                return customer;
            }
        }
        return null;
    }

    public void updateCustomer(){
        System.out.println ("Enter the License ID of the customer to update: ");
        String licenseID = scanner.nextLine();
        CustomerInformation customer = searchCustomer(licenseID);

        if (customer != null){
            System.out.println ("Updating customer: " + customer.getFullName());

            System.out.println ("Enter new First Name (leave blank to keep current name): ");
            String firstName = scanner.nextLine();
            if (!firstName.isBlank()) customer.setFirstName(firstName);

            System.out.println ("Enter new Last Name (leave blank to keep current name): ");
            String lastName = scanner.nextLine();
            if (!lastName.isBlank()) customer.setLastName(lastName);

            System.out.println ("Enter new phone number (leave blank to keep current number): ");
            String phoneNumber = scanner.nextLine();
            if (!phoneNumber.isBlank()) customer.setPhoneNumber(phoneNumber);

            System.out.println ("Has customer checked in? (Enter y or n)");
        String checkedIn = scanner.nextLine();
        if (checkedIn == "y"){
            isCheckedIn = true;
        }
        else{
            isCheckedIn = false;
        }

            System.out.println("Customer information updated successfully");
        }
        else{
            System.out.println ("Customer not found");
        }
    }

    //Delete customer
    public void deleteCustomer(){
        System.out.println("Enter the License ID of the customer to delete: ");
        String licenseID = scanner.nextLine();
        CustomerInformation customer = searchCustomer(licenseID);

        if (customer != null){
            customers.remove(customer);
            System.out.println ("Customer deleted successfully");
        }
        else{
            System.out.println ("Customer not found");
        }
    }
}
