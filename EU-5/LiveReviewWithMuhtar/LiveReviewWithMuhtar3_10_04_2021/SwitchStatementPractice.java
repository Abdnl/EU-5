package LiveReviewWithMuhtar3_10_04_2021;

public class SwitchStatementPractice {

	public static void main(String[] args) {

		// switch statement does not accept; boolean,float,double,long
		// switch statement accepts int,short,char
		// data type of the switch expression and case value must be same.
		// case values must be unique, can not be same.
		// after break; it exits to the switch
		// if there is no matching values we have to create default:
		// It's better to put default: at the end
		// default: we can place anywhere,but if we do not put break;
		// then it will print next statements until the next break;
		// Can put only 1 default: in a switch

		int number = 10;
		switch (number) {

		case 10:
			System.out.println("A");
			break;// if there is no break then it will print the rest//Now exits the switch
		case 11:
			System.out.println("B");
			break;
		case 12:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;

		}

	}

}
