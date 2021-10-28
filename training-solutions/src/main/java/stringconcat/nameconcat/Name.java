package stringconcat.nameconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle(){
        String name = "";
        if (title != null){
            name += title.getTitle();
            name += familyName;
            return name;
         } else if (middleName != null) {
            name += givenName;
            name += " ";
            name += middleName;
            name += " ";
            name += familyName;
            return name;
         } else {
            name += givenName;
            name += " ";
            name += familyName;
            return name;
         }
    }

    public String concatNameHungarianStyle(){
        if (title != null && middleName != null) {
            return title.getTitle().concat(familyName).concat(" ").concat(middleName).concat(" ").concat(givenName);
        }
        if (middleName != null) {
            return familyName.concat(" ").concat(givenName).concat(" ").concat(middleName);
        } else if (title != null) {
            return title.getTitle().concat(familyName).concat(" ").concat(givenName);
        } else {
            return familyName.concat(" ").concat(givenName);
        }
}

}
