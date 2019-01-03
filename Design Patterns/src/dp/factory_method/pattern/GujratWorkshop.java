package dp.factory_method.pattern;

public class GujratWorkshop {
public AbsCar creatCar(String type) {
	AbsCar car = null;
	if(type.equals("WagonR")) {
		car = new AltoCar();
	}
	System.out.println("Assemble WagonR Engine");
	return car;
}
}
