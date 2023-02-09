import java.util.*;

public class FictionDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter title : ");
		String title =scan.nextLine();
		System.out.print("Enter public year : ");
		int year = scan.nextInt();
		FictionBook book = new FictionBook(title,year);
		System.out.print("Enter author's name : ");
		String author = scan.next();
		scan.nextLine();
		System.out.print("Enter author's email : ");
		String email = scan.nextLine();
		book.setAuthorName(author);
		book.setEmail(email);
		while(book.checkFormatName()==true) {
			System.out.print("Enter author's name, again : ");
			author = scan.nextLine();
		}
		while(book.checkEmail()==true) {
			System.out.print("Enter author's email, again : ");
			email = scan.nextLine();
		}
		System.out.println(book);

	}

}
