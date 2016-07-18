package dataHelpers;

import data.CurrentUser;
import entities.User;

public class UserDataHelper {

	public static CurrentUser convertUserToCurrentUser(User user){
		return new CurrentUser(user.getId(),user.getEmail(),user.getSaves(),user.getUserType());	
		
		
	}
}
