package GUI;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GuestMenu extends JFrame implements ActionListener
{
    Font font = new Font ("Speak pro Light" , Font.BOLD , 80);
    JPanel panel;
    JLabel title,title1,title2,title3,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
    JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,cc1,cc2,cc3,cc4,cc5;
    JButton next;
    JSpinner spiner[] = new JSpinner[13];
    SpinnerNumberModel spinModel;


    ImageIcon icon = new ImageIcon ("Image/4000.png");
    ImageIcon icon1 = new ImageIcon ("Image/qq.jpg");

    public GuestMenu ()
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

        title = new JLabel ("MENU CARD");
        title.setBounds(370,0,1200,120);
        title.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,80));
        title.setForeground(Color.WHITE);
        panel.add(title);

        title1 = new JLabel ("Coffee: ");
        title1.setBounds(40,50,1200,150);
        title1.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,50));
        title1.setForeground(Color.WHITE);
        panel.add(title1);

        title2 = new JLabel ("Snacks:");
        title2.setBounds(40,350,1200,150);
        title2.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,50));
        title2.setForeground(Color.WHITE);
        panel.add(title2);

        title3 = new JLabel ("Price:");
        title3.setBounds(500,50,1200,150);
        title3.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,50));
        title3.setForeground(Color.WHITE);
        panel.add(title3);

        //////////////////////////////////////////////////////////////////////////

        c1 = new JCheckBox("Espresso");
        c1.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c1.setOpaque(false);
        c1.setBounds(60, 150,500,40);
        c1.setBackground(Color.BLACK);
        c1.setForeground(Color.WHITE);
        c1.setBorder(BorderFactory.createEmptyBorder());
        //c1.setSelected (k1.isVisible());
        //c1.addItemListener(e -> {
        //c1.setVisible(e.getStateChange() == ItemEvent.SELECTED);
        //});

        c1.addActionListener(this);
        panel.add(c1);

        c2 = new JCheckBox("Cappucchino");
        c2.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c2.setOpaque(false);
        c2.setBounds(60,180,500,40);
        c2.setBackground(Color.BLACK);
        c2.setForeground(Color.WHITE);
        c2.addActionListener(this);
        c2.setBorder(BorderFactory.createEmptyBorder());
        panel.add(c2);

        c3 = new JCheckBox("Americano");
        c3.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c3.setOpaque(false);
        c3.setBounds(60, 210,500,40);
        c3.setBackground(Color.BLACK);
        c3.setForeground(Color.WHITE);
        c3.addActionListener(this);
        c3.setBorder(BorderFactory.createEmptyBorder());
        panel.add(c3);

        c4 = new JCheckBox("Caffe Latte");
        c4.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c4.setOpaque(false);
        c4.setBounds(60, 240,500,40);
        c4.setBackground(Color.BLACK);
        c4.setForeground(Color.WHITE);
        c4.addActionListener(this);
        c4.setBorder(BorderFactory.createEmptyBorder());
        panel.add(c4);

        c5 = new JCheckBox("Caffe Mocha");
        c5.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c5.setOpaque(false);
        c5.setBounds(60, 270,500,40);
        c5.setBackground(Color.BLACK);
        c5.setForeground(Color.WHITE);
        c5.addActionListener(this);
        c5.setBorder(BorderFactory.createEmptyBorder());
        panel.add(c5);

        c6 = new JCheckBox("Caffe Breve");
        c6.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c6.setOpaque(false);
        c6.setBounds(60, 300,500,40);
        c6.setBackground(Color.BLACK);
        c6.setForeground(Color.WHITE);
        c6.addActionListener(this);
        c6.setBorder(BorderFactory.createEmptyBorder());
        panel.add(c6);

        c7 = new JCheckBox("Magic Coffee");
        c7.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c7.setOpaque(false);
        c7.setBounds(60, 330,500,40);
        c7.setBackground(Color.BLACK);
        c7.setForeground(Color.WHITE);
        c7.addActionListener(this);
        c7.setBorder(BorderFactory.createEmptyBorder());
        panel.add(c7);

        c8 = new JCheckBox("Java Latte");
        c8.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        c8.setOpaque(false);
        c8.setBounds(60, 360,500,40);
        c8.setBackground(Color.BLACK);
        c8.setForeground(Color.WHITE);
        c8.addActionListener(this);
        c8.setBorder(BorderFactory.createEmptyBorder());
        panel.add(c8);

        ///////////////////////////////////////////////////////////////////////////

        cc1 = new JCheckBox("Brownie");
        cc1.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        cc1.setOpaque(false);
        cc1.setBounds(60, 450,500,40);
        cc1.setBackground(Color.BLACK);
        cc1.setForeground(Color.WHITE);
        cc1.addActionListener(this);
        cc1.setBorder(BorderFactory.createEmptyBorder());
        panel.add(cc1);

        cc2 = new JCheckBox("Donuts");
        cc2.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        cc2.setOpaque(false);
        cc2.setBounds(60, 480,500,40);
        cc2.setBackground(Color.BLACK);
        cc2.setForeground(Color.WHITE);
        cc2.addActionListener(this);
        cc2.setBorder(BorderFactory.createEmptyBorder());
        panel.add(cc2);

        cc3 = new JCheckBox("Choco Cookies");
        cc3.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        cc3.setOpaque(false);
        cc3.setBounds(60, 510,500,40);
        cc3.setBackground(Color.BLACK);
        cc3.setForeground(Color.WHITE);
        cc3.addActionListener(this);
        cc3.setBorder(BorderFactory.createEmptyBorder());
        panel.add(cc3);

        cc4 = new JCheckBox("Fries");
        cc4.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        cc4.setOpaque(false);
        cc4.setBounds(60, 540,500,40);
        cc4.setBackground(Color.BLACK);
        cc4.setForeground(Color.WHITE);
        cc4.addActionListener(this);
        cc4.setBorder(BorderFactory.createEmptyBorder());
        panel.add(cc4);

        cc5 = new JCheckBox("Chicken Sandwich");
        cc5.setFont(new Font("Bradley Hand ITC" , Font.PLAIN , 25));
        cc5.setOpaque(false);
        cc5.setBounds(60, 570,500,40);
        cc5.setBackground(Color.BLACK);
        cc5.setForeground(Color.WHITE);
        cc5.addActionListener(this);
        cc5.setBorder(BorderFactory.createEmptyBorder());
        panel.add(cc5);

        ////////////////////////////////////////////////////////////////////////////

        t1 = new JLabel (".............................................");
        t1.setBounds(165,147,1200,40);
        t1.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t1.setForeground(Color.WHITE);
        panel.add(t1);

        t2 = new JLabel ("........................................");
        t2.setBounds(206,177,1200,40);
        t2.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t2.setForeground(Color.WHITE);
        panel.add(t2);

        t3 = new JLabel (".........................................");
        t3.setBounds(195,207,1200,40);
        t3.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t3.setForeground(Color.WHITE);
        panel.add(t3);

        t4 = new JLabel (".........................................");
        t4.setBounds(195,237,1200,40);
        t4.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t4.setForeground(Color.WHITE);
        panel.add(t4);

        t5 = new JLabel (".......................................");
        t5.setBounds(205,267,1200,40);
        t5.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t5.setForeground(Color.WHITE);
        panel.add(t5);

        t6 = new JLabel ("........................................");
        t6.setBounds(200,297,1200,40);
        t6.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t6.setForeground(Color.WHITE);
        panel.add(t6);

        t7 = new JLabel ("......................................");
        t7.setBounds(215,327,1200,40);
        t7.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t7.setForeground(Color.WHITE);
        panel.add(t7);

        t8 = new JLabel ("...........................................");
        t8.setBounds(185,357,1200,40);
        t8.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t8.setForeground(Color.WHITE);
        panel.add(t8);

        /////////////////////////////////////////////////////////////////////////////////

        t9 = new JLabel (".............................................");
        t9.setBounds(160,447,1200,40);
        t9.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t9.setForeground(Color.WHITE);
        panel.add(t9);

        t10 = new JLabel ("..............................................");
        t10.setBounds(155,477,1200,40);
        t10.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t10.setForeground(Color.WHITE);
        panel.add(t10);

        t11 = new JLabel ("......................................");
        t11.setBounds(220,507,1200,40);
        t11.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t11.setForeground(Color.WHITE);
        panel.add(t11);

        t12 = new JLabel ("...................................................");
        t12.setBounds(125,537,1200,40);
        t12.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t12.setForeground(Color.WHITE);
        panel.add(t12);

        t13 = new JLabel ("...............................");
        t13.setBounds(270,567,1200,40);
        t13.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        t13.setForeground(Color.WHITE);
        panel.add(t13);

        //////////////////////////////////////////////////////////////////////////////////////


        this.addLabel (p1,"100",500,150,1200,40);
        this.addLabel (p2,"100",500,180,1200,40);
        this.addLabel (p3,"100",500,210,1200,40);
        this.addLabel (p4,"100",500,240,1200,40);
        this.addLabel (p5,"100",500,270,1200,40);
        this.addLabel (p6,"100",500,300,1200,40);
        this.addLabel (p7,"100",500,330,1200,40);
        this.addLabel (p8,"100",500,360,1200,40);

        this.addLabel (p9,"100",500,450,1200,40);
        this.addLabel (p10,"100",500,480,1200,40);
        this.addLabel (p11,"100",500,510,1200,40);
        this.addLabel (p12,"100",500,540,1200,40);
        this.addLabel (p13,"100",500,570,1200,40);

        ////////////////////////////////////////////////////////////////////////////////////////////
        int spinerY = 160;
        for(int i=0;i<13;i++){
            this.addJSpinner(i,550,spinerY,70,20);
            spinerY+=30;
            if(i==7) spinerY+=60;
        }

        next = new JButton("NEXT..");
        next.setFont(new Font("Speak pro Light" , Font.PLAIN , 25));
        next.setBounds(1030,590,130,30);
        next.setFocusPainted(false);
        next.addActionListener(this);
        panel.add(next);

        this.setVisible(true);
    }


    public void addLabel(JLabel p ,String price,int a,int b,int c,int d)
    {
        p =  new JLabel(price);
        p.setFont(new Font("Bradley Hand ITC" , Font.BOLD ,25));
        p.setForeground(Color.WHITE);
        p.setBounds(a,b,c,d);
        panel.add(p);
    }

    public void addJSpinner(int spinerNumber,int a,int b,int c,int d)
    {
        spinModel = new SpinnerNumberModel(0,0,10,1);
        spiner[spinerNumber] = new JSpinner(spinModel);
        spiner[spinerNumber].setBounds(a,b,c,d);
        panel.add(spiner[spinerNumber]);
    }

    public void actionPerformed(ActionEvent ae)
    {

        if(next == ae.getSource())
        {
            UserSignup as = new UserSignup ();
            this.setVisible(false);
            as.setVisible(true);

            //System.exit(0);
        }
        else {
            System.out.println("==========");
        }

        if (ae.getSource() == c1)
        {
            if (c1.isSelected() == true)
            {
                spiner[0].getValue();
                Integer value1 = (Integer) spiner[0].getValue();
                System.out.println(value1);
            }
        }
        else if (ae.getSource() == c2)
        {
            if (c2.isSelected() == true)
            {
                Integer value2 = (Integer) spiner[1].getValue();
                System.out.println(value2);
            }
        }
        else if (ae.getSource() == c3)
        {
            if (c3.isSelected() == true)
            {
                Integer value3 = (Integer) spiner[2].getValue();
                System.out.println(value3);
            }
        }
        else if (ae.getSource() == c4)
        {
            if (c4.isSelected() == true)
            {
                Integer value4 = (Integer) spiner[3].getValue();
                System.out.println(value4);
            }
        }
        else if (ae.getSource() == c5)
        {
            if (c5.isSelected() == true)
            {
                Integer value5 = (Integer) spiner[4].getValue();
                System.out.println(value5);
            }
        }
        else if (ae.getSource() == c6)
        {
            if (c6.isSelected() == true)
            {
                Integer value6 = (Integer) spiner[5].getValue();
                System.out.println(value6);
            }
        }
        else if (ae.getSource() == c7)
        {
            if (c7.isSelected() == true)
            {
                Integer value7 = (Integer) spiner[6].getValue();
                System.out.println(value7);
            }
        }
        else if (ae.getSource() == c8)
        {
            if (c8.isSelected() == true)
            {
                Integer value8 = (Integer) spiner[7].getValue();
                System.out.println(value8);
            }
        }
        else if (ae.getSource() == cc1)
        {
            if (cc1.isSelected() == true)
            {
                Integer value9 = (Integer) spiner[8].getValue();
                System.out.println(value9);
            }
        }
        else if (ae.getSource() == cc2)
        {
            if (cc2.isSelected() == true)
            {
                Integer value10 = (Integer) spiner[9].getValue();
                System.out.println(value10);
            }
        }
        else if (ae.getSource() == cc3)
        {
            if (cc3.isSelected() == true)
            {
                Integer value11 = (Integer) spiner[10].getValue();
                System.out.println(value11);
            }
        }
        else if (ae.getSource() == cc4)
        {
            if (cc4.isSelected() == true)
            {
                Integer value12 = (Integer) spiner[11].getValue();
                System.out.println(value12);
            }
        }
        else if (ae.getSource() == cc5)
        {
            if (cc5.isSelected() == true)
            {
                Integer value13 = (Integer) spiner[12].getValue();
                System.out.println(value13);
            }
        }











































			/*if (c1.isSelected())
			{
				c1 = c1.getText();



			}else if (c3.isSelected())
			{
				c3 = c3.getText();
			}else if (c4.isSelected())
			{
				c4 = c4.getText();
			}else if (c5.isSelected())
			{
				c5 = c5.getText();
			}else if (c6.isSelected())
			{
				c6 = c6.getText();
			}else if (c7.isSelected())
			{
				c7 = c7.getText();
			}else if (c8.isSelected())
			{
				c8 = c8.getText();
			}else if (cc1.isSelected())
			{
				cc1 = cc1.getText();
			}else if (cc2.isSelected())
			{
				cc2 = cc2.getText();
			}else if (cc3.isSelected())
			{
				cc3 = cc3.getText();
			}else if (cc4.isSelected())
			{
				cc4 = cc4.getText();
			}else if (cc5.isSelected())
			{
				cc5 = cc5.getText();
			}
			*/






    }
}


//boolean s = c1.isSelected();
//k1.setEnabled(s);

				/*if (ae.getSource() == c1)
				{
					//boolean s = ae.getSource().isSelected();
					k1.setEnabled(s);
				}*/

//String[] values = req.getParameterValues("checkbox");

//if(JComboBox.getItemCount() != 0){ }
