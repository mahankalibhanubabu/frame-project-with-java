package formproject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;

public class metroticketbooking {

	private JFrame frame;
	private JTextField n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticketbooking window = new metroticketbooking();
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
	public metroticketbooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKETS BOOKING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(70, 11, 286, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(97, 46, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(80, 71, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DESTINATION ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(36, 99, 112, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("JOURNEY DATE");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(36, 137, 124, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("NO. OF TICKETS");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(27, 162, 133, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		
		n = new JTextField();
		n.setBounds(185, 43, 96, 20);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "AMEERPET", "JNTU", "LB NAGER", "MGBS", "JBS", "PARADISE", "KUKATPALLY"}));
		cb1.setBounds(185, 70, 96, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KUKATPALLY", "MIYAPUR", "UPPAL", "LB NAGER", "JBS", "MGBS"}));
		cb2.setBounds(185, 97, 97, 22);
		frame.getContentPane().add(cb2);
		
		JSpinner js1 = new JSpinner();
		js1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		js1.setBounds(185, 164, 96, 20);
		frame.getContentPane().add(js1);
		
		JSpinner js = new JSpinner();
		js.setModel(new SpinnerDateModel(new Date(1713810600000L), new Date(1711132200000L), new Date(1713810600000L), Calendar.DAY_OF_YEAR));
		js.setBounds(185, 134, 96, 20);
		frame.getContentPane().add(js);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = n.getText();
				String s = (String)cb1.getSelectedItem();
				String des = (String)cb2.getSelectedItem();
				int nt =(int) js1.getValue();
				int bill =0;
				if(s.equals(des)) {
					JOptionPane.showMessageDialog(btnNewButton, "PLEASE CHECK STATIONS");
				}
				else {
					bill =bill +nt*45;
					JOptionPane.showMessageDialog(btnNewButton, "NAME :"+ name+ "\n SOURCE :"+s+"\n  DESTINATION :"+des+ "\n NUMBER OF TICKETS :"+nt+
						"\n AMOUNT :"+bill +"HAPPY JOURNEY !!!");
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(154, 198, 89, 23);
		frame.getContentPane().add(btnNewButton);
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\bobby\\Downloads\\images.jpeg"));
		lblNewLabel_6.setBounds(10, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_6);
	}
}
