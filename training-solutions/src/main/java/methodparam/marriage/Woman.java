package methodparam.marriage;

import java.util.ArrayList;
import java.util.List;

public class Woman {

    private String name;
    private List<RegisterDate> registerDates = new ArrayList<>();

    public Woman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<RegisterDate> getRegisterDates() {
        return registerDates;
    }

    public void addRegisterInfo(RegisterDate registerDate){
        registerDates.add(registerDate);
    }

    public void setName(String name) {
        this.name = name;
    }
}
