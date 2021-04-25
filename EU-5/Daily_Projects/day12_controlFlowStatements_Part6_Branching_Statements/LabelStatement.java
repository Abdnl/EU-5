package day12_controlFlowStatements_Part6_Branching_Statements;

public class LabelStatement {

	public static void main(String[] args) {

		int i = 0;
		outer: do { //
			i = 8;
			while (true) { // inner loop:
				System.out.println(i--);
				if (i == 4) {
					break outer; // outer loop
				}
			}
		} while (true);

	}

}
