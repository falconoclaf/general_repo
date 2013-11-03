

public class HwSpeed {

	public static void main(String[] args) {

	}

	public static String getHelloWorld() {
		return "Hello World!";
	}

	public static int getLoopCount() {
		long nanoStartTime = System.nanoTime();
		int counter = 0;
		while (nanoStartTime + 1000*1000*1000 > System.nanoTime()) {
			counter++;
		}
		return counter;
	}

}
