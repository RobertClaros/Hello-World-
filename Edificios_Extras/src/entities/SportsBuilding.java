package entities;

import org.w3c.dom.ls.LSOutput;
import service.BuildingServices;
import service.Service;

public class SportsBuilding extends Building implements BuildingServices {
    private String name;
    private String facilityType;


    public SportsBuilding(double width, double height, double length, String name, String facilityType) {
        super(width, height, length);
        this.name = name;
        this.facilityType = facilityType;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (width * length + width * height + length * height);
    }

    @Override
    public double calculatevolume() {
        return width * length * width;
    }

    public String getName() {
        return name;
    }

    public String getFacilityType() {
        return facilityType;
    }

    @Override
    public void provideServices() {
        Service maintenanceService = new Service(("Maintenance"));
        maintenanceService.performanceService();
    }


}
