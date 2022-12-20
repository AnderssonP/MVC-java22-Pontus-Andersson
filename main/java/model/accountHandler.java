package model;

public class accountHandler {
	private static String userOne = "Admin user";
	private static String userTwo= "Pontus Andersson";
	
	public static String getAccount(String user, String password) {
		
		if(user.equals("Admin")&& password.equals("Admin")) {
			return userOne;
		}else if(user.equals("Pontus")&& password.equals("Pontus")) {
			return userTwo;
		}else {
			return "";
		}		
	}
}
	
