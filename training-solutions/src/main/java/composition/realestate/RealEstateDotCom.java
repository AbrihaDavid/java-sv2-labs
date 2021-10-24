package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {

        RealEstate realEstate = new RealEstate("Awesome house",450000,new Details("very awesome house",new Address("Debrecen","4032","Egyetem tér",1),50000,10000000));

        System.out.println(realEstate.toString());

        realEstate.getDetails().getAddress().setCity("Budapest");
        realEstate.getDetails().setDescription("A truly awesome house");

        System.out.println(realEstate.toString());
    }
}
