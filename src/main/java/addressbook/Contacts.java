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

    public void printDetails(){
        System.out.println("Contact details for "+ firstName+" "+lastName+" is:-");
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Address: "+address);
        System.out.println("City: "+city);
        System.out.println("State: "+state);
        System.out.println("Zip " +zip);
        System.out.println("Phone number "+phone_number);
        System.out.println("Email: "+email);

    }
}
