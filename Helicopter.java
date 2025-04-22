public class Helicopter extends AerialVehicle{
    private int rotorCount;
    private int maxAltitude;


    public Helicopter(int registrationNumber, String color, String model, int yearOfProduction, int rotorCount, int maxAltitude) {
        super(registrationNumber, color, model, yearOfProduction);
        this.rotorCount = rotorCount;
        this.maxAltitude = maxAltitude;
    }

    public int getRotorCount() {
        return rotorCount;
    }

    public void setRotorCount(int rotorCount) {
        this.rotorCount = rotorCount;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Rotor Count: " + rotorCount);
        System.out.println("Max Altitude: " + maxAltitude);
    }
}
