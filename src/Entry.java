public class Entry {
    private String lastName;
    private String firstName;
    private String phoneNumber;


    public Entry (String lastName, String firstName, String phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
