import java.util.*;
import java.text.DecimalFormat;

public class Lab602 {
	static Scanner scan = new Scanner(System.in);
	static DecimalFormat frm = new DecimalFormat ("#.00");
	static double sum = 0;
	static double avg=0;

	public static void main(String[] args) {
		double[] inputScore = new double[5];
		for(int i=0;i<inputScore.length;i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			inputScore[i] = scan.nextDouble();
			sum += inputScore[i];
		}
		System.out.println();
		avg = sum/(inputScore.length);
		System.out.println("Average of "+inputScore.length+" students is "+frm.format(avg));
		for(int i =0;i<inputScore.length;i++) {
			if(inputScore[i]>avg) {
				System.out.println("> Student "+(i+1)+" ("+frm.format(inputScore[i])+") ");
			}
		}

	}

}
