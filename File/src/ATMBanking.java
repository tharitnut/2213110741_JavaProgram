import java.util.*;

public class ATMBanking {
	static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter account number : ");
		String id = console.next();
		boolean checknum = false;
		boolean checkdash = false;
		boolean checklength = false;
		for (int i = 0; i < id.length(); i++) {
			if ((id.indexOf(i) >= '0' && id.indexOf(i) <= '9') || id.indexOf(i) == '-')
				checknum = true;
		}
		if (id.indexOf(1) == '-' && id.indexOf(5) == '-' && id.indexOf(9) == '-' && id.indexOf(12) == '-')
			checkdash = true;
		if (id.length() == 14)
			checklength = true;
		while (!checknum || !checkdash || checklength) {
			System.out.print("Input wrong type, Enter account number : ");
			id = console.next();
			checknum = false;
			checkdash = false;
			checklength = false;
			for (int i = 0; i < id.length(); i++) {
				if ((id.indexOf(i) >= '0' && id.indexOf(i) <= '9') || id.indexOf(i) == '-')
					checknum = true;
			}
			if (id.indexOf(1) == '-' && id.indexOf(5) == '-' && id.indexOf(9) == '-'&& id.indexOf(12) == '-')
				checkdash = true;
			if (id.length() == 14)
				checklength = true;

		}

	}

}
