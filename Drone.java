public class Drone extends AerialVehicle {
    private int batteryLife;
    private String cameraEquipped;

    public Drone(int registrationNumber, String color, String model, int yearOfProduction, int batteryLife, String cameraEquipped) {
        super(registrationNumber, color, model, yearOfProduction);
        this.batteryLife = batteryLife;
        this.cameraEquipped = cameraEquipped;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery life: " + batteryLife);
        System.out.println("Camera equipped: " + cameraEquipped);
    }
}
