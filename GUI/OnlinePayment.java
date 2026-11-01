package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class OnlinePayment extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
	JPanel panel;
	JButton b1,b2,b3,back;
	
	
	ImageIcon icon = new ImageIcon ("Image/4000.png");
	ImageIcon icon1 = new ImageIcon ("Image/payOnline.jpg");
	
	
	
	public OnlinePayment ()
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
		
		b1 = new JButton();
		b1 = new JButton(new ImageIcon("Image/card1.png"));
		b1.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		b1.setBackground(Color.WHITE);
		b1.setBounds(700,250,150,150);
		b1.setFocusPainted(false);
		b1.addActionListener(this);
		panel.add(b1);
		
		b2 = new JButton();
		b2 = new JButton(new ImageIcon("Image/bkash1.png"));
		b2.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		b2.setBounds(900,250,150,150);
		b2.setBackground(Color.WHITE);
		b2.setFocusPainted(false);
		b2.addActionListener(this);
		panel.add(b2);
		
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
			    MenuCard first = new MenuCard ();
			
				this.setVisible(false);
				first.setVisible(true);
			}
		
		if(b1 == ae.getSource())
		{
			BankPay t = new BankPay();
			
			this.setVisible(false);
			t.setVisible(true);
		}
		
		else if(b2 == ae.getSource())
		{
			BikashPay t = new BikashPay();
			
			this.setVisible(false);
			t.setVisible(true);
		}
	}
}