package addressbook;

import java.util.*;

public class AddressBookSystem {
    private Map<String, AddressBook> addressBooksCollection;

    /*Instantiating a system to store a collection of address books*/
    public AddressBookSystem() {

        this.addressBooksCollection = new HashMap<>();
    }

    /* method to add address book to a system */
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

    /* method that iterates through each add book
     and get the contacts matching the city*/
    public List<Contacts> searchPersonByCity(String city){
        List<Contacts> result = new ArrayList<>();
        for (AddressBook addressBook : addressBooksCollection.values()){
            result.addAll(addressBook.searchByCity(city)); //adds all the elements of the result of search by city in a single add book
        }
        return result;
    }

    /* method that iterates through each add book
     and get the contacts matching the state*/
    public List<Contacts> searchPersonByState(String state){
        List<Contacts> result = new ArrayList<>();
        for (AddressBook addressBook : addressBooksCollection.values()){
            result.addAll(addressBook.searchByCity(state)); //adds all the elements of the result of search by city in a single add book
        }
        return result;
    }

    /* method that iterates through all the add books
       and increments the count if any contact matches the
       city name in the add book */
    public long getContactCountByCity(String city) {
        long count = 0;
        for (AddressBook addressBook : addressBooksCollection.values()) {
            count += addressBook.getContactCountByCity(city);
        }
        return count;
    }

    /* method that iterates through all the add books
       and increments the count if any contact matches the
       state name in the add book */
    public long getContactCountByState(String state) {
        long count = 0;
        for (AddressBook addressBook : addressBooksCollection.values()) {
            count += addressBook.getContactCountByState(state);
        }
        return count;
    }

    public void printAddressBooks(){
        System.out.println("Address Books: ");
        for (String name : addressBooksCollection.keySet()){
            System.out.println(name);
        }
    }

}
