package GUI;
import Employeee.*;
import FileIo.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;

public class ChefInfo extends JFrame implements MouseListener, ActionListener 
{
	Manager m = new Manager(15);
	String[] rows = new String[6];

	
	Color color = new Color(195,195,195);
	Font font = new Font("cambria", Font.PLAIN, 26);
	JPanel panel;
	JLabel title;
	DefaultTableModel model;
	JTable table;
	
	ImageIcon icon = new ImageIcon ("Image/4000.png");
	JTextField  name, nid, address,contactNumber;
	JButton addData, clrData, removeData, finish, back;
	
	String file = ".\\data\\chef_data.txt";
    String temp = ".\\data\\temp.txt";
		
	public ChefInfo ()
	{
		super("Information");
		this.setSize(1200,675);
		this.m = m;
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setIconImage(icon.getImage());
		
	    panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(0,0,1200,675);
		panel.setBackground(color);
		this.add(panel);
		
		initializeForm();
		createTable();
		
		
        // To input data in the table
        try 
		{
				BufferedReader reader = new BufferedReader(new FileReader(file));
				int totalLines = 0;
				while (reader.readLine() != null){
					totalLines++;
				}
				reader.close();

            for (int i = 0; i < totalLines; i++)
				{
					String line = Files.readAllLines(Paths.get(file)).get(i);
					String x = line.substring(0, 4);
					if (x.equals("Name")) 
					{
						rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(8); 
						rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(8); 
						rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(12); 
						rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(18); 
                  
						model.addRow(rows);
					}
				}

        } 
		catch (Exception ex) {return;}

	    this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae){

		if(back == ae.getSource()){
			    Admin1st first = new Admin1st ();
			
				this.setVisible(false);
				first.setVisible(true);
		}
	
		if (ae.getSource() == addData)
		{
			String textField1 = name.getText().toLowerCase();
            String textField2 = nid.getText();
            String textField3 = address.getText(); 
            String textField4 = contactNumber.getText();

			if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty())
			{
					JOptionPane.showMessageDialog(this, "Please fill all of the fields.", "Warning!",
                         JOptionPane.WARNING_MESSAGE);
			}
			else
			{
					Chefinfo c = new Chefinfo(textField1,textField2,textField3,textField4);
					model.addRow(new Object[] { textField1,textField2,textField3,textField4 });
					JOptionPane.showMessageDialog(this, "Employee Succesfully Inserted", "Infoemation",
					JOptionPane.INFORMATION_MESSAGE);
			}	
		
		}

		else if (ae.getSource() == clrData) {
			int selectedRow = table.getSelectedRow();
			if (selectedRow != -1) {
				String nameToUpdate = (String) table.getModel().getValueAt(selectedRow, 0);
				String nidToUpdate = (String) table.getModel().getValueAt(selectedRow, 1);
				String addressToUpdate = (String) table.getModel().getValueAt(selectedRow, 2);
				String contactNumberToUpdate = (String) table.getModel().getValueAt(selectedRow, 3);

				// Update the data directly in the file
				try {
					File oldFile = new File(file);
					File newFile = new File(temp);

					BufferedReader reader = new BufferedReader(new FileReader(file));
					BufferedWriter writer = new BufferedWriter(new FileWriter(temp, true));

					String line;
					while ((line = reader.readLine()) != null) {
						if (line.contains(nameToUpdate) && line.contains(nidToUpdate)) {
							writer.write("Updated Data");
							writer.newLine();
							writer.write(addressToUpdate);
							writer.newLine();
							writer.write(contactNumberToUpdate);
							writer.newLine();
							writer.write("Updated Data");
							writer.newLine();
							writer.write("Updated Data");
							writer.newLine();
						} else {
							writer.write(line);
							writer.newLine();
						}
					}

					reader.close();
					writer.close();

					oldFile.delete();
					newFile.renameTo(oldFile);

					// Update the table model
					table.getModel().setValueAt(nameToUpdate, selectedRow, 0);
					table.getModel().setValueAt(nidToUpdate, selectedRow, 1);
					table.getModel().setValueAt(addressToUpdate, selectedRow, 2);
					table.getModel().setValueAt(contactNumberToUpdate, selectedRow, 3);

					JOptionPane.showMessageDialog(this, "Employee Successfully Updated", "Information",
							JOptionPane.INFORMATION_MESSAGE);
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(this, "Please Select a Row to Update.", "Warning",
						JOptionPane.WARNING_MESSAGE);
			}
		}


		else if (ae.getSource() == removeData)  {
			
			int selectedRows[] = table.getSelectedRows(); 
			String Name = (table.getModel().getValueAt(table.getSelectedRow(), 0).toString());
			if(selectedRows.length >=1)
			{
				Arrays.sort(selectedRows);
				
				for (int i = selectedRows.length - 1; i >= 0; i--)
				{
					model.removeRow(selectedRows[i]);
					if (i == 0) 
					{
						JOptionPane.showMessageDialog(this, "Successfully Deleted.");
					}
				}
			}	
			else
			{
				JOptionPane.showMessageDialog(this, "Please Select Rows to Delete. ", "Warining",
						JOptionPane.WARNING_MESSAGE);
			}
				
			File oldFile = new File(file);
            File newFile = new File(temp);

            int q = 0;

            try 
			{
                BufferedReader reader = new BufferedReader(new FileReader(file));
                int totalLines = 0;
                while (reader.readLine() != null)
				{
					totalLines++;
				}
                reader.close();

                for (int i = 0; i < totalLines; i++)
				{
                    String line = Files.readAllLines(Paths.get(file)).get(i);
                    String x = line.substring(0, 4);
                    if (x.equals("Name"))
					{
                        String userName = Files.readAllLines(Paths.get(file)).get(i);
                        if (userName.substring(8).equals(Name))
						{
                            q = i;
                        }
                    }
                }
            }
			catch (Exception ex){return;}
			   
            try{
				FileWriter fw = new FileWriter(temp, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                BufferedReader reader = new BufferedReader(new FileReader(file));
                int totalLines = 0;
                while (reader.readLine() != null){
                    totalLines++;
				}
                reader.close();

                for (int j = 0; j < totalLines; j++)
				{
                    String line = Files.readAllLines(Paths.get(file)).get(j);
                    String x = line.substring(0, 4);

                    if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5)))
					{
                        String userName = Files.readAllLines(Paths.get(file)).get(j);
                        pw.println("Removed By Manager");
						break;
                    }else{
                        String userName = Files.readAllLines(Paths.get(file)).get(j);
                        pw.println(userName);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                bw.close();
                fw.close();
            } 
			catch (Exception ex) {}

            oldFile.delete();
            File dump = new File(file);
            newFile.renameTo(dump);
			
		} 
		
		else if (finish == ae.getSource())
		{
			this.setVisible(false);
			
			new ChefInfo();
		}
		
	}
	public boolean isAllDataEmpty(){
		return (name.getText().isEmpty() && 
			nid.getText().isEmpty() &&
			address.getText().isEmpty() &&
			contactNumber.getText().isEmpty() );
	}
	public boolean isAnyDataEmpty(){
		return (name.getText().isEmpty() || 
			nid.getText().isEmpty() ||
			address.getText().isEmpty() ||
			contactNumber.getText().isEmpty() );
	}

