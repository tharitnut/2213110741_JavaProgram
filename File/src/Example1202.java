import java.io.*;
import java.util.*;

public class Example1202 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);

	}

	public static void Header(int sec) {
		System.out.println("************************************************************");
		System.out.println("\t\tList of Data for Section " + sec);
		System.out.println("************************************************************");
	}

	public static void showListStudent(int sec) throws IOException{
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			double mid=Double.parseDouble(data[4]);
			double fin=Double.parseDouble(data[5]);
			String gradeResult = findResult(mid, fin);
			if(Integer.parseInt(data[3])==sec) {
				System.out.println(data[0]+" "+data[2]+"\t"+mid+"\t"+fin+"\t"+gradeResult);
			}
		}
		read.close();
	}

	public static String findResult(double mid,double fin) {
		double total=mid+fin;
		return total>=40?"Pass":"Fail"; 
	}

}
