package collectionscomp;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Building implements Comparable<Building> {

    private String address;
    private double area;
    private int floor;

    public Building(String address, double area, int floor) {
        this.address = address;
        this.area = area;
        this.floor = floor;
    }

    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public int getFloor() {
        return floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return floor == building.floor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor);
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", floor=" + floor +
                '}';
    }

    @Override
    public int compareTo(Building o) {
        return this.getFloor() - o.getFloor();
    }

    public static void main(String[] args) {

        Set<Building> buildings = new TreeSet<>();
        buildings.add(new Building("Egyetem tér 1",500.5,4));
        buildings.add(new Building("Fő út 4",120,2));
        buildings.add(new Building("Béla király út 17",50,1));
        buildings.add(new Building("Kossuth utca 57",160,3));

        System.out.println(buildings);
    }
}
