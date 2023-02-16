import java.io.*;
import java.util.Scanner;

public class ATMChecking extends ATMData {
	private int money;

	public ATMChecking(String accountNumber, String password, int money) {
		super(accountNumber, password);
		this.money = money;
	}

	public boolean checkBookBank() throws IOException {
		Scanner scan = new Scanner(new FileReader("ATMBookBank.txt"));
		boolean check = false;
		while (scan.hasNext()) {
			String id = scan.next();
			String pass = scan.next();
			int balance = scan.nextInt();
			if (id == getID() && pass == getPass() && balance >= money) {
				check = true;
				break;
			}
		}
		scan.close();
		return check;

	}

	public void show() throws IOException {
		if (checkBookBank() == true) {
			Scanner scan = new Scanner(new FileReader("ATMBookBank.txt"));
			boolean check = false;
			int balance = 0;
			while (scan.hasNext()) {
				String id = scan.next();
				String pass = scan.next();
				balance = scan.nextInt();
				if (id == getID() && pass == getPass() && balance >= money) {
					check = true;
					break;
				}
			}
			System.out.println("You drawing for " + money + ", get");
			int withdraw = money;
			int thousand = money / 1000;
			System.out.println("\t1000 = " + thousand);
			money %= 1000;
			int fivehundred = money / 500;
			System.out.println("\t 500 = " + fivehundred);
			money %= 500;
			int hundred = money / 100;
			System.out.println("\t 100 = " + hundred);
			System.out.println("Your balance is "+(balance-withdraw)+" Baht.");
			scan.close();
		}
	}

}
