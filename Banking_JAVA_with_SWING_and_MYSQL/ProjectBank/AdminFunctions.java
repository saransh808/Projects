package ProjectBank;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class AdminFunctions {
	
	
	

	public  void control_user(String n,String function){
		JFrame frame = new JFrame(n+" PANEL");
		frame.setLayout(new GridLayout(1,3));
		frame.setVisible(true);
		frame.setSize(500, 60);
		frame.setResizable(false);
		frame.setLocation(500, 210);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
		JPanel p = new JPanel();
		JLabel label = new JLabel("User ID ?");
		JTextField JTextField = new JTextField(10);
		JButton but = new JButton("GO..!");
		p.add(label);
		p.add(JTextField);
		p.add(but);
		frame.add(p);
		but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String id =JTextField.getText();
				if(function.equals("delete")){
					delete(id);
				}else if(function.equals("edit")){
					edit(id);
				}else if(function.equals("statement")){
					statement(id);
				}else if(function.equals("fund")){
					fund(id);
				}
				frame.dispose();
			}
		});
		frame.setVisible(true);
	}
	public static void fund(String id){
		JFrame frame = new JFrame("FUND Transfer");
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		frame.setSize(600, 100);
		frame.setResizable(false);
		frame.setLocation(450, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,4));
		JLabel user = new JLabel("User ID");
		JLabel destination = new JLabel("Destination");
		JLabel amount = new JLabel("Amount??");
		JLabel but = new JLabel(" ");
		JTextField user_ = new JTextField(10);
		JTextField destination_ = new JTextField(10);
		JTextField amount_ = new JTextField(10);
		JButton but_ = new JButton("Transfer");
		//p.add(user);
		p.add(destination);
		p.add(amount);
		p.add(but);
		//p.add(user_);
		
		p.add(destination_);
		
		p.add(amount_);
		
		p.add(but_);
		frame.add(p);
		but_.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				//String uid = user_.getText();
				String des = destination_.getText();
				String am = amount_.getText();
				funding(id,des,am);
				frame.dispose();
			}
		});
		frame.setVisible(true);
		
		
	}
	public static void funding(String id1, String des, String amt){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			System.out.println("yes");
			System.out.println(id1+" "+des+" "+amt);
			String q1 = "update accounts set balance=balance-"+amt+" where id='"+id1+"'";
			//String sq = "update accounts set balance=balance-1 where id='320'";
			String q2 = "update accounts set balance=balance+"+amt+" where id='"+des+"'";
			System.out.println("yes 1");

			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date obj = new Date();
			String s = df.format(obj);
			System.out.println("yes 2");

			
			
			//String qw="insert into statement values ('320',12345,'ATM','2017-09-27 12:00:54',1000);";
			ResultSet x1 = smt.executeQuery("select *from accounts where id = '"+id1+"'");
			String ac1=null;
			while(x1.next()){
				ac1=x1.getString("accno");
			}
			System.out.println("ac1 got");
			
			ResultSet x2 = smt.executeQuery("select *from accounts where id = '"+des+"'");
			String ac2=null;
			while(x2.next()){
				ac2=x2.getString("accno");
			}
			System.out.println(ac2);
			System.out.println("ac2 got");
			
			
			
			String qa1 = "insert into statement values('"+id1+"','"+ac1+"','"+des+"','"+s+"',"+amt+")";
			
			DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date obj1 = new Date();
			String s1 = df.format(obj1);
			
			String qa2 = "insert into statement values('"+des+"','"+ac2+"','rec','"+s+"',"+amt+")";
			System.out.println("yes 3");


			smt.executeUpdate(q1);
			System.out.println("1");
			smt.executeUpdate(q2);
			System.out.println("2");
			smt.executeUpdate(qa1);
			System.out.println("3");
			smt.executeUpdate(qa2);
			System.out.println("4");
		}catch(Exception e){
			System.out.println("something went wrong");
			BankMain xx = new BankMain();
			xx.error();
		}
	}
	
	public static void statement(String id){
		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			String ss = "select * from statement where id = '"+id+"'";
			ResultSet obj = smt.executeQuery(ss);
			int ct=0;
			while(obj.next()){
				ct++;
			}
			obj.close();
			
			JPanel panel = new JPanel();
	        JFrame frame = new JFrame(id+"'s Statement");
	        panel.setLayout(new FlowLayout());	       	        
	        DefaultTableModel model = new DefaultTableModel();
	        String s1 = "select * from statement where id = '"+id+"'";
	        ResultSet ob = smt.executeQuery(s1);
	        if(ct==0){
	        	BankMain xx = new BankMain();
				xx.error2();
	        }
	        else{
	        	model.addColumn("Account");
		        model.addColumn("Destination");
		        model.addColumn("Amount");
		        model.addColumn("Date		 Time");
		        JTable jt = new JTable(model);
		        //jt.getColumn(4).setPreferredWidth(30);;
	        while(ob.next()){
				model.addRow(new Object[]{ob.getInt("accno"),ob.getString("destination"),ob.getString("amount"),ob.getString("datetime")});
			}
	        jt.setBounds(0,0,1500,900);          
	        JScrollPane sp=new JScrollPane(jt);    
	        frame.add(sp);
	        frame.setSize(800, 500);
	        frame.setLocation(400, 200);
	        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        frame.setVisible(true);
			System.out.println(ct);
	        }
			conn.close();
		}catch(Exception e){
			BankMain obj = new BankMain();
			obj.error();
		}
	}
	
	public  void view(){
		try{
			System.out.println("IN VIEW");
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			String s1 = "select * from accounts";
	        ResultSet ob = smt.executeQuery(s1);
	        if(ob==null){
	        	BankMain xx = new BankMain();
	        	xx.error2();
	        }
			System.out.println("1");
			
			JPanel panel = new JPanel();
	        JFrame frame = new JFrame("ACCOUNTS");
	        panel.setLayout(new FlowLayout());	       	        
	        DefaultTableModel model = new DefaultTableModel();
	        System.out.println("2");
	        
	        model.addColumn("ID");
	        model.addColumn("Account");
	        model.addColumn("Name");
	        model.addColumn("EMAIL");
	        model.addColumn("PH.NO");
	        model.addColumn("DOB");
	        model.addColumn("ADDRESS");
	        model.addColumn("BALANCE");
	        JTable jt = new JTable(model);
	        
	        System.out.println("3");
	        while(ob.next()){
				model.addRow(new Object[]{ob.getString("id"),ob.getString("accno"),ob.getString("name"),ob.getString("email"),ob.getString("phno"),ob.getString("dob"),ob.getString("address"),ob.getString("balance")});
			}
	        System.out.println("4");
	        jt.setSize(1200, 600);
	       // jt.setBounds(0,0,1500,900);          
	        JScrollPane sp=new JScrollPane(jt);    
	        //panel.add(sp);
	        //frame.add(panel);
	        frame.add(sp);
	        frame.setSize(1000, 500);
	        frame.setLocation(400, 250);
	        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	        frame.setVisible(true);
			conn.close();
		}catch(Exception e){
			BankMain xx = new BankMain();
			xx.error();
		}
	}
	
	public void delete(String id1){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			String s = "delete from statement where id="+id1;
			String s1 = "delete from user where id="+id1;
			String s2 = "delete from accounts where id="+id1;
			smt.executeUpdate(s);
			smt.executeUpdate(s1);
			smt.executeUpdate(s2);	
		}catch(Exception e){
			System.out.println("something went wrong");
			BankMain xx = new BankMain();
			xx.error();
		}
	}
	
	
	public void edit(String id1){
		JFrame frame = new JFrame("Edit : "+id1);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setSize(600, 300);
		frame.setLocation(400,200);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel panel = new JPanel();
		
		//Text Fields
		
		JTextField name_ = new JTextField(20);
		JTextField email_ = new JTextField(20);
		JTextField phno_ = new JTextField(20);
		JTextField dob_ = new JTextField(20);
		JTextField address_ = new JTextField(20);
		
		
		//Labels
		JLabel nameL = new JLabel("Enter Name");
		JLabel emailL = new JLabel("Enter Email");
		JLabel phnoL = new JLabel("Enter Pho. no.");
		JLabel dobL = new JLabel("Enter DOB");
		JLabel addressL = new JLabel("Enter Address");
		
		
		
		panel.setLayout(new GridLayout(8,2));
		
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
		
		
		JLabel label = new JLabel("Creation... press ");
		panel.add(label);
		JButton button = new JButton("Create Account");
		panel.add(button);
		frame.add(panel);
		
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
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
				String query = "update accounts set name='"  +name+  "',email='"+email+"',phno='"+phno+"',dob='"+dob+"',address='"+address+"' where id='"+id1+"'";
				//String query = "update accounts set name='SARU AGARWAL' where id='320'";
				exe_delete(query);
				frame.dispose();
			}
		});
		frame.setVisible(true);
		
	}
	public void exe_delete(String query){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			smt.executeUpdate(query);	
		}catch(Exception e){
			System.out.println("something went wrong");
			BankMain xx = new BankMain();
			xx.error();
		}
	}
	
	
	
	
	
}
