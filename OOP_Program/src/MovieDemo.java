import java.util.*;

public class MovieDemo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Input moive id   : ");
		String mId = scan.nextLine();
		System.out.print("Input moive name : ");
		String mName = scan.nextLine();
		System.out.println();
		System.out.print("Input director name       : ");
		String dName = scan.nextLine();
		System.out.print("Input direcor email       : ");
		String dEmail = scan.nextLine();
		System.out.print("Input put director gender : ");
		char dGender = scan.next().charAt(0);
		while (!(dGender + "").equalsIgnoreCase("M") && (dGender + "").equalsIgnoreCase("M")) {
			System.out.print("Input put director gender, again : ");
			dGender = scan.next().charAt(0);
		}
		Movie mov = new Movie(mId, mName, new Director(dName, dEmail, dGender));
		System.out.println();
		System.out.print("Input movie theater no. : ");
		int tNo = scan.nextInt();
		while (!(tNo >= 1 && tNo <= 15)) {
			System.out.print("Please input 1 - 15 only : ");
			tNo = scan.nextInt();
		}
		Theater the = new Theater(mId, mName, new Director(dName, dEmail, dGender), tNo);
		System.out.println();

		System.out.println(the);

	}

}
