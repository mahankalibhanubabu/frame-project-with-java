package dboperations;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class studentregisteration {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentregisteration window = new studentregisteration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public studentregisteration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTERATION FORM");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(52, 11, 342, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(100, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ROLL NO");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(75, 85, 71, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(75, 118, 71, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(224, 44, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setBounds(224, 84, 86, 21);
		frame.getContentPane().add(tb2);
		tb2.setColumns(10);
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "IOT", "CS", "DS", "AIML", "MECH"}));
		cb.setBounds(224, 116, 86, 22);
		frame.getContentPane().add(cb);
		
		JLabel lblNewLabel_4 = new JLabel("MARKS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(75, 155, 86, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb3 = new JTextField();
		tb3.setBounds(224, 152, 86, 20);
		frame.getContentPane().add(tb3);
		tb3.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =tb1.getText();
				String rollno =tb2.getText();
				String branch = (String)cb.getSelectedItem();
				String marks =tb3.getText();
				int m =Integer.parseInt(marks);
				try {
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","bhanu","bhanu");
					String q ="insert into student values ('"+name+"','"+rollno+"','"+branch+"','"+m+"')";
					Statement stn =con.createStatement();
					stn.executeUpdate(q);
					JOptionPane.showMessageDialog(btnNewButton, "inserted sucussfully");
					con.close();
				}
				catch(SQLException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(141, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\bobby\\Downloads\\s.jpeg"));
		lblNewLabel_5.setBounds(62, -75, 452, 386);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
