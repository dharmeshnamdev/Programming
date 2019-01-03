package dp.factory.pattern;

class PizzaFacory {
	public static IPizza p;
	public static IPizza createPizza(String Type) {
		if(Type == null) {
			return null;
		}
		else if(Type.equalsIgnoreCase("CheesePizza")){
			p = new CheesePizza();
			return p;
		}
		else if(Type.equalsIgnoreCase("VegPizza")){
			p =  new VegPizza();
			return p;
		}
		
		return p;
		/*IPizza p = null;
		
		
		 if(Type.equals("cheese")) {
			return new CheesePizza();
		}
		else if (Type.equals("VegPizza")) {
			p = new VegPizza();
		} 
		return p;
	*/
		
	}
	
	
}
