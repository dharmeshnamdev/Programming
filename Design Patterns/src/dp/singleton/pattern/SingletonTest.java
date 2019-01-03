package dp.singleton.pattern;

public class SingletonTest {
	private volatile static SingletonTest s;
	private SingletonTest() {}
	public static SingletonTest getSingleton() {
		if(s==null) {
			synchronized (SingletonTest.class) {
				if(s==null) {
				s = new SingletonTest();
			
				}
			}
		}
		return s;
	}
	 

}
