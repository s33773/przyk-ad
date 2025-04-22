public class Helicopter extends AerialVehicle{
    private int rotorCount;
    private int maxAltitude;


    public Helicopter(int registrationNumber, String color, String model, int yearOfProduction, int rotorCount, int maxAltitude) {
        super(registrationNumber, color, model, yearOfProduction);
        this.rotorCount = rotorCount;
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rotor Count: " + rotorCount);
        System.out.println("Max Altitude: " + maxAltitude);
    }
}
