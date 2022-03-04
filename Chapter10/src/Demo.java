import java.awt.EventQueue;

import javax.swing.*;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//Done!s
public class Demo {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	
	ImageIcon can = new ImageIcon("C:\\Users\\amabdalla\\OneDrive - Calgary Board of Education\\Desktop\\CS20_Eclipse\\Chapter10_v2\\src\\can.jpg");
	ImageIcon cw = new ImageIcon("C:\\Users\\amabdalla\\OneDrive - Calgary Board of Education\\Desktop\\CS20_Eclipse\\Chapter10_v2\\src\\cw.png");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 891, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 846, 572);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtFirstName.setText(null);
				
			}
		});
		txtFirstName.setForeground(Color.GRAY);
		txtFirstName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(37, 50, 233, 35);
		panel.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				txtLastName.setText("");
			}
		});
		txtLastName.setForeground(Color.GRAY);
		txtLastName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtLastName.setText("Last Name");
		txtLastName.setColumns(10);
		txtLastName.setBounds(323, 50, 233, 35);
		panel.add(txtLastName);
		
		JComboBox grd = new JComboBox();
		grd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		grd.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		grd.setBounds(121, 128, 91, 45);
		panel.add(grd);
		
		JLabel lblNewLabel = new JLabel("Grade Level");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(37, 127, 97, 45);
		panel.add(lblNewLabel);
		
		JComboBox sch = new JComboBox();
		sch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sch.setModel(new DefaultComboBoxModel(new String[] {"Crescent", "Western", "Pearson", "Forest Lawn"}));
		sch.setBounds(379, 130, 244, 45);
		panel.add(sch);
		
		JLabel lblNewLabel_1 = new JLabel("School");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(323, 145, 61, 14);
		panel.add(lblNewLabel_1);
		
		JTextArea disp = new JTextArea();
		disp.setBounds(37, 214, 586, 101);
		panel.add(disp);
		
		JLabel di = new JLabel("");
		di.setBounds(35, 356, 615, 197);
		panel.add(di);
		
		
		di.setIcon(cw);
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String grade = " ";
				String school = " ";
				String Fn = txtFirstName.getText();
				String Ln = txtLastName.getText();
				
				if(grd.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				else if(grd.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else 
				{
					grade = "12";
				}
				
				if(sch.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
					
					di.setIcon(can);
					
					
					
				}
				else if(sch.getSelectedItem().equals("Western"))
				{
					school = "Western";
				}
				else if(sch.getSelectedItem().equals("Pearson"))
				{
					school = "Pearson";
					di.setIcon(cw);
				}
				else
				{
					school = "Forest Lawn";
				}
				
				
				disp.setText(Fn + " " + Ln + "is in grade: " 
				+ grade + ", and goes to: " 
				+ school);	
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(669, 118, 136, 197);
		panel.add(btnNewButton);
		
		
	}
}
