package S3_T01_n2exercici1;

public class DKAddress implements Address {

    private String name;
    private String street;
    private String streetNumber;
    private String floorNumber;
    private String doorNumber;
    private String postCode;
    private String cityTown;
    private String county;
    private final String COUNTRY = "DANMARK";
    private final String PHONEPREFIX = "(+45)";
    private String phoneNumber;

    public DKAddress(String name, String street, String streetNumber, String floorNumber, String doorNumber, String postCode, String cityTown, String county, String phoneNumber) {
        this.name = name;
        this.street = street;
        this.streetNumber = streetNumber;
        this.floorNumber = floorNumber;
        this.doorNumber = doorNumber;
        this.postCode = postCode;
        this.cityTown = cityTown;
        this.county = county;
        this.phoneNumber = phoneNumber;
    }


    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------\n" +
                "DK Address\n" +
                "------------------------------------------------------------------------------------\n" +
                "Name        |    " + this.name + "\n" +
                "Address     |    " + this.street + " " + this.streetNumber + " " + this.floorNumber + " " + this.doorNumber + "\n" +
                "            |    " + this.postCode + " " + this.cityTown + "\n" +
                "Telephone   |    " + this.PHONEPREFIX + " " + this.phoneNumber + "\n" +
        "------------------------------------------------------------------------------------\n";
    }

}
