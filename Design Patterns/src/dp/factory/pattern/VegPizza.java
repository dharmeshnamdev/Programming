package dp.factory.pattern;

public class VegPizza implements IPizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Prepare veg Pizza");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println("bake veg Pizza");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cutting veg Pizza");
	}

}
