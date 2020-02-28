package slide4.Lambda;

public interface Test {
	public void setup();

	public default void run() {
		System.out.println("Hello Tester");
	}

	public static void main(String[] args) {
		Test test = () -> {
			System.out.println("Setup environment in here");
		};

		test.run();
		
		test.setup();
	}
}
