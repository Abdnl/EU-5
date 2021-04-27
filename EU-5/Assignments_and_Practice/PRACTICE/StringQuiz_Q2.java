package PRACTICE;

public class StringQuiz_Q2 {

	public static void main(String[] args) {
		
		String ta = "A ";
		ta = ta.concat("B ");  //ta= A B
		String tb = "C ";		//tb= C
		ta = ta + tb;			//ta= A B C
		ta.replace('C','D');	//ta= A B D
		ta = ta + tb;           //ta=ABDC ????????????????
		System.out.println(ta);

	}

}
