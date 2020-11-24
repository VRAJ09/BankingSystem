import java.util.Scanner;

public class BankingSystemTester {

	public static void main(String[] args) {
		BankingSystem bank = new BankingSystem();
		Scanner in = new Scanner(System.in);
		System.out.println("What is the amount you would like to deposit?");
		double dA = in.nextDouble();
		System.out.print("Account Balance: $" + bank.deposit(dA));
	}

}
