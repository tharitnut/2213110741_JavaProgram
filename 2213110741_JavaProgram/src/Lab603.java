import java.util.*;

public class Lab603 {
	static Scanner scan = new Scanner(System.in);
	static int[] numofInteger = {78,36,58,41,25,92,75};

	public static void main(String[] args) {
		System.out.print("Input index of array : ");
		int indexofArray = scan.nextInt();
		while((indexofArray<0)||(indexofArray>numofInteger.length-1)) {
			System.out.print("Input index of array, again : ");
			indexofArray = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+(numofInteger[indexofArray]));
		//System.out.println("Value in next    index is "+(numofInteger[indexofArray+1]));
		if(indexofArray==numofInteger.length-1) 
			System.out.println("Sorry, "+indexofArray+" is yhe last index in array.");
		else
			System.out.println("Value in next    index is "+(numofInteger[indexofArray+1]));
		

	}

}
