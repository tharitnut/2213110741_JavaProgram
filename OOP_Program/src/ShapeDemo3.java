import javax.swing.*;

public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder[] cyl = new Cylinder[5];
		for (int i = 0; i < cyl.length; i++) {
			String[] result = (JOptionPane.showInputDialog("Input radius & height")).split(" ");
			double radius = Double.parseDouble(result[0]);
			double height = Double.parseDouble(result[1]);
			cyl[i]=new Cylinder(radius,height);
		}
		int l =1;
		String result="";
		for(Cylinder _cyl:cyl) {
			result += "Cylinder "+l+", volume="+_cyl.getVolume()+"\n";
			l++;
		}
		JOptionPane.showMessageDialog(null, result);

	}

}
