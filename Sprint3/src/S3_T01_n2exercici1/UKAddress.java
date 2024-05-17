package S3_T01_n2exercici1;

public class UKAddress implements Address{

    private String name;
    private String street;
    private String streetNumber;
    private String floorNumber;
    private String doorNumber;
    private String postCode;
    private String cityTown;
    private String county;
    private final String COUNTRY = "UNITED KINGDOM";
    private final String PHONEPREFIX = "(+44)";
    private String phoneNumber;

    public UKAddress(String name, String street, String streetNumber, String floorNumber, String doorNumber, String postCode, String cityTown, String county, String phoneNumber) {
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
                "UK Address\n" +
                "------------------------------------------------------------------------------------\n" +
                "Name        |    " + this.name + "\n" +
                "Address     |    " + this.streetNumber + " " + this.street + " " + this.floorNumber + " " + this.doorNumber + "\n" +
                "            |    " + this.cityTown + "\n" +
                "            |    " + this.postCode + "\n" +
                "Telephone   |    " + this.PHONEPREFIX + " " + this.phoneNumber + "\n" +
        "------------------------------------------------------------------------------------\n";
    }
}
