package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Customer extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
	JPanel panel;
	JButton order;
	
	
	ImageIcon icon = new ImageIcon ("Image/4000.png");
	ImageIcon icon1 = new ImageIcon ("Image/0.jpg");
	
	public Customer ()
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
		
		order = new JButton("Press here to order");
		order.setBackground(Color.BLACK);
		order.setForeground(Color.WHITE);
		order.setFocusPainted(false);
		order.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		order.setBounds(150,250,250,100);
		order.addActionListener(this);
		panel.add(order);
		
		this.setVisible(true);
	
	
	}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource() == order)
			{
				MenuCard menu = new MenuCard ();
			
				this.setVisible(false);
				menu.setVisible(true);
			}
		}
	

}