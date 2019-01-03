package dp.factory.pattern;

public class CheesePizza implements IPizza
{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Prepare Chees Pizza");
	}

	@Override
	public void back() {
		// TODO Auto-generated method stub
		System.out.println("bake Chees Pizza");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cutting Chees Pizza");
	}
	
}
