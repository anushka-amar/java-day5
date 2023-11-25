package addressbook;


import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to address book program");
        Contacts person1 = new Contacts("Jane", "doe", "Suite 911 44954 Flat Port", "Galen", "ND", "7245", "77383278", "janedoe@gmail.com");
        person1.printDetails();

        Contacts person2 = new Contacts();
        person2.getDetails();
        person2.printDetails();
    }
}
