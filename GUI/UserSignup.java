package GUI;
import FileIo.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class UserSignup extends JFrame implements ActionListener
{
    Color color = new Color(195,195,195);
    JLabel a,b,c,d,e,f,g;
    JPanel panel,panel2,panel3;
    JButton btnLogin,btnSignUp;
    JTextField screen1;
    JPasswordField screen2 , screen3;
    JCheckBox showpassBox;
    Font font = new Font("cambria", Font.PLAIN, 20);

    ImageIcon icon1 = new ImageIcon ("Image/400.png");
    ImageIcon icon = new ImageIcon ("Image/ttt.jpg");


    public UserSignup ()
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

        ////////////////////////////////////////////////////////////////////

        a = new JLabel("Sign Up");
        a.setBounds(210,30,200,45);
        a.setForeground(new Color(255,255,255));
        a.setFont(new Font("cambria" , Font.BOLD ,30));
        panel2.add(a);

        b = new JLabel("User Name: ");
        b.setBounds(125,70,200,45);
        b.setForeground(new Color(255,255,255));
        b.setFont(new Font("cambria" , Font.BOLD ,20));
        panel2.add(b);

        d = new JLabel("Password: ");
        d.setBounds(125,150,200,45);
        d.setForeground(new Color(255,255,255));
        d.setFont(new Font("cambria" , Font.BOLD ,20));
        panel2.add(d);

        c = new JLabel("Confirm Password: ");
        c.setBounds(125,230,200,45);
        c.setForeground(new Color(255,255,255));
        c.setFont(new Font("cambria" , Font.BOLD ,20));
        panel2.add(c);

        e = new JLabel("---------------------------------------");
        e.setBounds(125,135,250,45);
        e.setForeground(new Color(255,255,255));
        e.setFont(new Font("cambria" , Font.BOLD ,20));
        panel2.add(e);

        f = new JLabel("---------------------------------------");
        f.setBounds(125,215,250,45);
        f.setForeground(new Color(255,255,255));
        f.setFont(new Font("cambria" , Font.BOLD ,20));
        panel2.add(f);

        g = new JLabel("---------------------------------------");
        g.setBounds(125,295,250,45);
        g.setForeground(new Color(255,255,255));
        g.setFont(new Font("cambria" , Font.BOLD ,20));
        panel2.add(g);

        ////////////////////////////////////////////////////////////////////////////////////////

        screen1 = new JTextField();
        screen1.setBounds(125,110,250,45);
        screen1.setFont(font);
        screen1.setBackground(new Color(255,255,255,250));
        screen1.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(screen1);

        screen2 = new JPasswordField();
        screen2.setBounds(125,190,250,45);
        screen2.setFont(font);
        screen2.setBackground(new Color(255,255,255,250));
        screen2.addActionListener(this);
        screen2.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(screen2);

        screen3 = new JPasswordField();
        screen3.setBounds(125,270,250,45);
        screen3.setFont(font);
        screen3.setBackground(new Color(255,255,255,250));
        screen3.addActionListener(this);
        screen3.setBorder(BorderFactory.createEmptyBorder());
        panel2.add(screen3);

        ///////////////////////////////////////////////////////////////////////////////

        btnSignUp = new JButton("Sign up");
        btnSignUp.setBounds(125,360,250,40);
        btnSignUp.setFont(font);
        btnSignUp.setFocusPainted(false);
        btnSignUp.setBackground(new Color(233,235,71));
        btnSignUp.addActionListener(this);
        panel2.add(btnSignUp);

        ///////////////////////////////////////////////////////////////////////////////

        showpassBox = new JCheckBox("Show Password");
        showpassBox.setBounds(125,320,200,34);
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
                screen3.setEchoChar((char)0);
            }
            else {
                screen2.setEchoChar('●');
                screen3.setEchoChar('●');
            }
        }
        if(e.getSource() == btnSignUp)
        {
            String textField1 = screen1.getText().toLowerCase();
            String textField2 = screen2.getText();
            String textField3 = screen3.getText();

            if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() )
            {
                JOptionPane.showMessageDialog(this, "Please fill all of the fields.", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
            }
            if(textField2.equals(textField3))
            {
                Registration r=new Registration(textField1,textField2);

                JOptionPane.showMessageDialog(this, "Registration Succesful", "Log In",
                        JOptionPane.INFORMATION_MESSAGE);

                UserLogin i = new UserLogin();
                this.setVisible(false);

            }
            else{
                JOptionPane.showMessageDialog(this, "Password missmatch", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
}