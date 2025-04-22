import java.lang.reflect.Array;
import java.util.ArrayList;

public class Airfield extends AerialVehicle{
    private String name;
    private int capacity;
    private String address;
    ArrayList<AerialVehicle> aerialVehicles = new ArrayList<>(30);


    public Airfield(int registrationNumber, String color, String model, int yearOfProduction, String name, int capacity, String address) {
        super(registrationNumber, color, model, yearOfProduction);
        this.name = name;
        this.capacity = capacity;
        this.address = address;
    }
    public void addAerialVehicle(AerialVehicle vehicle){
        if(aerialVehicles.size()<30){
            aerialVehicles.add(vehicle);
            System.out.println("AerialVehicle added");
        }else{
            System.out.println("No enough space");
        }
    }
}
