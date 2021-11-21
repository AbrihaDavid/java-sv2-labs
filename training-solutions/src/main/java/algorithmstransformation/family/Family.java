package algorithmstransformation.family;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<FamilyMember> familyMemberList = new ArrayList<>();

    public Family(List<FamilyMember> familyMemberList) {
        this.familyMemberList = familyMemberList;
    }

    public List<FamilyMember> getFamilyMemberList() {
        return familyMemberList;
    }

    public void addFamilyMember (FamilyMember familyMember){
        familyMemberList.add(familyMember);
    }

    public List<Integer> getAgesOfFamilyMembersWithNameGiven (String name){

        List<Integer> familyMemberAgeListWithName = new ArrayList<>();
        for (FamilyMember familyMember: familyMemberList){
            if (familyMember.getName().contains(name)){
                familyMemberAgeListWithName.add(familyMember.getAge());
            }
        }
        return familyMemberAgeListWithName;
    }
}
