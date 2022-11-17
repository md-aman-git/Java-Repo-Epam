
abstract class Bank {
	abstract int interestAmount(int amount, int rate);
}
class SBI extends Bank {
	int interestAmount(int amount, int rate) {
		return (amount * rate) / 100;
	}
}
class ICICI extends Bank {
	int interestAmount(int amount, int rate) {
		return (amount * rate) / 100;
	}
}
class HDFC extends Bank {
	int interestAmount(int amount, int rate) {
		return (amount * rate) / 100;
	}
}
public class BankRate {
	public static void main(String [] args) {
		//System.out.println("");
		SBI sbi = new SBI();
		int amount = 1000;
		System.out.println("For SBI : interest amount : " + 
				sbi.interestAmount(amount, 8));
		ICICI ic = new ICICI();
		System.out.println("For ICICI : interest amount : " + 
				ic.interestAmount(amount, 12));
		//System.out.println("");
		HDFC hd = new HDFC();
		System.out.println("For HDFC : interest amount : " + 
				hd.interestAmount(amount, 11));
	}
}
