
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3a. Item price
		double itemPrice1 = 32.50;
		double itemPrice2 = 25.75;
		System.out.println(itemPrice1);	
		System.out.println(itemPrice2);
		
		// b. Amount of money in wallet
		double amountOfMoneyInBobsWallet = 50.00;
		double amountOfMoneyInTomsWallet = 35.00;
		System.out.println(amountOfMoneyInBobsWallet);
		System.out.println(amountOfMoneyInTomsWallet);
		
		// c. Number of Friends
		int numberOfFriends1 = 36;
		int numberOfFriends2 = 15;
		System.out.println(numberOfFriends1);
		System.out.println(numberOfFriends2);
		
		// d. Age in years
		int ageInYears1 = 40;
		int ageInYears2 =45;		
		System.out.println(ageInYears1);
		System.out.println(ageInYears2);
		
		// e. First Name
		String firstName1 = "Bill";
		String firstName2 = "Fred";
		System.out.println(firstName1);
		System.out.println(firstName2);
		
		// f. Last Name
		String lastName1 = "Smith";
		String lastName2 = "Jones";
		System.out.println(lastName1);
		System.out.println(lastName2);
		
		// g. Middle Initial
		char middleInitial1 = 'D';
		char middleInitial2 = 'S';
		System.out.println(middleInitial1);
		System.out.println(middleInitial2);
		
		// 4a. New amount of money in wallet after buying item
		System.out.println(amountOfMoneyInBobsWallet - itemPrice1);
		System.out.println(amountOfMoneyInTomsWallet - itemPrice2);
		
		// b. Friends made in a year
		System.out.println("My Age" + " " + ageInYears1);
		System.out.println("Number of Friends" + " " + numberOfFriends1);
		System.out.println("Friends made each year" + " " + ageInYears1 / numberOfFriends1);
		System.out.println("My Age" + " " +  ageInYears2);
		System.out.println("Number of Friends" + " " + numberOfFriends2);
		System.out.println("Friends made each year" + " " + ageInYears2 / numberOfFriends2);
		
		// c. Full Name
		System.out.println(firstName1 + " " + middleInitial1 + " " + lastName1);
		System.out.println(firstName2 + " " + middleInitial2 + " " + lastName2);
	}

}
