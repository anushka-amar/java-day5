package addressbook;

import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program\n");
        Scanner scanner = new Scanner(System.in);

        AddressBookSystem addressBookSystem = new AddressBookSystem();

        //creating a new address book
        System.out.println("Enter the name for a new address book to be added to the system");
        String address_book_name1 = scanner.nextLine();
        addressBookSystem.addAddressBook(address_book_name1);
        System.out.println("Address Book `"+ address_book_name1+"` added to the system\n");

        //Adding contacts to the address book
        System.out.println("Adding contacts:-");
        AddressBook currBook = addressBookSystem.getAddressBook(address_book_name1);

        //adding contact1
        Contacts contact1 = new Contacts();
        contact1.getDetails();
        currBook.addContact(contact1);

        //Trying to add a duplicate contact to the address book
        Contacts contact2 = new Contacts();
        contact2.getDetails();
        currBook.addContact(contact2);

        //editing a contact in the address book
        currBook.editContact("jane", "doe");

        //deleting contact from address book
        currBook.deleteContact("jane", "doe");

        //printing contacts in the current address book
        currBook.printContacts();

        addressBookSystem.printAddressBooks();

        //search person by city
        System.out.println("Enter city to search for: ");
        String city = scanner.nextLine();
        List<Contacts> citySearch = addressBookSystem.searchPersonByCity(city);
        if(citySearch.isEmpty()){
            System.out.println("No matching contacts found");
        }else {
            for(Contacts contact : citySearch){
                System.out.println(contact.getFirstName()+" "+contact.getLastName());
            }
        }

        //search person by state
        System.out.print("Enter the state to search for: ");
        String state = scanner.nextLine();
        List<Contacts> stateSearch = addressBookSystem.searchPersonByState(state);
        if(stateSearch.isEmpty()){
            System.out.println("No matching contacts found");
        }else {
            for (Contacts contact : stateSearch){
                System.out.println(contact.getFirstName()+" "+contact.getLastName());
            }
        }

        //getting count of contacts matching a city
        System.out.println("Enter the city name");
        String cityName = scanner.nextLine();
        long cityCount = addressBookSystem.getContactCountByCity(cityName);
        System.out.println("Number of contacts matching in "+cityName+" is "+cityCount);

        //getting count of contacts matching a state
        System.out.println("Enter the city state");
        String stateName = scanner.nextLine();
        long stateCount = addressBookSystem.getContactCountByState(stateName);
        System.out.println("Number of contacts matching in "+stateName+" is "+stateCount);

        //Write contacts to file
        addressBookSystem.getAddressBook(address_book_name1).writeToFile("temp.txt");

    }
}
