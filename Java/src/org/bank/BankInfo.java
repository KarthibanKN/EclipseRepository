package org.bank;

public class BankInfo extends AxisBank {
	private void saving() {
		System.out.println("1.Savings Account");
	}
	private void fixed() {
		System.out.println("2.Fixed Account");
	}
	public static void main(String[] args) {
		BankInfo b=new BankInfo();
		b.deposit();
		b.saving();
		b.fixed();
	}
}
