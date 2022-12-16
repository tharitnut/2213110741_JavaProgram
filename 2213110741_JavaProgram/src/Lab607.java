import java.util.*;

public class Lab607 {
	static String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December" };
	static int[] count = new int[12];
	static int[] inputDate = new int[5];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		inputBirthDate();

	}
	
	public static void inputBirthDate() {
		for(int i =0;i<inputDate.length;i++) {
			System.out.print("Enter BirthDate "+(i+1)+" :");
			String date = scan.nextLine();
			int bmonth = checkBirthDate(date);
			inputDate[i]= bmonth;
			count[bmonth-1]++;
		}
		displayCountBday(count);
	}
	
	public static int checkBirthDate(String date) {
		int month = Integer.parseInt(date.substring(3,5));
		return month;
	}
	
	public static void displayCountBday(int[] count) {
		System.out.println();
		for(int i = 0;i<month.length;i++) {
			System.out.println(month[i]+"   ["+count[i]+" people]");
		}
	}

}
