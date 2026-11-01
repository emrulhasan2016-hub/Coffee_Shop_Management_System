package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LastPage extends JFrame implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.BOLD , 25);
	JPanel panel;
	JLabel title1,title2,title3,title4;
	JTextField screen1;
	JPasswordField password;
	JButton finish;
	
	
	ImageIcon icon = new ImageIcon ("Image/4000.png");
	ImageIcon icon1 = new ImageIcon ("Image/hhh.jpg");
	
	public LastPage ()
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
		
		title1 = new JLabel("Number             : ");
		title1.setBounds(70,150,380,25);
		title1.setFont(font);
		panel.add(title1);
		
		title2 = new JLabel("Password          : ");
		title2.setBounds(70,210,380,25);
		title2.setFont(font);
		panel.add(title2);
		
		title3 = new JLabel(".......................................");
		title3.setBounds(285,160,380,25);
		title3.setFont(font);
		panel.add(title3);
		
		title4 = new JLabel("......................................");
		title4.setBounds(285,220,380,25);
		title4.setFont(font);
		panel.add(title4);
		
		screen1 = new JTextField();
		screen1.setBounds(285,150,380,30);
		screen1.setFont(font);
		screen1.setBackground(new Color(200,200,200));
		screen1.setOpaque(false);
		screen1.setBorder(BorderFactory.createEmptyBorder());
		panel.add(screen1);
		
		
		password = new JPasswordField();
        password.setBounds(285,210,280,30);
		password.setEchoChar('*');
		password.setBorder(BorderFactory.createEmptyBorder());
        password.setFont(font);
        this.add(password);
		
		finish = new JButton("Finish");
		finish.setBounds(20,570,170,50);
		finish.setBackground(Color.BLACK);
		finish.setForeground(Color.WHITE);
		finish.setBorder(BorderFactory.createEmptyBorder());
		finish.setFont(font);
		finish.addActionListener(this);
		panel.add(finish);
		
		this.setVisible(true);
		
}
	public void actionPerformed(ActionEvent ae)
	{
		if (finish == ae.getSource())
		{
			if(isAnyDataEmpty())
			{
				JOptionPane.showMessageDialog(this, "Please Provide All The necessary Information", "Warning",
						JOptionPane.WARNING_MESSAGE);
			}
			else 
			{
				JOptionPane.showMessageDialog(this, "Your order have successfully purchased.", "Information",
				JOptionPane.INFORMATION_MESSAGE);
				this.setVisible(false);
			}
		}
	}
	public boolean isAnyDataEmpty(){
		return (screen1.getText().isEmpty() || 
			password.getText().isEmpty());
}}