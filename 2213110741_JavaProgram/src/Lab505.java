import java.util.Scanner;

public class Lab505 {
	static String studentId;
	static String subjecttId;

	public static void main(String[] args) {
		inputStudent();

	}

	public static void inputStudent() {
		//��ҡ��Ѻ��
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student Id: ");
		studentId = scan.next();
		System.out.print("Enter Sublect Id: ");
		subjecttId = scan.next();
		while(!isLength(studentId, subjecttId)) {
			System.out.print("Enter Student Id: ");
			studentId = scan.next();
			System.out.print("Enter Sublect Id: ");
			subjecttId = scan.next();
		}
		displayData(isITStudent(studentId),isITSubject(subjecttId));
		
	}
	
	public static boolean isLength(String studentId,String subjectId) {
		if(studentId.length()==10&&subjectId.length()==7) {
			return true;
		}
		else return false;
	}
	
	public static boolean isITStudent(String studentId) {
		if(studentId.substring(2,3).equals("1")&&studentId.substring(3,6).equals("311")) {
			return true;
		}
		else return false;
		
	}
	
	public static boolean isITSubject(String subjectId) {
		if(subjectId.substring(0,2).equals("21")&&subjectId.substring(4,5).equals("1")) {
			return true;
		}
		else return false;
	}
	
	public static void displayData(boolean student,boolean subject) {
		System.out.println("Student id: "+studentId+((student)?" ":" is not ")+
				"1st year student in IT\n"+((subject)?"Enroll ":"not enroll ")+
				"in courses for Year 1");
	}
}
