package ocp;

public class Car extends Vehicle implements IVehicleCar {
	
	public Car(String color, String year, double engine) {
		super(color, year, engine);
		// TODO Auto-generated constructor stub
	}

	private int seat;

	@Override
	public void configureVehicle(String color, String year, double engine, int seats) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startVehicle() {
		// TODO Auto-generated method stub
		
	}

}
