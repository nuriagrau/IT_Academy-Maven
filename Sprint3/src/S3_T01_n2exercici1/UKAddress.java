package S3_T01_n2exercici1;

public class UKAddress extends CountryAddress implements Address{

    private final String PHONEPREFIX = "(+44)";

    public UKAddress(String name, String street, String streetNumber, String floorNumber, String doorNumber, String postCode, String cityTown, String county, String country, String phoneNumber) {
        super(name, street, streetNumber, floorNumber, doorNumber, postCode, cityTown, county, country, phoneNumber);
    }

    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------\n" +
                "UK Address\n" +
                "------------------------------------------------------------------------------------\n" +
                "Name        |    " + super.getName() + "\n" +
                "Address     |    " + super.getStreetNumber() + " " + super.getStreet() + " " + super.getFloorNumber() + " " + super.getDoorNumber() + "\n" +
                "            |    " + super.getCityTown() + "\n" +
                "            |    " + super.getPostCode() + "\n" +
                "            |    " + super.getCounty() + " UK\n" +
                "Telephone   |    " + this.PHONEPREFIX + " " + super.getPhoneNumber()+ "\n" +
        "------------------------------------------------------------------------------------\n";
    }
}
