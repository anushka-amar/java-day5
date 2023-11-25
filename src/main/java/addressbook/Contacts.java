package addressbook;

import java.util.Scanner;

public class Contacts {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone_number;
    private String email;

    public Contacts(){
        this("", "", "", "", "", "", "", "");
    }

    public Contacts(String firstName, String lastName, String address, String city, String state, String zip, String phone_number, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void getDetails(){
        System.out.println("\n\nEnter the details for new contact");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        this.firstName = sc.nextLine();

        System.out.println("Enter last name");
        this.lastName = sc.nextLine();

        System.out.println("Enter address name");
        this.address = sc.nextLine();

        System.out.println("Enter city");
        this.city = sc.nextLine();

        System.out.println("Enter state");
        this.state = sc.nextLine();

        System.out.println("Enter zip");
        this.zip = sc.nextLine();

        System.out.println("Enter phone_number");
        this.phone_number = sc.nextLine();

        System.out.println("Enter email");
        this.email = sc.nextLine();

    }

    public void editDetails(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter new first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter new last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter new address: ");
        this.address = scanner.nextLine();

        System.out.print("Enter new city: ");
        this.city = scanner.nextLine();

        System.out.print("Enter new state: ");
        this.state = scanner.nextLine();

        System.out.print("Enter new zip: ");
        this.zip = scanner.nextLine();

        System.out.print("Enter new phone number: ");
        this.phone_number = scanner.nextLine();

        System.out.print("Enter new email: ");
        this.email = scanner.nextLine();
    }

    public void printDetails(){
        System.out.println("Contact details for "+ firstName+" "+lastName+" is:-");
        System.out.println("Address: "+address+", "+city+", "+state+", "+zip);
        System.out.println("Phone number "+phone_number);
        System.out.println("Email: "+email+"\n\n");

    }
}
