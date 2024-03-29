package dataHelpers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import data.IpSaveObject;
import entities.Address;
import entities.Save;
import entities.User;

public class SaveDataHelper {


	public static Save convertIpSaveObjectToSave(IpSaveObject saveObject, User user, Address address){
		return new Save(saveObject.getPublicComment(),saveObject.getPrivateComment(),user,address);
	}

}
