package dp.singleton.pattern;

import java.io.Serializable;

public class Product implements Serializable,Cloneable{
	private static volatile Product instance;
	private Product() {}
	public static Product getInstance() {
		if(instance==null) {
			synchronized(Product.class) {
				if (instance==null) {
					instance = new Product();
				}
		}
		}
		return instance;
	}
	protected Object readResolve(){
		return instance;
	}
	protected Object clone()throws CloneNotSupportedException {
	 throw new CloneNotSupportedException(
			 );	
	}

}
