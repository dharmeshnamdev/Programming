package dp.factory.pattern;

public class PizzaStore {
	/*public IPizza orderPizza(String Type) {
		IPizza p=null;
		p=PizzaFacory.createPizza(Type);
		
		return p;
	}*/
	public static void main(String[] args) {
		PizzaFacory pf = new PizzaFacory();
		IPizza p1=pf.createPizza("VegPizza");
	}
}
