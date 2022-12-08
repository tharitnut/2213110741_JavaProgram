import java.util.*;

public class Lab504 {
	static String fullname;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space.\n:");
		fullname = scan.nextLine();
		int space = fullname.indexOf(' ');
		String firstname = fullname.substring(0,space);
		
		System.out.println(abbreviatName(fullname.toUpperCase())+firstname);

	}
	
	public static String abbreviatName(String fullname) {
		String firstLetter = "";
		for(int i = 0;i<fullname.length();i++) {
			if(fullname.charAt(i)==' ') {
				firstLetter = firstLetter+fullname.charAt(i+1)+".";
			}
		}
		return firstLetter;
		
	}

}