	public void clearAll() {
		name.setText("");
		nid.setText("");
		address.setText("");
		contactNumber.setText("");
		
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == addData)
		{
			addData.setBackground(Color.BLUE);
			addData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == removeData)
		{
			removeData.setBackground(Color.BLUE);
			removeData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == clrData)
		{
			clrData.setBackground(Color.BLUE);
			clrData.setForeground(Color.WHITE);
		}else if(me.getSource() == finish)
		{
			finish.setBackground(Color.BLUE);
			finish.setForeground(Color.WHITE);
		}
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == addData)
		{
			addData.setBackground(new Color(0, 4, 122));
			addData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == removeData)
		{
			removeData.setBackground(new Color(200, 0, 0));
			removeData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == clrData)
		{
			clrData.setBackground(new Color(150, 0, 200));
			clrData.setForeground(Color.WHITE);
		}
		else if(me.getSource() == finish)
		{
			finish.setBackground(new Color(200, 0, 100));
			finish.setForeground(Color.WHITE);
		}
		else{}
	}
	
	
	 public void initializeForm() {

		title = new JLabel("Chef's Information");
		title.setBounds(450, 30, 380, 25);
		title.setFont(new Font("cambria", Font.BOLD, 35));
		panel.add(title);
		
		JSeparator j = new JSeparator();
		j.setBounds(405, 70, 380, 25);
		panel.add(j);
		
		///////////////////////////////////////////////////////////////////////

		JLabel name1 = new JLabel("Chef's Name: ");
		name1.setFont(font);
		name1.setBounds(125, 100, 180, 25);
		panel.add(name1);
		
		name = new JTextField();
		name.setFont(font);
		name.setBounds(300, 100, 180, 25);
		panel.add(name);
		
		///////////////////////////////////////////////////////////////////////

		JLabel nid1 = new JLabel("Chef's NID: ");
		nid1.setFont(font);
		nid1.setBounds(142, 150, 150, 25);
		panel.add(nid1);
		
		nid = new JTextField();
		nid.setFont(font);
		nid.setBounds(300, 150, 180, 25);
		panel.add(nid);

		///////////////////////////////////////////////////////////////////////////////////
		
		JLabel address1 = new JLabel("Address: ");
		address1.setFont(font);
		address1.setBounds(170, 200, 150, 25);
		panel.add(address1);
		
		address = new JTextField();
		address.setFont(font);
		address.setBounds(300, 200, 180, 25);
		panel.add(address);

		////////////////////////////////////////////////////////////////////////////
		
		JLabel contactNumber1 = new JLabel("Contact Number:");
		contactNumber1.setFont(font);
		contactNumber1.setBounds(80, 250, 200, 25);
		panel.add(contactNumber1);
		
		contactNumber = new JTextField();
		contactNumber.setFont(font);
		contactNumber.setBounds(300, 250, 180, 25);
		panel.add(contactNumber);
		
		/////////////////////////////////////////////////////////////////////////

		addData = new JButton("Add Chef");
		addData.setFont(new Font("cambria", Font.BOLD, 15));
		addData.setBounds(180,350,140,60);
		addData.setFocusPainted(false);
		addData.addMouseListener(this);
		addData.setBackground(new Color(50, 130, 246));
		addData.setForeground(new Color(255, 255, 255));
		addData.addActionListener(this);
		panel.add(addData);
		
		//////////////////////////////////////////////////////////////////////////

        removeData = new JButton("Delete");
		removeData.setFont(new Font("cambria", Font.BOLD, 15));
		removeData.setBounds(400, 350, 140, 60);
		removeData.setFocusPainted(false);
		removeData.addMouseListener(this);
		removeData.setBackground(new Color(200, 0, 0));
		removeData.setForeground(new Color(255, 255, 255));
		removeData.addActionListener(this);
		panel.add(removeData);
		
		//////////////////////////////////////////////////////////////////////////
		
		clrData = new JButton("Update");
		clrData.setFont(new Font("cambria", Font.BOLD, 15));
		clrData.setBounds(180, 450, 140, 60);
		clrData.setFocusPainted(false);
		clrData.addMouseListener(this);
		clrData.setBackground(new Color(150, 0, 200));
		clrData.setForeground(new Color(255, 255, 255));
		clrData.addActionListener(this);
		panel.add(clrData);
		
        //////////////////////////////////////////////////////////////////////////

		finish = new JButton("Finish");
		finish.setFont(new Font("cambria", Font.BOLD, 15));
		finish.setBounds(400, 450, 140, 60);
		finish.setFocusPainted(false);
		finish.addMouseListener(this);
		finish.setBackground(new Color(200, 0, 100));
		finish.setForeground(new Color(255, 255, 255));
		finish.addActionListener(this);
		panel.add(finish);
		
		//////////////////////////////////////////////////////////////////////////////
		
		back = new JButton("Back..");
		back.setFont(new Font("Speak pro Light" , Font.PLAIN , 15));
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(30,580,130,40);
		back.setFocusPainted(false);
		back.addActionListener(this);
		panel.add(back);

	}

	public void createTable() {
		
		model = new DefaultTableModel();
		table = new JTable(model);
		
		table.setFont(new Font("Times New Roman", Font.BOLD, 16));
		table.setBackground(new Color(255, 234, 10));
		//table.setShowGrid(true);
		table.setSelectionBackground(new Color(255, 153, 51));
		table.setBounds(650, 100, 500, 400);
		
		model.addColumn("Name");
		model.addColumn("NID");
		model.addColumn("Address");
		model.addColumn("Contact Number");

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(650, 100, 500, 400);
		panel.add(scrollPane);
	}
}

