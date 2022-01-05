package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {

    private List<String> addressList = new ArrayList<>();

    public List<String> getAddressList() {
        return addressList;
    }

    public void addAddress(String address){
        addressList.add(address);
    }

    public void removeAddress(String address){
        addressList.remove(address);
    }
}
