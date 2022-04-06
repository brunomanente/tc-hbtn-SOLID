package ocp;

public class Main {
    private static TypeVehicle typeVehicle;
    public static void main(String[] args){
        typeVehicle = TypeVehicle.CAR;

        if (typeVehicle == TypeVehicle.CAR){
            Vehicle vehicle = new Vehicle("white", "2022", 2.0);
            vehicle.car();
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE){
            Vehicle vehicle = new Vehicle("white", "2010", 250);
            vehicle.motorcycle();
        }
    }
}