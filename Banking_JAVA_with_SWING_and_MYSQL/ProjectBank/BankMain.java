package ProjectBank;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BankMain {

	public static JFrame frame = new JFrame("ABC Bank");
	public static JPanel panelX  = new JPanel();
	public static JPanel panelY = new JPanel();
	public static JPanel panelZ = new JPanel();
	
	
	public static JFrame adminFrame = new JFrame("Admin LOGIN");
	public static JPanel admin = new JPanel();
	
	
	
	
	public void error(){
		JFrame j = new JFrame("ERROR");
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JLabel l = new JLabel("ERROR !!");
		j.setSize(100,60);
		j.setBackground(Color.red);
		j.setLocation(550, 400);
		j.add(l);
		j.setVisible(true);
		
	}
	
	
	
	
	public void error1(){
		JFrame j = new JFrame("ERROR");
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JLabel l = new JLabel("ID/Pass wrong");
		j.setSize(100,60);
		j.setBackground(Color.red);
		j.setLocation(550, 400);
		j.add(l);
		j.setVisible(true);
		
	}
	
	
	
	public void error2(){
		JFrame j = new JFrame("ERROR");
		j.setLayout(new FlowLayout());
		j.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JLabel l = new JLabel("Not Found");
		j.setSize(100,60);
		j.setBackground(Color.red);
		j.setLocation(550, 400);
		j.add(l);
		j.setVisible(true);
		
	}
	
	
	
	
	public static void USER_(){
		
		JFrame userFrame = new JFrame("User LOGIN");
		userFrame.setLocation(100, 300);
		userFrame.setResizable(false);
		JPanel user = new JPanel();
		
		
		userFrame.setSize(250, 100);
		
		userFrame.setLayout(new GridLayout(1,1));
		userFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		

		user.setLayout(new GridLayout(3,1));
		JTextField id = new JTextField(20);
		JTextField pass = new JTextField(20);
		JButton button = new JButton("Login");
		
		user.add(id);
		user.add(pass);
		user.add(button);
		
		
		userFrame.add(user);
		
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				String id_1=id.getText();
				String password = pass.getText();
				Algorithms obj = new Algorithms();
				if(obj.matchUser(id_1,password,"user")){
					USER o = new USER();
					o.USERloggedIn(id_1,password);
				}
				userFrame.dispose();
			}
		});
		userFrame.setVisible(true);
		
	}

	//////////////////////////////////////////////////////////////////////////////////
	
	
public static void ADMIN_(){
		
		JFrame adminFrame = new JFrame("ADMINISTRATOR LOGIN");
		adminFrame.setLocation(525, 100);
		adminFrame.setResizable(false);
		JPanel admin = new JPanel();
		
		
		adminFrame.setSize(350, 100);
		
		adminFrame.setLayout(new GridLayout(1,1));
		adminFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		

		admin.setLayout(new GridLayout(3,1));
		JTextField id = new JTextField(20);
		JTextField pass = new JTextField(20);
		JButton button = new JButton("Login");
		
		admin.add(id);
		admin.add(pass);
		admin.add(button);
		
		
		adminFrame.add(admin);
		
		
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				
				String id_1=id.getText();
				String password = pass.getText();
				Algorithms obj = new Algorithms();
				if(obj.matchUser(id_1,password,"admin")){
					ADMIN o = new ADMIN();
					o.ADMINloggedIn(id_1,password);
				}
				adminFrame.dispose();
			}
		});
		adminFrame.setVisible(true);
		
	}

	
	
	
	///////////////////////////////////////////////////////////////////////////////
	public static void START(){
		
		
		frame.setSize(400,120);
		frame.setLocation(100, 100);
		frame.setResizable(false);
		frame.setLayout(new GridLayout(3,1));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//message
		panelX.setLayout(new FlowLayout(FlowLayout.CENTER));
		JLabel label = new JLabel("SELECT TYPE");
		panelX.add(label);
		//Panel Y USER/ADMIN
		panelY.setLayout(new GridLayout(1,2));
		JButton buttonUSER = new JButton("USER");
		JButton buttonADMIN = new JButton("ADMIN");
		panelY.add(buttonUSER);
		panelY.add(buttonADMIN);
		//////////////////
		//panel Z for new User
		panelZ.setLayout(new FlowLayout(FlowLayout.CENTER));
		JButton but = new JButton("OPEN NEW ACCOUNT");
		but.setForeground(Color.GRAY);
		panelZ.add(but);
		
		
		//////////////////

		frame.add(panelX);
		frame.add(panelY);
		frame.add(panelZ);
		
		buttonUSER.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				USER_();
				//frame.dispose();
			}
		});
		buttonADMIN.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				ADMIN_();
				//frame.dispose();
			}
		});
		but.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				Registration robj = new Registration();
				robj.NewRegistration();////////////////////////////
				//frame.dispose();
			}
		});
		
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		START();

	}

}
