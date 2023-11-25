package addressbook;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    private ArrayList<Contacts> contactList;

    public AddressBookMain(){
        this.contactList = new ArrayList<>();
    }
    public void addContact(Contacts contact){
        contactList.add(contact);
    }

    public void editContact(String firstName, String lastName){
        for(Contacts contact : contactList){
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
                System.out.println("\n\nEditing "+contact.getFirstName()+"'s details:");
                contact.editDetails();
                System.out.println();
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to address book program");

        AddressBookMain addressBook = new AddressBookMain();
        Contacts contact1 = new Contacts("Jane", "doe", "Suite 911 44954 Flat Port", "Galen", "ND", "7245", "77383278", "janedoe@gmail.com");
        addressBook.addContact(contact1);
        contact1.printDetails();


        Contacts contact2 = new Contacts();
        contact2.getDetails();
        addressBook.addContact(contact1);
        contact2.printDetails();

        //Editing existing Contact
        addressBook.editContact("Jane", "doe");
        contact1.printDetails();

    }
}
