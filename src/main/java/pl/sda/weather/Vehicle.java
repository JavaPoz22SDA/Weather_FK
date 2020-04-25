package pl.sda.weather;

public class Vehicle {
    private int tires;
    private int numberCylinders;
    private String model;

    public Vehicle(int tires, int numberCylinders, String model) {
        this.tires = tires;
        this.numberCylinders = numberCylinders;
        this.model = model;
    }

    public int getTires() {
        return tires;
    }

    public void setTires(int tires) {
        this.tires = tires;
    }

    public int getNumberCylinders() {
        return numberCylinders;
    }

    public void setNumberCylinders(int numberCylinders) {
        this.numberCylinders = numberCylinders;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
