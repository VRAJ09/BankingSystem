
public class BankingSystem {
	
	public static int accountNum;
	public static double amount;
	
	public double deposit(double depositAmount) {
		if(depositAmount >= 0) {
			amount += depositAmount;
		}else{
			System.out.println("Error: Please enter an appropriate value.");
		}
		return amount;
	}

}
