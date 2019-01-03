package dp.factory_method.pattern;

public abstract class MaruthiSuzuki {
	public AbsCar assembly(String type) {
		AbsCar car = null;
		car = createCar(type);
		
		return car;
	}

	protected abstract AbsCar createCar(String type) ;
}
