package addressbook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        Contacts contact1 = new Contacts("Jane", "doe", "Apt. 938 9147 Doug Crescent", 678975890, "janedoe@gmail.com");
        contact1.printDetails(contact1);
    }
}
