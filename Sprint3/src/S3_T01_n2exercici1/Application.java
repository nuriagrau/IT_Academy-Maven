package S3_T01_n2exercici1;

public class Application {
    private AddressBookFactory addressBookFactory;
    private Address address;
    public Application(AddressBookFactory addressBookFactory) {
        this.addressBookFactory= addressBookFactory;
    }
    public Address createAddress() {
        this.address = addressBookFactory.createAddress();
        return address;
    }

    public String toString() {
        return this.address.toString();
    }

}
