package S3_T01_n2exercici1;

public class CountryAddress implements Comparable{
    private String name;
    private String street;
    private String streetNumber;
    private String floorNumber;
    private String doorNumber;
    private String postCode;
    private String cityTown;
    private String county;
    private String country;
    private String phoneNumber;

    public CountryAddress(String name, String street, String streetNumber, String floorNumber, String doorNumber, String postCode, String cityTown, String county, String country, String phoneNumber) {
        this.name = name;
        this.street = street;
        this.streetNumber = streetNumber;
        this.floorNumber = floorNumber;
        this.doorNumber = doorNumber;
        this.postCode = postCode;
        this.cityTown = cityTown;
        this.county = county;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getStreet() {
        return this.street;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public String getFloorNumber() {
        return this.floorNumber;
    }

    public String getDoorNumber() {
        return this.doorNumber;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getCityTown() {
        return this.cityTown;
    }

    public String getCounty() {
        return this.county;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------\n" +
                "Address\n" +
                "------------------------------------------------------------------------------------\n" +
                "Name        |    " + this.name + "\n" +
                "Address     |    " + this.street + " " + this.streetNumber + " " + this.floorNumber + " " + this.doorNumber + "\n" +
                "            |    " + this.postCode + " " + this.cityTown + "\n" +
                "            |    " + this.country +
                "Telephone   |    " + this.phoneNumber + "\n" +
                "------------------------------------------------------------------------------------\n";
    }

    @Override
    public int compareTo(Object o) {
        CountryAddress other = (CountryAddress) o;
        if (this.getCountry().equalsIgnoreCase(other.getCountry())) {
            return this.getName().compareTo(other.getName());
        } else{
            return this.getCountry().compareTo(other.getCountry());
        }
    }
}
