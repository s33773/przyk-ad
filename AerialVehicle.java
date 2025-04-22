public class AerialVehicle {
    protected int registrationNumber;
    protected String color;
    protected String model;
    protected int yearOfProduction;

    public AerialVehicle(int registrationNumber, String color, String model, int yearOfProduction) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public void displayInfo(){
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year of Production: " + yearOfProduction);
    }
}
