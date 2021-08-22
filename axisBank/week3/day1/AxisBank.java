package axisBank.week3.day1;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println(" Overridden method deposit - deposit_account ");
	}

	public static void main(String[] args) {

		AxisBank bank = new AxisBank();
		bank.deposit();
		bank.fixed();
		bank.savings();
	}

}
