package inheritanceattributes;

public class BuildingMain {

    public static void main(String[] args) {

        Building building = new Building("Building",500.52,2);
        System.out.println(building.name);
        System.out.println(building.area);
        System.out.println(building.getFloors());

        SchoolBuilding schoolBuilding = new SchoolBuilding(10);
        System.out.println(schoolBuilding.getNumberOfClassRooms());
    }
}
