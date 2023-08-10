package entities;

public abstract class Building {
    protected double width;
    protected double height;
    protected double length;

    public Building(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public abstract  double calculateSurfaceArea();
    public abstract  double calculatevolume();

}
