package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooksCollection;

    public AddressBookSystem() {
        this.addressBooksCollection = new HashMap<>();
    }

    public void addAddressBook(String name){ //acting as a setter method
        if(!addressBooksCollection.containsKey(name)){
            addressBooksCollection.put(name, new AddressBook());
            System.out.println("A new address book with name "+name+" added!\n");
        }
        else {
            System.out.println("An address book with this name already exists\n");
        }
    }
    public AddressBook getAddressBook(String name){
        return addressBooksCollection.get(name);
    }

    public void printAddressBooks(){
        for (String name : addressBooksCollection.keySet()){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to address book program\n");
        Scanner scanner = new Scanner(System.in);

        AddressBookSystem addressBookSystem = new AddressBookSystem();

        System.out.println("Enter the name for a new address book to be added to the system");
        String address_book_name1 = scanner.nextLine();
        addressBookSystem.addAddressBook(address_book_name1);
        System.out.println("Address Book `"+ address_book_name1+"` added to the system\n");

        System.out.println("Adding contacts:-");
        AddressBook currBook = addressBookSystem.getAddressBook(address_book_name1);

        //adding contacts
        Contacts contact1 = new Contacts();
        contact1.getDetails();
        currBook.addContact(contact1);

        Contacts contact2 = new Contacts();
        contact2.getDetails();
        currBook.addContact(contact2);

        //editing contact
        currBook.editContact("jane", "doe");

        //deleting contact from address book
        currBook.deleteContact("jane", "doe");


        System.out.println("The Address books in the system are");
        addressBookSystem.printAddressBooks();


    }
}