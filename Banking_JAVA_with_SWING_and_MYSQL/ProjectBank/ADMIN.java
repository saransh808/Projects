package ProjectBank;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;

public class ADMIN {   

	public static  long  money=0;
	public static long  nos=0;
	
	
	
	
	public static ADMIN count(){
		ADMIN obj=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/BANK","root","athena");
			Statement smt = conn.createStatement();
			
			String ss = "SELECT * FROM accounts";
			ResultSet robj = smt.executeQuery(ss);
			
			
			long countmoney=0;
			long accno = 0;
			while(robj.next()){
				countmoney+=(long)(robj.getInt("balance"));
			}
			System.out.println("1");
			
			String s2 ="select count(id) from accounts";
			ResultSet robj2 = smt.executeQuery(s2);
			System.out.println("3");
			while(robj2.next()){
				accno=(long)robj2.getInt("count(id)");
			}
			
			System.out.println("4");
			
			obj.money=countmoney;
			obj.nos=accno;
			return obj;
			
		}catch(Exception e){
			System.out.println("something went wrong");
			BankMain xx = new BankMain();
			xx.error();
		}
		
		
		
		
		return obj;
	}
	
	public  void ADMINloggedIn(String id, String pass){
		
		JFrame frame = new JFrame("ADMINISTRATOR PANEL-"+id);
		frame.setLayout(new GridLayout(1,3));
		frame.setVisible(true);
		frame.setSize(400, 100);
		frame.setResizable(false);
		frame.setLocation(525, 100);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		
		
		
		
		
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,1));
		
		
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(3,1));
		
		
		
		JPanel info = new JPanel();
		info.setLayout(new GridLayout(3,1));
		
		
		
		
		
		
		JButton add = new JButton("ADD");
		JButton statement = new JButton("STATEMENT");
		JButton fund = new JButton("FUND");
		
		
		p1.add(add);
		p1.add(statement);
		p1.add(fund);
		
		
		
		JLabel Bname = new JLabel("  S BANK");
		ADMIN obj = count();
		long countmoney=obj.money;
		long accno = obj.nos;
		JLabel accounts = new JLabel("Accounts: "+accno);
		JLabel money = new JLabel("Money: "+countmoney);
		
		
		info.add(Bname);
		info.add(accounts);
		info.add(money);
		
		
		JButton delete = new JButton("DELETE");
		JButton edit = new JButton("EDIT");
		JButton view = new JButton("VIEW");
		
		p2.add(delete);
		p2.add(edit);
		p2.add(view);
		
		
		
		add.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Registration o = new Registration();
				o.NewRegistration();
			}
		});
		statement.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.control_user("ADMIN","statement");
			}
		});
		fund.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.control_user("ADMIN","fund");
			}
		});
		delete.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.control_user("ADMIN","delete");
			}
		});
		edit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.control_user("ADMIN","edit");
			}
		});
		view.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				AdminFunctions o = new AdminFunctions();
				o.view();
			}
		});
		
		frame.add(p1);
		frame.add(info);
		frame.add(p2);
		
		
		frame.setVisible(true);
	}
	
	
	
}
