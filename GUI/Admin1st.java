package GUI;
import Employeee.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Admin1st extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 25);
	JPanel panel;
	JButton chef,cleaner,waiter,back;
	
	ImageIcon icon = new ImageIcon ("Image/400.png");
	ImageIcon icon1 = new ImageIcon ("Image/ii.jpg");
	
	public Admin1st ()
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
		
		chef = new JButton("Chef");
		//chef.setIcon(icon2);
		chef.setBackground(Color.BLACK);
		chef.setForeground(Color.WHITE);
		//chef.setFocusPainted(false);
		chef.setFocusPainted(false);
		chef.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		chef.setBounds(200,200,200,200);
		chef.addActionListener(this);
		panel.add(chef);
		
		cleaner = new JButton("Cleaner");
		//cleaner.setIcon(icon3);
		cleaner.setBackground(Color.BLACK);
		cleaner.setForeground(Color.WHITE);
		cleaner.setFocusPainted(false);
		cleaner.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		cleaner.setBounds(500,200,200,200);
		cleaner.addActionListener(this);
		panel.add(cleaner);
		
		waiter = new JButton("Waiter");
		//waiter.setIcon(icon4);
		waiter.setBackground(Color.BLACK);
		waiter.setForeground(Color.WHITE);
		waiter.setFocusPainted(false);
		waiter.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		waiter.setBounds(800,200,200,200);
		waiter.addActionListener(this);
		panel.add(waiter);
		
		back = new JButton("Back..");
		back.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(30,560,170,50);
		back.setFocusPainted(false);
		back.addActionListener(this);
		panel.add(back);
		
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)  
	{
		if(back == ae.getSource())
			{
			    FirstPage first = new FirstPage ();
			
				this.setVisible(false);
				first.setVisible(true);
			}
			
		if(chef == ae.getSource())
		{
			ChefInfo t = new ChefInfo();
			
			this.setVisible(false);
			t.setVisible(true);
		}
		
		else if(waiter == ae.getSource())
		{
			WaiterInfo t1 = new WaiterInfo();
			
			this.setVisible(false);
			t1.setVisible(true);
		}
		
		else if(cleaner == ae.getSource())
		{
			CleanerInfo t2 = new CleanerInfo();
			
			this.setVisible(false);
			t2.setVisible(true);
		}
		
	}
}