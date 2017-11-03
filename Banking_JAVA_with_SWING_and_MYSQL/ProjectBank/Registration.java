package ProjectBank;

import java.sql.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class Registration {

	
	public void newReg (String query,String id){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			smt.executeUpdate(query);	
			Success(id);

		}catch(Exception e){
			System.out.println("something went wrong");
			BankMain xx = new BankMain();
			xx.error();
		}
	}
	

	
	public static void setPass(String id1,String pass1){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			String query = "insert into user values('"+id1+"','"+pass1+"')";
			smt.executeUpdate(query);
		}catch(Exception q){}
		
	}
	
	
	public static void Success(String id){
		JFrame ff= new JFrame("Success");
		ff.setLayout(new FlowLayout());
		ff.setLocation(550,310);;
		ff.setSize(200, 120);
		
		JPanel pp = new JPanel();
		pp.setLayout(new GridLayout(3,1));
		pp.setSize(200,120);
		
		
		JLabel ll = new JLabel("Create Password");
		pp.add(ll);
		
		
		JTextField pass1 = new JTextField(10);
		pp.add(pass1);
		
		
		JButton bb = new JButton("Set Password");
		pp.add(bb);
		ff.add(pp);
		bb.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String pas = pass1.getText();
				setPass(id,pas);
				Hurr();
				ff.dispose();
			}
		});
		
		
		
		ff.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		ff.setVisible(true);
	}
	
	public static void Hurr(){
		JFrame ff= new JFrame("Successfuly Created");
		ff.setLayout(new FlowLayout());
		ff.setLocation(550,310);;
		ff.setSize(200, 60);
		
		JPanel pp = new JPanel();
		pp.setSize(200,60);
		JLabel ll = new JLabel("Don't forget your password");
		pp.add(ll);
		ff.add(pp);
		ff.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		ff.setVisible(true);
	}
	
	public static void Fail(){
		JFrame ff= new JFrame("INVALID");
		ff.setLayout(new FlowLayout());
		ff.setLocation(550,310);;
		ff.setSize(200, 60);
		
		JPanel pp = new JPanel();
		pp.setSize(200,60);
		JLabel ll = new JLabel("Fields are Empty, Try again");
		pp.add(ll);
		ff.add(pp);
		ff.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		ff.setVisible(true);
	}
	
	
	
	public void NewRegistration(){
		JFrame frame = new JFrame("New Account");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setSize(600, 300);
		frame.setLocation(400,200);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel panel = new JPanel();
		
		//Text Fields
		JTextField id_ = new JTextField(20);
		JTextField accno_ = new JTextField(20);
		JTextField name_ = new JTextField(20);
		JTextField email_ = new JTextField(20);
		JTextField phno_ = new JTextField(20);
		JTextField dob_ = new JTextField(20);
		JTextField address_ = new JTextField(20);
		JTextField balance_ = new JTextField(20);
		
		//Labels
		JLabel idL = new JLabel("Enter ID");
		JLabel accnoL = new JLabel("Enter Account No.");
		JLabel nameL = new JLabel("Enter Name");
		JLabel emailL = new JLabel("Enter Email");
		JLabel phnoL = new JLabel("Enter Pho. no.");
		JLabel dobL = new JLabel("Enter DOB");
		JLabel addressL = new JLabel("Enter Address");
		JLabel balanceL = new JLabel("Enter Deposite");
		
		
		
		panel.setLayout(new GridLayout(10,2));
		panel.add(idL);
		panel.add(id_);
		panel.add(accnoL);
		panel.add(accno_);
		panel.add(nameL);
		panel.add(name_);
		panel.add(emailL);
		panel.add(email_);
		panel.add(phnoL);
		panel.add(phno_);
		panel.add(dobL);
		panel.add(dob_);
		panel.add(addressL);
		panel.add(address_);
		panel.add(balanceL);
		panel.add(balance_);
		
		JLabel label = new JLabel("Creation...");
		panel.add(label);
		JButton button = new JButton("Create Account");
		
		
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				//NEFR();
				String id=null;
				id = id_.getText();
				String accno =null;
				accno= accno_.getText();
				String name = null;
				name = name_.getText();
				String email = null;
				email = email_.getText();
				String phno = null;
				phno=phno_.getText();
				String dob = null;
				dob=dob_.getText();
				String address = null;
				address = address_.getText();
				String balance = null;
				balance=balance_.getText();
				
				
				//if(email==null||id==null||name==null||accno==null||phno==null||dob==null||address==null||balance==null){
				if(id_.getText().isEmpty()||accno_.getText().isEmpty()||name_.getText().isEmpty()||email_.getText().isEmpty()||phno_.getText().isEmpty()||address_.getText().isEmpty()||dob_.getText().isEmpty()||balance_.getText().isEmpty()){
					Fail();
					
				}else{
					String query = "insert into accounts (id,accno,name,email,phno,dob,address,balance) values('"+id+"',"+accno+",'"+name+"','"+email+"','"+phno+"','"+dob+"','"+address+"',"+balance+");";
					newReg(query,id);
					
				}
				//frame.dispose();
			}
		});
		
		
		
		panel.add(button);
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
	
	
	
	
}
