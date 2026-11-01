package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Coffee extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
	JPanel panel;
	JButton next;
	
	
	ImageIcon icon = new ImageIcon ("Image/bank.png");
	ImageIcon icon1 = new ImageIcon ("Image/main.jpg");
	
	public Coffee ()
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
		this.add(background);
		
		
		JLabel title = new JLabel ("Welcome");
		title.setBounds(60,150,1200,300);
		title.setFont(font);
		panel.add(title);
		
		
		next = new JButton("NEXT..");
		next.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		next.setBounds(970,550,170,50);
		next.setFocusPainted(false);
		next.addActionListener(this);
		panel.add(next);
		
		
		this.setVisible(true);
		
}
		public void actionPerformed(ActionEvent ae)
		{
			
			if(next == ae.getSource())
			{
			    FirstPage first = new FirstPage ();
			
				this.setVisible(false);
				first.setVisible(true);

				//System.exit(0);
			}
			else {
				System.out.println("==========");
			}
		}
}