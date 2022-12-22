import java.util.*;

public class StudentScore {
	static Scanner scan = new Scanner(System.in);
	static Student std = new Student();

	public static void main(String[] args) {
		System.out.print("How many student in classroom : ");
		Student[] std = new Student[scan.nextInt()];
		for (int i = 0; i < std.length; i++) {
			System.out.println();
			System.out.println("INPUT INFORMATION OF STUDENT "+(i+1));
			line();
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score : ");
			std[i].setScore(scan.nextInt());
			while (!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50) ");
		line();
		for(Student STD:std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() +
				" get grade " + STD.findGrade(STD.getScore()));
			}
		}
	}
	
	public static void line() {
		System.out.println("--------------------------------");
	}
	
	
}
