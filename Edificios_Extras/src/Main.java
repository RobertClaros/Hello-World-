import entities.Building;
import entities.OfficeBuilding;
import entities.SportsBuilding;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Building> buildings = new ArrayList<>();

        buildings.add(new SportsBuilding(50, 20, 30, "Monumental Stadium", "Outdoor"));
        buildings.add(new SportsBuilding(40, 30, 25, "Bombonera Stadium", "Outdoor"));
        buildings.add(new OfficeBuilding(30, 15, 20, 10, 5, 5));
        buildings.add(new OfficeBuilding(25, 10, 18, 8, 6, 8));

        for (Building building : buildings) {
            System.out.println("Surface Area: " + building.calculateSurfaceArea());
            System.out.println("Volume: " + building.calculatevolume());
            if (building instanceof SportsBuilding) {
                SportsBuilding sportsbuilding = (SportsBuilding) building;
                System.out.println("Complex name: "+ sportsbuilding.getName() );
                System.out.println("Facility Type: " +sportsbuilding.getFacilityType());

                sportsbuilding.provideServices();
            } else if (building instanceof OfficeBuilding) {
                OfficeBuilding officeBuilding = (OfficeBuilding) building;
                officeBuilding.calculatePersons();
                officeBuilding.provideServices();
            }
            System.out.println("----------------------");
        }
    }
}
