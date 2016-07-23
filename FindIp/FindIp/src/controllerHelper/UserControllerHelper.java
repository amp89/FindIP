package controllerHelper;

import data.CurrentUser;

public class UserControllerHelper {
	
	public static boolean checkIfUserValid(CurrentUser cu, String accessToken){
		return (cu != null &&  cu.getAccessToken().equals(accessToken));
		
	}

}
