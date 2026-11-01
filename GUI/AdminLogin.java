package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class AdminLogin extends JFrame implements ActionListener
{
	Color color = new Color(195,195,195);
	JLabel a,b,c,d,e,f;
	JPanel panel,panel2,panel3;
	JButton btnLogin,btnSignUp;
	JTextField screen1;
	JPasswordField screen2;
	JCheckBox showpassBox;
	Font font = new Font("cambria", Font.PLAIN, 20);
	
	ImageIcon icon1 = new ImageIcon ("Image/400.png");
	ImageIcon icon = new ImageIcon ("Image/ttt.jpg");
	
	
	public AdminLogin ()
	{
		super("My Coffee Shop");
		this.setSize(1200,675);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setIconImage(icon1.getImage());
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,1200,675);
		panel.setOpaque(false);
		this.add(panel);
		this.setLayout(null);
		
		JLabel background = new JLabel(icon);
		background.setBounds(0,0,1200,675);
		this.add(background);
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(360,95,500,450);
		panel2.setBackground(new Color(0,0,0,130));
		panel.add(panel2);
		panel2.setLayout(null);
		
		b = new JLabel("Login");
		b.setBounds(210,40,200,45);
		b.setForeground(new Color(255,255,255));
		b.setFont(new Font("cambria" , Font.BOLD ,30));
		panel2.add(b);
		
		c = new JLabel("User Name: ");
		c.setBounds(125,90,200,45);
		c.setForeground(new Color(255,255,255));
		c.setFont(new Font("cambria" , Font.BOLD ,20));
		panel2.add(c);
		
		d = new JLabel("Password: ");
		d.setBounds(125,190,200,45);
		d.setForeground(new Color(255,255,255));
		d.setFont(new Font("cambria" , Font.BOLD ,20));
		panel2.add(d);
		
		e = new JLabel("---------------------------------------");
		e.setBounds(125,155,250,45);
		e.setForeground(new Color(255,255,255));
		e.setFont(new Font("cambria" , Font.BOLD ,20));
		panel2.add(e);
		
		f = new JLabel("---------------------------------------");
		f.setBounds(125,255,250,45);
		f.setForeground(new Color(255,255,255));
		f.setFont(new Font("cambria" , Font.BOLD ,20));
		panel2.add(f);
		
		//////////////////////////////////////////////////////////////////////////////
		
		screen1 = new JTextField(); 
		screen1.setBounds(125,130,250,45);
		screen1.setFont(font);
		screen1.setBackground(new Color(255,255,255,250));
		screen1.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(screen1);
		
		screen2 = new JPasswordField();
		screen2.setBounds(125,230,250,45);
		screen2.setFont(font);
		screen2.setBackground(new Color(255,255,255,250));
		screen2.addActionListener(this);
		screen2.setBorder(BorderFactory.createEmptyBorder());
		panel2.add(screen2);
		
		/////////////////////////////////////////////////////////////////////////////////////
	
	  btnLogin = new JButton("Login");
		btnLogin.setBounds(200,320,120,40);
		btnLogin.setFont(font);
		btnLogin.setFocusPainted(false);
		btnLogin.setBackground(new Color(233,235,71));
		btnLogin.addActionListener(this);
		panel2.add(btnLogin);
		
//		btnSignUp = new JButton("Sign up");
//		btnSignUp.setBounds(255,320,120,40);
//		btnSignUp.setFont(font);
//		btnSignUp.setFocusPainted(false);
//		btnSignUp.setBackground(new Color(233,235,71));
//		btnSignUp.addActionListener(this);
//		panel2.add(btnSignUp);
		
		////////////////////////////////////////////////////////////////////////////////////////
		
		showpassBox = new JCheckBox("Show Password");
		showpassBox.setBounds(125,282,200,34);
		showpassBox.setForeground(new Color(255,255,255));
		showpassBox.setFont(font);
		showpassBox.setFocusPainted(false);
		showpassBox.setOpaque(false);
		showpassBox.addActionListener(this);
		panel2.add(showpassBox);
				
		this.setVisible(true);
	}
	
		public void actionPerformed(ActionEvent e) {
		if(e.getSource()==showpassBox) {
			if(showpassBox.isSelected()) {
				screen2.setEchoChar((char)0);
			}
			else {
				screen2.setEchoChar('●');;
			}
		}
//		if(e.getSource() == btnSignUp) {
//			AdminSignUp s = new AdminSignUp();
//			this.setVisible(false);
//		}

			if (e.getSource() == btnLogin) {
				String textField1 = screen1.getText().toLowerCase(); // User Name
				String textField2 = screen2.getText(); // Password

				if ("admin".equalsIgnoreCase(textField1) && "admin".equals(textField2)) {
					JOptionPane.showMessageDialog(null, "Login Successful.", "", JOptionPane.WARNING_MESSAGE);
					Admin1st ad=new Admin1st();
					this.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
							JOptionPane.WARNING_MESSAGE);
				}
			}
}
}