package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {

        Tea tea = new Tea("Earl Grey",2000);
        HerbalTea herbalTea = new HerbalTea("Herbal",1000);

        System.out.println(tea.getName());
        System.out.println(tea.getPrice());
        System.out.println(herbalTea.getName());
        System.out.println(herbalTea.getPrice());
    }
}
