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

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void displayInfo(){
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Year of Production: " + yearOfProduction);
    }
}
