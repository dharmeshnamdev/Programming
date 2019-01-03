package dp.singleton.pattern;

public class SingleTonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateUtil ds = DateUtil.getInstance();
		DateUtil ds1;
		
		System.out.println(ds.hashCode());
		try {
			ds1= (DateUtil) ds.clone();
			System.out.println(""+ds1.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
