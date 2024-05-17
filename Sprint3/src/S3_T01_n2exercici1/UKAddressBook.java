package S3_T01_n2exercici1;

import static S3_T01_n2exercici1.AppTools.requestAddressData;

public class UKAddressBook implements AddressBookFactory{

    @Override
    public Address createAddress() {
        String[] addressData = requestAddressData();
        return new UKAddress(addressData[0], addressData[1],addressData[2], addressData[3], addressData[4], addressData[5], addressData[6], addressData[7], addressData[8]);
    }

}
