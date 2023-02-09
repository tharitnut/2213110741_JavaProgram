import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cyl = new Cylinder[5];
		for (int i = 0; i < cyl.length; i++) {
			System.out.print("Input radius & height : ");
			double radius = scan.nextDouble();
			double height = scan.nextDouble();
			cyl[i]=new Cylinder(radius,height);
		}
		int i =1;
		for(Cylinder _cyl:cyl) {
			System.out.println("Cylinder "+i+", volume="+_cyl.getVolume());
			i++;
		}

	}

}
