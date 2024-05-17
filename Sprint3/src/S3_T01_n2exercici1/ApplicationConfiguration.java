package S3_T01_n2exercici1;

import java.io.FileInputStream;
import java.util.Properties;

import static S3_T01_n2exercici1.AppTools.displayMenu;

public class ApplicationConfiguration {

    public static void main(String args[]) throws Exception {

        int random = (int)(Math.random() * 3) + 1;

        String configFilePath = System.getProperty("user.dir") + "/Sprint3/src/S3_T01_n2exercici1/config.properties";
        FileInputStream propsInput = new FileInputStream(configFilePath);

        Properties prop = new Properties();
        prop.load(propsInput);


        String country = "";

        switch(random) {
            case 1:
                country = prop.getProperty("country1");
                System.out.println("country1" + country);
                break;
            case 2:
                country = prop.getProperty("country2");
                System.out.println("country2" +  country);
                break;
            case 3:
                country = prop.getProperty("country3");
                System.out.println("country2" + country);
                break;
        }

        AddressBookFactory addressBookFactory;

        if (country.equalsIgnoreCase("UK")) {
            addressBookFactory = new UKAddressBook();
        } else if (country.equalsIgnoreCase("DK")) {
            addressBookFactory = new DKAddressBook();
        } else if (country.equalsIgnoreCase("Spain")) {
            addressBookFactory = new ESAddressBook();
        } else {
            throw new Exception("Error! This country AddressBook has not been created.");
        }

        Application app = new Application(addressBookFactory);

        displayMenu(app);

    }
}
