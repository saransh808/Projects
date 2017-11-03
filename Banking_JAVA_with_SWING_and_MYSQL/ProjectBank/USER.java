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

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class USER {
	
	
	
	
	
	
	
	public static void getDetails(String id){
	
		JFrame frame = new JFrame(id+"'s Details");
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setSize(800, 300);
		frame.setLocation(400,200);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JPanel panel = new JPanel();
		
		String accno=null;
		String name=null;
		String email=null;
		String phno=null;
		String dob=null;
		String address=null;
		String balance=null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			String sql = "select *from accounts where id ='"+id+"'";
			ResultSet obj = smt.executeQuery(sql);		
			
			
			
			
			
			while(obj.next()){
				accno=obj.getString("accno");
				name=obj.getString("name");
				email=obj.getString("email");
				phno=obj.getString("phno");
				dob=obj.getString("dob");
				address=obj.getString("address");
				balance=obj.getString("balance");
			}
		}catch(Exception e){
			System.out.println("something went wrong");
		}
		
		
		
		//Text Fields
		JLabel id_ = new JLabel(id);
		JLabel accno_ = new JLabel(accno);
		JLabel name_ = new JLabel(name);
		JLabel email_ = new JLabel(email);
		JLabel phno_ = new JLabel(phno);
		JLabel dob_ = new JLabel(dob);
		JLabel address_ = new JLabel(address);
		JLabel balance_ = new JLabel(balance);
		
		//Labels
		JLabel idL = new JLabel(" ID");
		JLabel accnoL = new JLabel(" Account No.");
		JLabel nameL = new JLabel(" Name");
		JLabel emailL = new JLabel(" Email");
		JLabel phnoL = new JLabel(" Pho. no.");
		JLabel dobL = new JLabel(" DOB");
		JLabel addressL = new JLabel(" Address");
		JLabel balanceL = new JLabel(" Deposite");
		
		
		
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
		
		
		
		
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void Transact(String id1,String amt,int token){
		try{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			System.out.println("yes");
			
			System.out.println(id1+" "+amt);
			ResultSet x1 = smt.executeQuery("select *from accounts where id = '"+id1+"'");
			String ac1=null;
			while(x1.next()){
				ac1=x1.getString("accno");
			}
			System.out.println("ac1 got");
			
			
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date obj = new Date();
			String s = df.format(obj);
			
			
			String q1=null;
			String qa1=null;
			if(token==1){
				q1="update accounts set balance=balance-"+amt+" where id='"+id1+"'";
				qa1 = "insert into statement values('"+id1+"','"+ac1+"','ATM-Withdraw','"+s+"',"+amt+")";
			}
			else {
				q1="update accounts set balance=balance+"+amt+" where id='"+id1+"'";
				qa1 = "insert into statement values('"+id1+"','"+ac1+"','ATM-Deposit','"+s+"',"+amt+")";
			}
			System.out.println("yes 1");

			

			
			

			
			
			
			
			
			


			smt.executeUpdate(q1);
			System.out.println("1");
			
			smt.executeUpdate(qa1);
			System.out.println("3");

		}catch(Exception e){
			System.out.println("something went wrong");
			BankMain xx = new BankMain();
			xx.error();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void banking(String id){
		JFrame frame =new JFrame("Transaction:"+id);
		frame.setSize(400,120);
		frame.setLocation(100, 500);
		frame.setResizable(false);
		frame.setLayout(new GridLayout(3,1));
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		JPanel amt = new JPanel();
		JPanel opt = new JPanel();
		
		//message
		amt.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("Amount");
		JTextField a = new JTextField(10);
		amt.add(label);
		amt.add(a);
		//Panel Y USER/ADMIN
		opt.setLayout(new GridLayout(1,2));
		JButton withdraw = new JButton("WithDraw");
		JButton submit= new JButton("Deposit");
		opt.add(withdraw);
		opt.add(submit);
		//////////////////
		//panel Z for new User
		
		
		
		//////////////////

		frame.add(amt);
		frame.add(opt);
		
		withdraw.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String amount = a.getText();
				if(amount !=null){
					Transact(id,amount,1);
				}
				frame.dispose();
			}
		});
		submit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				String amount = a.getText();
				if(amount !=null)
					Transact(id,amount,0);
				frame.dispose();
			}
		});
		
		
		frame.setVisible(true);
		
	
	
		
	}
	
	
	
	
	public void USERloggedIn(String id, String pass){
		
		JFrame frame = new JFrame("USER PANEL-"+id);
		frame.setLayout(new GridLayout(1,3));
		frame.setVisible(true);
		frame.setSize(400, 100);
		frame.setResizable(false);
		frame.setLocation(80, 300);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		

		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,1));
		
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3,1));
		
		
		
		JPanel info = new JPanel();
		info.setLayout(new GridLayout(3,1));

		
		JButton details = new JButton("Details");
		JButton statement = new JButton("STATEMENT");
		JButton fund = new JButton("FUND");
		
		
		p1.add(details);
		p1.add(statement);
		p1.add(fund);
		
		
		
		JLabel Bname = new JLabel("  ABC BANK");
		//ADMIN obj = count();
		//long countmoney=obj.money;
		//long accno = obj.nos;
		//JLabel accounts = new JLabel("Accounts: "+accno);
		//JLabel money = new JLabel("Money: "+countmoney);
		
		
		info.add(Bname);
		//info.add(accounts);
		//info.add(money);
		
		
		JButton delete = new JButton("De-Activate");
		JButton edit = new JButton("EDIT");
		JButton bank = new JButton("BANKING");
		
		p2.add(delete);
		p2.add(edit);
		p2.add(bank);
		
		
		
		details.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				getDetails(id);//done
			}
		});
		statement.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.statement(id);//done
			}
		});
		fund.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.fund(id);
			}
		});
		delete.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.control_user(id,"delete");
			}
		});
		edit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.edit(id);//done
			}
		});
		bank.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				banking(id);
			}
		});
		
		frame.add(p1);
		frame.add(info);
		frame.add(p2);
		
		
		frame.setVisible(true);
	}
	

}
