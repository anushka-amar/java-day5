package addressbook;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddressBook {
    private ArrayList<Contacts> contactList;
    private Set<String> uniqueNames;

    /* Instantiating a new address book
    that contains an array of contacts*/
    public AddressBook(){
        this.contactList = new ArrayList<>();
        this.uniqueNames = new HashSet<>();
    }

    /* method to add contact to the address book
    if contact not present
     */
    public void addContact(Contacts contact){
        if(!isDuplicate(contact)){
            contactList.add(contact);
            uniqueNames.add(contact.getFirstName()+" "+contact.getLastName());
            System.out.println("Contact added successfully!\n");
            return;
        }
        System.out.println("A contact with name "+contact.getFirstName()+" "+contact.getLastName()+" already exists");
    }

    public boolean isDuplicate(Contacts contact){
        return uniqueNames.contains(contact.getFirstName()+ " "+contact.getLastName());
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
        System.out.println("No such contact there to be edited\n\n");
    }

    public void deleteContact(String firstName, String lastName){
        for(Contacts contact : contactList){
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)){
                System.out.println("Deleting "+firstName+"'s contact info ");
                contactList.remove(contact);
                System.out.println("Contact deleted sucessfully!\n\n");
                return;
            }
        }
        System.out.println("Contact not found");
    }

    /* method that iterates through all the contacts in the
       add book and returns contacts matching the city */
    public List<Contacts> searchByCity(String city){
        List<Contacts> result = new ArrayList<>(); //new array list to store contacts with specified city
        for(Contacts contact : contactList){
            if(contact.getCity().equals(city)){
                result.add(contact);
            }
        }
        return result;
    }

    /* method that iterates through all the contacts in the
       add book and returns contacts matching the state */
    public List<Contacts> searchByState(String state){
        List<Contacts> result = new ArrayList<>(); //new array list to store contacts with specified city
        for(Contacts contact : contactList){
            if(contact.getState().equals(state)){
                result.add(contact);
            }
        }
        return result;
    }

    /* returns size of the result list
       that matches the city name */
    public long getContactCountByCity(String city) {
        return searchByCity(city).size();
    }

    /* returns size of the result list
       that matches the state name */
    public long getContactCountByState(String state) {
        return searchByState(state).size();
    }

    public void printContacts(){
        for (Contacts contact : contactList){
            contact.printDetails();
            System.out.println("------------------------");
        }
    }

}
