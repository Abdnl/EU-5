package Lab_4__25_04_2021;

public class Q14 {

	public static void main(String[] args) {
		
		int x1 = getload();
        int d = getload(x1, "Cybertek");
        
        System.out.println(x1);
        System.out.println(d);
        
        System.out.println(x1 + d);
    }

    public static int getload() {
        return 3;
    }

    public static int getload(int x1, String x2) {
        return x1 + x2.length() - 2;
    }

    public static int getload(String str) {
        return 4;
    }
}
