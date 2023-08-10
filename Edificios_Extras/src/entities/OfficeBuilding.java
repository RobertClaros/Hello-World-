package entities;

import service.BuildingServices;
import service.Service;

public class OfficeBuilding extends Building implements BuildingServices {
    private int numOffices;
    private int personsPerOffice;
    private int numFloors;

    public OfficeBuilding(double width, double height, double length, int numOffices, int personsPerOffice, int numFloors) {
        super(width, height, length);
        this.numOffices = numOffices;
        this.personsPerOffice = personsPerOffice;
        this.numFloors = numFloors;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }

    @Override
    public double calculatevolume() {
        return width * height * length;
    }

    public void calculatePersons() {
        int total = numOffices * personsPerOffice*numFloors;
        System.out.println("Persons numbre on the floor: "+(numOffices*personsPerOffice));
        System.out.println("Total Persons in the entire building: "+total);
    }

    @Override
    public void provideServices() {
        Service cleaningService = new Service("Cleaning");
        cleaningService.performanceService();
    }
}
