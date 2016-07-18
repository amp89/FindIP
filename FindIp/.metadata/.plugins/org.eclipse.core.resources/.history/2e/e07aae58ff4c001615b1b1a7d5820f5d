package data;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dataHelpers.UserDataHelper;
import entities.User;

public class IpMySQLDAO implements IpDAO{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public CurrentUser getTestUser() { //TODO test method
		
		return UserDataHelper.convertUserToCurrentUser(em.find(User.class, 1));
	}

	@Override
	public User getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getuserByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