/*if (ae.getSource() == removeData)  
		{
			int selectedRows[] = table.getSelectedRows();
			
			if(selectedRows.length >=1){
				Arrays.sort(selectedRows);
				
				for (int i = selectedRows.length - 1; i >= 0; i--) {
					
					if (selectedRows[i] = c)
					{
						//String Name = (table.getModel().getValueAt(selectedRows[i], 0).toString());
						c.removeData(selectedRows[i]);

					}
					if (i == 0) {
					JOptionPane.showMessageDialog(this, "Successfully Deleted.");
					}
				}
							
				//Chefinfo c = new Chefinfo(textField1,textField2,textField3,textfield4);
				//JOptionPane.showMessageDialog(this, "Employee Succesfully Inserted", "Infoemation",
                  //  JOptionPane.INFORMATION_MESSAGE);
		}
		}
		
	   /* try   
		{
			BufferedReader bfr = new BufferedReader(".\\data\\chef_data.txt");
			String line = "";
			
			int totalLine = 0;
			while (bfr.readLine() != null){
				totalLine++;
			}
			reader.close();
			
			
				
				model.addRow(new Chefinfo[]{name,nid,address,contactNumber});
		}
		catch (Exception ex)
	    {
            JOptionPane.showMessageDialog(null, "No data Availavail!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
		}
		
	}*/

		/* String textfield1=name.getText(); 
		String textfield2=nid.getText();
		String textfield3=address.getText();
		String textfield4=contactNumber.getText();
		if (ae.getSource() == addData) {
			
		if(!isAnyDataEmpty() && !isAllDataEmpty()){
			if(m.getEmployeeLeft() > 0){
				
				Chef c1=new Chef(textfield1,textfield2,textfield3,textfield4);
				m.addEmployee(c1);
				model.addRow(new Object[] { textfield1,textfield2,textfield3,textfield4 });
				clearAll();
			}else{
				JOptionPane.showMessageDialog(this, "Max Employee Limit Reached.", "Error",
						JOptionPane.WARNING_MESSAGE);
			}
		}else{
				JOptionPane.showMessageDialog(this, "Please Provide All The necessary Information", "Warning",
						JOptionPane.WARNING_MESSAGE);
		}*/
		



