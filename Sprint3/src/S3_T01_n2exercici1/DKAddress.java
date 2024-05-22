package S3_T01_n2exercici1;

public class DKAddress extends CountryAddress implements Address {

    private final String PHONEPREFIX = "(+45)";

    public DKAddress(String name, String street, String streetNumber, String floorNumber, String doorNumber, String postCode, String cityTown, String county, String country, String phoneNumber) {
        super(name, street, streetNumber, floorNumber, doorNumber, postCode, cityTown, county, country, phoneNumber);
    }


    @Override
    public String toString() {
        return ("------------------------------------------------------------------------------------\n" +
                "DK Address\n" +
                "------------------------------------------------------------------------------------\n" +
                "Name        |    " + super.getName() + "\n" +
                "Address     |    " + super.getStreet() + " " + super.getStreetNumber() + " " + super.getFloorNumber() + " " + super.getDoorNumber() + "\n" +
                "            |    " + super.getPostCode() + " " + super.getCityTown() + super.getCounty() + " DK\n" +
                "Telephone   |    " + this.PHONEPREFIX + " " + super.getPhoneNumber() + "\n" +
        "------------------------------------------------------------------------------------\n");
    }

}
