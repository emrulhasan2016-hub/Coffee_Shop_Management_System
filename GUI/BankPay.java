package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class BankPay extends JFrame  implements ActionListener
{
	Font font = new Font ("Speak pro Light" , Font.PLAIN , 25);
	JPanel panel;
	JTextField c1,c2,c3,c4;
	JLabel pay,l1,l2;
	JButton b1,b2,back;
	
	
	ImageIcon icon = new ImageIcon ("Image/hhh.jpg");
	ImageIcon icon1 = new ImageIcon ("Image/bank.png");
	
	
	public BankPay ()
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
		
		l1 = new JLabel(new ImageIcon("Image/vissa.png"));
		l1.setBounds(890,240,70,50);
		panel.add(l1);

		l2 = new JLabel(new ImageIcon("Image/master.png"));
		l2.setBounds(940,238,70,50);
		panel.add(l2);
		
		c1 = new JTextField();
		c1.setBounds(750, 280, 280, 40);
		panel.add(c1);
		c1.setFont(font);
		
		c2 = new JTextField();
		c2.setBounds(750, 330, 130, 40);
		panel.add(c2);
		c2.setFont(font);
		
		c3 = new JTextField();
		c3.setBounds(900, 330, 130, 40);
		panel.add(c3);
		c3.setFont(font);
		
		c4 = new JTextField();
		c4.setBounds(750, 380, 280, 40);
		//c4.setHint("CVC/CVV");
		panel.add(c4);
		c4.setFont(font);
		
		b1 = new JButton();
		b1.setText("Confirm");
		b1.setBounds(750,520,130,52);
		b1.setBorder(null);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		b1.addActionListener(this);
		panel.add(b1);
   
		b2 = new JButton();
		b2.setText("Close");
		b2.setBounds(900,520,130,52);
		b2.setBorder(null);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		b2.addActionListener(this);
		panel.add(b2);
		
		back = new JButton("Back..");
		back.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(30,560,170,50);
		back.addActionListener(this);
		panel.add(back);

		this.setVisible(true);
    }

	
     public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == back)
        {
            new MenuCard();
            this.setVisible(false);
        }
    
            if (e.getSource() == b1) {
                if (c1.getText().equals("") || c2.getText().equals("") || c3.getText().equals("") || c4.getText().equals("") )
					{
						 JOptionPane.showMessageDialog(this, "Fill all the information", "Information",
				JOptionPane.INFORMATION_MESSAGE);
                }

                else {
                     JOptionPane.showMessageDialog(null, "Payment Complete", "Thank You",-1);
                    this.setVisible(false);

                }
            }
		 if (e.getSource() == b2) 
        {
            this.setVisible(false);
        }
        }
    

}