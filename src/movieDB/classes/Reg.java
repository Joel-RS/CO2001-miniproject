package movieDB.classes;

import java.util.Scanner;

public class Reg {
	private static User currentUser = new User(null, null, null, 0);
	
	public static User getCurrentUser()				{return currentUser;}
	public static void setCurrentUser(User u)			{currentUser = u;}
	
	public static void login() {
		Scanner s = new Scanner(System.in);
		
		String userIn = s.nextLine();
		String passIn = s.nextLine();
		
		for(User u: User.getUserList()) {
			if(u.getUserName() == userIn && u.getPassword() == passIn) {
				setCurrentUser(u);
			}else {System.out.println("Incorrect credentials");}
		}s.close();
	}
	
	public static void main(String[] args) {
		login();
		System.out.println(getCurrentUser().getUserName());
		
	}
}
