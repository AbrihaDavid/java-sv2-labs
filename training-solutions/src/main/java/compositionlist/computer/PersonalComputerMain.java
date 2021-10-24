package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {

        PersonalComputer pc = new PersonalComputer(new Cpu("Ryzen 9 5950x",4.9));
        pc.addHardware(new Hardware("GPU","RTX 3090"));
        pc.addSoftware(new Software("ArcGIS",10.8));
        System.out.println(pc.toString());

        System.out.println(pc.getCpu().getClockSignal());
        System.out.println(pc.getHardwares().get(0).getModel());
        pc.addSoftware(new Software("ENVI",5.6));
        pc.addSoftware(new Software("RStudio",2021.09));
        System.out.println(pc.getSoftwares().get(pc.getSoftwares().size()-1).getNumberOfVersion());
    }
}
