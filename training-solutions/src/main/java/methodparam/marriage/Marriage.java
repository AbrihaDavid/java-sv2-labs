package methodparam.marriage;

import java.time.LocalDate;

public class Marriage {

    public void getMarried(Woman woman, Man man){
        setMarriageDate(woman,man);
        setWomanMarriedName(woman,man);
    }

    private void setMarriageDate(Woman woman, Man man){
        woman.addRegisterInfo(new RegisterDate("házasságkötés ideje", LocalDate.now()));
        man.addRegisterInfo(new RegisterDate("házasságkötés ideje", LocalDate.now()));
    }

    private String getFamilyNameOfMan(Man man){
        return man.getName().substring(man.getName().indexOf(" ") + 1);
    }

    private String getFirstNameOfWoman(Woman woman){
        return woman.getName().substring(0,woman.getName().indexOf(" ") + 1);
    }

    private void setWomanMarriedName(Woman woman, Man man){
        woman.setName(getFirstNameOfWoman(woman).concat(getFamilyNameOfMan(man)));
    }
}
