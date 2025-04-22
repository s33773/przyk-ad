import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airfield extends AerialVehicle{
    private String name;
    private int capacity=30;
    private String address;
    ArrayList<AerialVehicle> aerialVehicles = new ArrayList<>(capacity);


    public Airfield(int registrationNumber, String color, String model, int yearOfProduction, String name, int capacity, String address) {
        super(registrationNumber, color, model, yearOfProduction);
        this.name = name;
        this.capacity = capacity;
        this.address = address;
    }
    public void addAerialVehicle(AerialVehicle vehicle){
        for (AerialVehicle v : aerialVehicles) {
            if (v.getRegistrationNumber() == vehicle.getRegistrationNumber()) {
                throw new IllegalArgumentException("Error: Vehicle already on the airfield");
            }
        }
        if(aerialVehicles.size()<capacity){
            aerialVehicles.add(vehicle);
            System.out.println("AerialVehicle added");
        }else{
            throw new IllegalArgumentException("No space");
        }
    }
    public void removeAerialVehicle(AerialVehicle vehicle) {
        for (AerialVehicle v : aerialVehicles) {
            if (v.getRegistrationNumber() == vehicle.getRegistrationNumber()) {
                aerialVehicles.remove(v);
                System.out.println("AerialVehicle removed");
                return;
            }
        }
        throw new IllegalArgumentException("Error: Vehicle not found on the airfield");
    }

}
