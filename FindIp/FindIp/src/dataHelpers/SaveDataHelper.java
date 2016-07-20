package dataHelpers;

import data.IpSaveObject;
import entities.Save;

public class SaveDataHelper {
	
	public static Save convertIpSaveObjectToSave(IpSaveObject saveObject){
		return new Save(saveObject.getPublicComment(),saveObject.getPrivateComment(),saveObject.getUser(),saveObject.getAddress());
	}

}
