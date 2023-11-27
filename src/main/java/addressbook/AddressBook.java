package addressbook;


import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contacts> contactList;

    public AddressBook(){

        this.contactList = new ArrayList<>();
    }
    public void addContact(Contacts contact){
        contactList.add(contact);
        System.out.println("Contact added successfully!\n");
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

}
