import java.util.*;

public class CheckStockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product prd = new Product();
	static int low = 0, normal = 0, high = 0;

	public static void main(String[] args) {
		System.out.print("How many product list in stock : ");
		Product[] prd = new Product[scan.nextInt()];
		System.out.println();
		for (int i =0;i<prd.length;i++) {
			prd[i] = new Product();
			System.out.print("Input product Id   : ");
			prd[i].setId(scan.next());
			System.out.print("Input product Unit : ");
			prd[i].setUnit(scan.nextInt());
			while(prd[i].getUnit()<0) {
				System.out.print("Input product Unit, again : ");
				prd[i].setUnit(scan.nextInt());
			}
			System.out.println();

		}
		line();
		System.out.println("List of product in \'LOW\' status.");
		line();
		for (Product PRD : prd) {
			int count=0;
			if(PRD.chkStatus(PRD.getUnit()).equalsIgnoreCase("low")) {
				System.out.println(">> +"+PRD.getId()+" has "+PRD.getUnit()+" units");
				count++;
			}
			if(count==0) {
				System.out.println("There is't any LOW product");
			}
		}
		line();
		System.out.println("List of product in 'NORMAL' status.");
		line();
		for (Product PRD : prd) {
			int count=0;
			if(PRD.chkStatus(PRD.getUnit()).equalsIgnoreCase("normal")) {
				System.out.println(">> "+PRD.getId()+" has "+PRD.getUnit()+" units");
				count++;
			}
			if(count==0) {
				System.out.println("There is't any NORMAL product");
			}
		}
		line();
		System.out.println("List of product in 'HIGH' status.");
		line();
		for (Product PRD : prd) {
			int count=0;
			if(PRD.chkStatus(PRD.getUnit()).equalsIgnoreCase("high")) {
				System.out.println(">> +"+PRD.getId()+" has "+PRD.getUnit()+" units");
				count++;
			}
			if(count==0) {
				System.out.println("There is't any HIGH product");
			}
		}

	}

	public static void line() {
		System.out.println("------------------------------------------");
	}

}
