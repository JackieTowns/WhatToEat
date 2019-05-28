package dinnerplans;

import java.util.Scanner;

public class ourdinnerplans {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String eventType;
		int partySize;
		String result;
		
		String mealType = null;
		String prepareType = null;

		System.out.println("Please pick your event type : ");
		eventType = scanner.nextLine();
		
		System.out.println("Please pick your party size : ");
		partySize = scanner.nextInt();

		if (eventType.equals("casual")) {
			mealType = ("sandwiches");
		}

		else if (eventType.equals("semi-formal")) {
			mealType = ("fried chicken");
		}

		else if (eventType.equals("formal")) {
			mealType = ("chicken parmesan");
		}

		else {
			System.out.println("Please choose an event type again.... ");

		}

		if (partySize == 1) {
			prepareType = ("in the microwave");
		}

		else if ((partySize >= 2) && (partySize <= 12)) {
			prepareType = ("in your kitchen");
		}

		else if (partySize >= 13) {
			prepareType = ("by a caterer");
		}

		else {
			System.out.println("Please choose a party size again.... ");
		}

		
		result = ("Since you're hosting a " + eventType + " event for " + partySize + " participants, you should serve "
				+ mealType + " prepared " + prepareType);


		System.out.println(result);

		scanner.close();

	}
}

