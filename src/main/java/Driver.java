import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment(10);
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement(12);
		
		System.out.println("Current count:" + counter.getCount());

		counter.multiplyId(12);
		
		System.out.println("Current count:" + counter.getCount());
		System.out.println("Current count:" + counter.getCount());

		
	}

}
