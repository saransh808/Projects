package bankProject;

public class Adminis extends Account{
	
///////////////////////////////////////////////////////////	
	
	public void delAll(){
		i=-1;
		System.out.println("Enter Passowrd : ");
		String ss;	
		if((ss = sc.next()).equalsIgnoreCase("Password")){
			System.out.println("All Accounts Deleted");
		}
	}	
	
	public void viewAll(){
		System.out.println("Enter Passowrd : ");
		String ss;	
		if((ss = sc.next()).equalsIgnoreCase("Password")){
			System.out.println("Name\tBalance");
			for(int ii=0;ii<=i;ii++){
				System.out.println(ac[ii].getName()+"\t"+ac[ii].getBalance());
			}
		}
		
	}
	

}
