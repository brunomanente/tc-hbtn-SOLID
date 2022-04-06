package ocp;

public class Vehicle implements IVehicleMotorcycle {
    private String color;
    private String year;
    private double engine;
    

    public Vehicle(String color, String year, double engine){
        this.color  = color;
        this.year = year;
        this.engine = engine;
       
    }

    void car(){
        System.out.println("Criando um carro: "+ color + " ano: " + year+ " motor: "+ engine );
        startVehicle();
    }

    void motorcycle(){
        System.out.println("Criando uma moto: "+ year + " com " + engine + " cilindradas");
        startVehicle();
    }

    public void startVehicle(){
        System.out.println("Ligando os motores");
    }

	@Override
	public void configureVehicle(String color, String year, double engine) {
		// TODO Auto-generated method stub
		
	}
}
