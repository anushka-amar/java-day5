package addressbook;

public class Contacts {
    private String firstName,lastName;
    private String address;
    private long phone_number;
    private String email;

    public Contacts(String firstName, String lastName, String address, long phone_number, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void printDetails(Contacts contact){
        System.out.println(contact.getFirstName());
        System.out.println(contact.getPhone_number());

    }
}
