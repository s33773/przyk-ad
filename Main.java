public class Main {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter(1, "x", "x", 1, 1, 1);
        helicopter.displayInfo();
        Drone drone = new Drone(1,"x","x",1,1,"Yes");
        drone.displayInfo();
        Glider glider = new Glider(1,"x","x",1,1);
        glider.displayInfo();
        Airfield airfield = new Airfield(1,"x","x",1,"x",1,"x");
        airfield.addAerialVehicle(helicopter);
    }



}
