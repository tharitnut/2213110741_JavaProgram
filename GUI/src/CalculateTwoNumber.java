import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
import javax.swing.*;

public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setTitle("CalculateTwoNumber");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumber1l = new JLabel("Enter Number 1");
		lblNumber1l.setBounds(82, 30, 109, 14);
		contentPane.add(lblNumber1l);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(204, 27, 132, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(82, 68, 109, 14);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(204, 65, 132, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(82, 115, 46, 14);
		contentPane.add(lblOperator);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(204, 111, 132, 22);
		contentPane.add(chOperator);
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblResult.setBounds(227, 305, 58, 27);
		contentPane.add(lblResult);
		
		JLabel rdbOperator = new JLabel("How to show digit");
		rdbOperator.setBounds(82, 160, 109, 14);
		contentPane.add(rdbOperator);
		
		final JRadioButton onedigit = new JRadioButton("1 Digit");
		onedigit.setBounds(204, 156, 109, 23);
		contentPane.add(onedigit);
		
		final JRadioButton twodigit = new JRadioButton("2 Digits");
		twodigit.setBounds(204, 180, 109, 23);
		contentPane.add(twodigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(onedigit);
		group.add(twodigit);
		
		JLabel lblShow = new JLabel("Option to show");
		lblShow.setBounds(82, 223, 89, 14);
		contentPane.add(lblShow);
		
		final JCheckBox chkDialogbox = new JCheckBox("Show Result as Dialogbox");
		chkDialogbox.setBounds(204, 219, 164, 23);
		contentPane.add(chkDialogbox);
		
		final JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum = 0;
				String operator;
				if(e.getSource()==btnOk) {
					num1 = Double.parseDouble(txtNumber1.getText());
					num2 = Double.parseDouble(txtNumber2.getText());
					operator = (String)chOperator.getSelectedItem();
					if(operator.equals("+")) 
						sum=num1+num2;
					if(operator.equals("-")) 
						sum=num1-num2;
					if(operator.equals("*")) 
						sum=num1*num2;
					if(operator.equals("/")) 
						sum=num1/num2;
					
					DecimalFormat frmNumber = null;
					if(onedigit.isSelected()) 
						frmNumber = new DecimalFormat("#,###.0");
					else if(twodigit.isSelected()) 
						frmNumber = new DecimalFormat("#,###.00");
					
					lblResult.setText(frmNumber.format(sum));
					
					if(chkDialogbox.isSelected()) {
						if(onedigit.isSelected()) {
							frmNumber = new DecimalFormat("#,###.0");
						JOptionPane.showMessageDialog(null, "Result is : "+(frmNumber.format(sum)));
						}
						else if(twodigit.isSelected()) {
							frmNumber = new DecimalFormat("#,###.00");
						JOptionPane.showMessageDialog(null, "Result is : "+(frmNumber.format(sum)));
						}
					}
				}
			}
		});
		btnOk.setBounds(111, 363, 89, 23);
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(216, 363, 89, 23);
		contentPane.add(btnExit);

	}
}
