import java.awt.EventQueue;

import javax.swing.*;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;




public class Demo2 {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo2 window = new Demo2();
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
	public Demo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		
		ImageIcon platesImage = new ImageIcon("..\\Chapter10_v2\\src\\can.jpg");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 799, 645);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 720, 573);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.setForeground(Color.GRAY);
		fn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fn.setText("First Name");
		fn.setBounds(23, 49, 233, 33);
		panel.add(fn);
		fn.setColumns(10);
		
		ln = new JTextField();
		ln.setText("Last Name");
		ln.setForeground(Color.GRAY);
		ln.setFont(new Font("Tahoma", Font.PLAIN, 16));
		ln.setColumns(10);
		ln.setBounds(266, 49, 233, 33);
		panel.add(ln);
		
		JComboBox gr = new JComboBox();
		gr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		gr.setForeground(Color.BLUE);
		gr.setModel(new DefaultComboBoxModel(new String[] {"Select Grade:", "10", "11", "12"}));
		gr.setBounds(34, 115, 127, 43);
		panel.add(gr);
		
		JComboBox sc = new JComboBox();
		sc.setForeground(Color.BLUE);
		sc.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sc.setModel(new DefaultComboBoxModel(new String[] {"Select School:", "Crescent", "Pearson", "Western"}));
		sc.setBounds(277, 123, 204, 35);
		panel.add(sc);
		
		JTextArea disp = new JTextArea();
		disp.setForeground(Color.BLUE);
		disp.setFont(new Font("Monospaced", Font.PLAIN, 16));
		disp.setBounds(23, 205, 476, 89);
		panel.add(disp);
		
		
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(519, 21, 141, 239);
		panel.add(btnNewButton);
		
		JLabel imga = new JLabel("");
		imga.setBounds(23, 339, 519, 209);
		panel.add(imga);
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String grade =" ";
				String school = " ";
				String fN = fn.getText();
				String lN = ln.getText();
				
				if(gr.getSelectedItem().equals("10"))
				{
					grade = "10";
				}
				if(gr.getSelectedItem().equals("11"))
				{
					grade = "11";
				}
				else
				{
					grade = "12";
				}
				
				if(sc.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
					imga.setIcon(platesImage);
				}
				if(sc.getSelectedItem().equals("Pearson"))
				{
					school = "Pearson";
				}
				else
				{
					school = "Western";
				}
				
				disp.setText
				(	fN + " " +
				    lN + "is in grade: "+
					grade + " "+ 
				    "and goes to: "+
					school					
				);
				
				
				
				
				
				
				
			}
		});
		
		
		
	}
}
