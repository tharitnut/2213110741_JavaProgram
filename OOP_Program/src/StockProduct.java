import java.util.*;
import java.text.*;

public class StockProduct {
	static Scanner scan = new Scanner(System.in);
	static Product[] prd = new Product[4];
	static DecimalFormat frm = new DecimalFormat("#,###.00");

	public static void main(String[] args) {
		for (int i = 0; i < prd.length; i++) {
			prd[i] = new Product();
			System.out.print("Input product Id    : ");
			prd[i].setId(scan.next());
			System.out.print("Input product Unit  : ");
			prd[i].setUnit(scan.nextInt());
			System.out.print("Input product Price : ");
			prd[i].setPrice(scan.nextDouble());
			System.out.println();
		}
		line();
		double total = 0;
		for (Product PRD:prd) {
			System.out.println("Product ID : "+PRD.getId()+
				", Total price = "+frm.format(PRD.calculate())+" baht.");
			total +=PRD.calculate();
		}
		line();
		System.out.println("Total price of all products is "+frm.format(total)+" baht.");

	}

	public static void line() {
		System.out.println("---------------------------------------------------");
	}

}
