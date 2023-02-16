import java.io.*;
import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String choice;
		String dept;
		System.out.print("Insert or Read data? : ");
		choice = console.next().toLowerCase();
		while (!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Please text insert or read data? : ");
			choice = console.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen();
		if (choice.equals("insert")) {
			file.insert();
		} else {
			System.out.print("\nEnter dept : ");
			dept = console.next();
			file.setDept(dept);
			file.read();
		}

	}

}
