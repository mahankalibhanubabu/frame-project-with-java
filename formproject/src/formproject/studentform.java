package formproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class studentform {

	private JFrame frame;
	private JTextField r;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentform window = new studentform();
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
	public studentform() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT REGISTRATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(140, 11, 144, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NUMBER");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(89, 48, 97, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("STUDENT NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(89, 73, 97, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BRANCH");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(99, 107, 87, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(99, 145, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("PROGRAMMING LANGUAGES");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(19, 180, 156, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		r = new JTextField();
		r.setBounds(263, 45, 86, 20);
		frame.getContentPane().add(r);
		r.setColumns(10);
		
		tb1 = new JTextField();
		tb1.setBounds(263, 70, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "IT", "MECH", "ECE", "IOT", "AIML", "CS", "DS"}));
		cb1.setBounds(263, 103, 86, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton m = new JRadioButton("MALE");
		m.setBounds(185, 141, 109, 23);
		frame.getContentPane().add(m);
		
		JRadioButton fm = new JRadioButton("FEMALE");
		fm.setBounds(307, 141, 109, 23);
		frame.getContentPane().add(fm);
		
		JCheckBox c = new JCheckBox("C");
		c.setBounds(181, 176, 66, 23);
		frame.getContentPane().add(c);
		
		JCheckBox p = new JCheckBox("PYTHON");
		p.setBounds(249, 176, 87, 23);
		frame.getContentPane().add(p);
		
		JCheckBox j = new JCheckBox("JAVA");
		j.setBounds(348, 176, 97, 23);
		frame.getContentPane().add(j);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll = r.getText();
				String name = tb1.getText();
				String branch = (String )cb1.getSelectedItem();
				String gender = "";
				String langs ="";
				if(m.isSelected()) {
					gender ="male";
				}
				if(fm.isSelected()) {
					gender ="Female";
				}
				if(c.isSelected()) {
					langs =langs+"c ";
				}
				if(p.isSelected()) {
					langs =langs+"Python";
				}
				if(c.isSelected()) {
					langs =langs+" java";
				}
				JOptionPane.showMessageDialog(btnNewButton, "ROLL NUMBER "+roll+"\n NAME"+name+
						"\n BRANCH"+branch+"\n GENDER"+gender+"\n LANGUGES"+langs);
				
			}
			
		});
		btnNewButton.setBackground(new Color(0, 255, 255));
		btnNewButton.setBounds(162, 216, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
