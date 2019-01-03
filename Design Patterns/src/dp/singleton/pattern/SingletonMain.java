package dp.singleton.pattern;

public class SingletonMain {
	public static void main(String[] args) {
		System.out.println(SingletonTest.getSingleton().hashCode());
		System.out.println(SingletonTest.getSingleton().hashCode());
		System.out.println(SingletonTest.getSingleton().hashCode());
		System.out.println(SingletonTest.getSingleton().hashCode());
		System.out.println(SingletonTest.getSingleton().hashCode());
	}

}
