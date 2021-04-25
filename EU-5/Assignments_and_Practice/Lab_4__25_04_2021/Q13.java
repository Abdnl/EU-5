package Lab_4__25_04_2021;

public class Q13 {

	public static void main(String[] args) {

		String str = "JavaScript";
		System.out.println(getMsg(str));
	}

	private static String getMsg(String x) {
		String msg = "Input value must be ";
		msg = msg.concat("smaller than x");
		msg.replace("X", x);
		String rest = " and larger than 0";
		msg.concat(rest);
		return msg;
	}
}
