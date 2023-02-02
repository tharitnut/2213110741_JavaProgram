import javax.swing.*;

public class Shop100Baht {

	public static void main(String[] args) {
		Product2 arnupab = new Product2();
		int choice = JOptionPane.showConfirmDialog(null,
				"Is the program run on Pattanakarn Branch?",
				"Run Program",JOptionPane.YES_NO_OPTION);
		if(choice==0) {
			arnupab = new PattanakarnBranch();
		}
		arnupab.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input the number of product:")));
		JOptionPane.showMessageDialog(null, arnupab);

	}

}
