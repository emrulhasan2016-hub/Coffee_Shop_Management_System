package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstPage extends JFrame implements ActionListener
{
	//Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
	JPanel panel;
	JButton admin,customer,Guest;
	
	
	ImageIcon icon = new ImageIcon ("Image/bank.png");
	ImageIcon icon1 = new ImageIcon ("Image/main.jpg");
	
	public FirstPage ()
	{
		super("My Coffee Shop");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setIconImage(icon.getImage());
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,1200,675);
		panel.setOpaque(false);
		this.add(panel);
		this.setLayout(null);
		
		JLabel background = new JLabel(icon1);
		background.setBounds(0,0,1200,675);
		this.add(background);
		
		admin = new JButton("Admin");
		admin.setBackground(Color.BLACK);
		admin.setForeground(Color.WHITE);
		admin.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		admin.setBounds(150,100,200,80);
		admin.setFocusPainted(false);
		admin.addActionListener(this);
		panel.add(admin);

		Guest = new JButton("Guest");
		Guest.setBackground(Color.BLACK);
		Guest.setForeground(Color.WHITE);
		Guest.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		Guest.setBounds(150,250,200,80);
		Guest.setFocusPainted(false);
		Guest.addActionListener(this);
		panel.add(Guest);
		
		customer = new JButton("Customer");
		customer.setBackground(Color.BLACK);
		customer.setForeground(Color.WHITE);
		customer.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		customer.setBounds(150,400,200,80);
		customer.setFocusPainted(false);
		customer.addActionListener(this);
		panel.add(customer);
		
		
		this.setVisible(true);
		
}
		public void actionPerformed(ActionEvent ae)
		{
			
			if(ae.getSource() == admin)
			{
			    AdminLogin login = new AdminLogin ();
				
				this.setVisible(false);
				login.setVisible(true);
				
			}
			else if (ae.getSource() == Guest)
			{
				GuestMenu gs= new GuestMenu ();

				this.setVisible(false);
				gs.setVisible(true);

			}
				else if (ae.getSource() == customer)
				{
					Customer cs = new Customer ();
				
					this.setVisible(false);
					cs.setVisible(true);
				
				}
}

}