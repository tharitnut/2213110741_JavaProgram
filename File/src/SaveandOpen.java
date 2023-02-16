import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	private String name;
	private String dept;

	public void insert() throws IOException {
		Scanner console = new Scanner(System.in);
		PrintStream ps = new PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name\t   : ");
			String name = console.next();
			System.out.print("Enter department   : ");
			String dept = console.next();
			ps.println(name + "\t" + dept);
			System.out.print("Enter data again?  : ");
			answer = console.next();
		} while (answer.equalsIgnoreCase("y"));
	}

	public void read() throws IOException {
		try {
			Scanner in = new Scanner(new FileReader("employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while (in.hasNext()) {
				name = in.next();
				dept = in.next();
				if (dept.equalsIgnoreCase(super.getDept())) {
					i++;
					System.out.println(i + ") " + name);
					check = true;
				}
			}
			if (check) {
				super.header();
				System.out.println("Employee in dept " + super.getDept() + " is " + i + " person.");
			} else {
				System.out.println("Sorry, no dept : " + super.getDept() + " in file.");
			}
			in.close();
		} catch (IOException e) {
			System.out.println("\nSorry, file not found...");
		}

	}

}
