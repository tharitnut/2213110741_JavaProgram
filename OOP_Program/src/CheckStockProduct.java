import java.util.*;

public class CheckStockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product prd = new Product();
	static int low = 0,normal=0,high=0;

	public static void main(String[] args) {
		System.out.print("How many product list in stock :");
		Product[] prd = new Product[scan.nextInt()];
		for (Product PRD:prd) {
			PRD = new Product();
			System.out.print("Input product Id   : ");
			PRD.setId(scan.next());
			System.out.print("Input product Unit : ");
			PRD.setUnit(scan.nextInt());
			System.out.println();
			if(PRD.getUnit()<5) {
				low++;
				PRD.setlow(PRD);
			}
			else if(PRD.getUnit()<=5&&PRD.getUnit()>=50) {
				normal++;
			}
			else if(PRD.getUnit()>50) {
				high++;
			}
		}
		line();
		System.out.println("List of product in 'LOW' status.");
		line();
		System.out.println(">> "+);
		

	}

	public static void line() {
		System.out.println("---------------------------------------------------");
	}

}
