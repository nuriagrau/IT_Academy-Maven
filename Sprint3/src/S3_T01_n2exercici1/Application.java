package S3_T01_n2exercici1;

public class Application {
    private AddressBookFactory addressBookFactory;
    private Address address;
    public Application(AddressBookFactory addressBookFactory) {
        this.addressBookFactory= addressBookFactory;
    }
    public Address createAddress(String[] addressData) {
        this.address = addressBookFactory.createAddress(addressData);
        return address;
    }

    public String toString() {
        return this.address.toString();
    }

}
