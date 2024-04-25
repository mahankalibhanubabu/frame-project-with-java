package formproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movietickets {

	protected static final int YES_OPTION = 0;
	protected static final int PAY_OPTION = 0;
	private JFrame frame;
	private JTextField n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movietickets window = new movietickets();
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
	public movietickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MOVIE TICKETS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(138, 22, 161, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel tb1 = new JLabel("NAME");
		tb1.setFont(new Font("Tahoma", Font.BOLD, 14));
		tb1.setBounds(113, 57, 46, 14);
		frame.getContentPane().add(tb1);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE NAME");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(76, 94, 103, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NUMBER OF TICKETS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(33, 136, 166, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		n = new JTextField();
		n.setBounds(213, 54, 86, 20);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		JComboBox cb = new JComboBox();
		cb.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "PERMALU", "GUNTUR KARAM", "KHALEJA", "MAHARSHI", "SPYDER"}));
		cb.setBounds(213, 92, 86, 22);
		frame.getContentPane().add(cb);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7"}));
		cb2.setBounds(213, 134, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = n.getText();
				String movie =(String)cb.getSelectedItem();
				String tickets = (String)cb2.getSelectedItem();
				int nt =Integer.parseInt(tickets);
				int bill =0;
				if(movie.equals("PERMALU")) {
					bill =bill +nt *150;
				}
				if(movie.equals("GUNTUR KARAM")) {
					bill =bill +nt *150;
				}
				if(movie.equals("KHALEJA")) {
					bill =bill +nt *150;
				}
				if(movie.equals("MAHARSHI")) {
					bill =bill +nt *150;
				}
				if(movie.equals("SPYDER")) {
					bill =bill +nt *150;
				}
				int resp=0;
				int resp2 =0;
				resp =JOptionPane.showConfirmDialog(btnNewButton, "NAME :"+name+ "\n MOVIE NAME :"+movie+ "\n NUMBER OF TICKETS :"+nt);
				if (resp == YES_OPTION) {
					resp2 =JOptionPane.showConfirmDialog(btnNewButton, "payment bill"+bill);
					if(resp2 == PAY_OPTION) {
						JOptionPane.showMessageDialog(btnNewButton, "BOOKING CONFIRMED");
					}
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "BOOKING CANCELLED");
				}
			}
		});
		btnNewButton.setBounds(148, 185, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\bobby\\Downloads\\mt2.jpg"));
		lblNewLabel_1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
