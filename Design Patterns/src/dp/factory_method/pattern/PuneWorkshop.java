package dp.factory_method.pattern;

public class PuneWorkshop {
	public AbsCar createCar(String type) {
		AbsCar car = null;
		if(type.equals("Alto")) {
			car = new AltoCar();
		}
	System.out.println("Assemble Alto Car Engine");
		return car;
		
	}
}
