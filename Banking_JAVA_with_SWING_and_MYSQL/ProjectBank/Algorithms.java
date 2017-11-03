package ProjectBank;
import java.sql.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Algorithms {
	
	
	public  Boolean matchUser(String id1, String pass1,String table){
		
		
		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			
			String ss = "SELECT * FROM "+table+" where (id='"+id1+"');";
			ResultSet obj = smt.executeQuery(ss);
			if(obj==null){
				BankMain xx = new BankMain();
				xx.error1();
			}
			
			String s1=null; 
			String s2=null;
			while(obj.next()){
				s1= obj.getString("id");
				s2= obj.getString("pass");
				 System.out.println(s1+"---"+s2);
			}

			
			if(s1.equals(id1) && s2.equals(pass1)){
				return true;
			}else{
				BankMain xx = new BankMain();
				xx.error1();
			}
			
			
		}catch(Exception e){
			System.out.println("something went wrong");
			BankMain xx = new BankMain();
			xx.error1();
		}
		
		return false;
	}

	

	
}
