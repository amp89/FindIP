package dataHelpers;

import data.CurrentUser;
import entities.User;

public class UserDataHelper {

	public static CurrentUser convertUserToCurrentUser(User user){
		return new CurrentUser(user.getId(),user.getEmail(),user.getSaves(),user.getUserType());	

	}
	
	public static CurrentUser addAuthToken(CurrentUser cu){
//		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz`~!@#$%^&*()-_=+|}{[]1234567890";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder authKey = new StringBuilder();
		for (int i = 0; i < 180; i++) {
			int randomCharKey = (int) (Math.random() * characters.length());
			authKey.append(characters.charAt(randomCharKey));
		}
		cu.setAccessToken(authKey.toString());
		return cu;
		
		
	}
	
	public static String getNewConfirmationCode(){
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder confKey = new StringBuilder();
		for (int i = 0; i < 40; i++) {
			int randomCharKey = (int) (Math.random() * characters.length());
			confKey.append(characters.charAt(randomCharKey));
		}	
		return confKey.toString();

	}
}
