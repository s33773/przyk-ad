public class Glider extends AerialVehicle{
    private int wingLength;

    public Glider(int registrationNumber, String color, String model, int yearOfProduction, int wingLength) {
        super(registrationNumber, color, model, yearOfProduction);
        this.wingLength = wingLength;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wing length: " + wingLength);
    }
}
