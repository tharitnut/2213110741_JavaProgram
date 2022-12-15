import javax.swing.*;

public class Lab_Example602_2 {

	public static void main(String[] args) {
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		boolean check = false;
		String dept="";
		String deptCheck = JOptionPane.showInputDialog("Enter a department name");
		for (int i = 0;i<deptName.length;i++) {
			if(deptCheck.equalsIgnoreCase(deptName[i])) {
				check=true;
				dept=deptName[i];
			}
		}
		JOptionPane.showMessageDialog(null,
				dept+(check?" was ":" was not ")+"found on the list");
	}

}
