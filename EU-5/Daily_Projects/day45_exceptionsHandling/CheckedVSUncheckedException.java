package day45_exceptionsHandling;

public class CheckedVSUncheckedException {

	public static void main(String[] args) {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
