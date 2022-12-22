import java.util.*;

public class StudentTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[3];
		for (int i = 0; i < std.length; i++) {
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
		System.out.println("------------------------------------");
		/*for (int i = 0; i < std.length; i++) {
			if (std[i].isPass()) {
				System.out.println(">> " + std[i].getName() + " (" + std[i].getScore() + ")");
			}
		}*/
		for(Student STD:std) {
			if (STD.isPass()) {
				System.out.println(">> " + STD.getName() + " (" + STD.getScore() + ")");
			}
		}

	}

}
