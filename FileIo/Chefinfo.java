package FileIo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;
import java.time.format.*;
import java.util.*;

public class Chefinfo{
	
	private String name;
	private String nid;
	private String address;
	private String contactNumber;
	
	public Chefinfo(String name,String nid,String address,String contactNumber){
		this.name = name;
		this.nid = nid;
		this.address = address;
		this.contactNumber = contactNumber;
		
		try 
		{
			File file = new File(".\\data\\chef_data.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("-------## Chef's Info ##--------");
            pw.println("Name  : " + name);
            pw.println("nid   : " + nid);
            pw.println("address   : " + address);
            pw.println("contactNumber   : " + contactNumber);
            pw.println("===============================");
			
            pw.flush();
            pw.close();
            bw.close();
            fw.close();
		}
		catch (Exception ex) {
            System.out.print(ex);
        }
	}
}