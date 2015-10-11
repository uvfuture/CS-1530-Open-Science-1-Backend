package cs1530.osgfreesurfer.services;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import cs1530.osgfreesurfer.routes.User;

@Service
public class UserServiceBean implements UserService {

	private static long nextId;
	private static Map<Long, User> userMap;
	private static Map<Long, Boolean> loginMap;	
	//Save in hash
	private static User saveUser(User newUser)
	{
		if(userMap == null)
		{
			userMap = new HashMap<Long, User>();
			loginMap = new HashMap<Long,Boolean>();
			nextId = new Long(1); 
		}
		//User already exists, update
		if(newUser.getid() != 0)
		{
			User oldUser = userMap.get(newUser.getid());
			if(oldUser == null)
				return null;
			userMap.remove(newUser.getid());
			userMap.put(newUser.getid(), newUser);
			return newUser;		
		}
		
		//User does not exist, create
		newUser.setid(nextId);
		nextId++;
		userMap.put(newUser.getid(), newUser);
		loginMap.put(newUser.getid(), false); //Users are not logged in on creation
		return newUser;
	}
	
	private static boolean deleteUser(long id)
	{
		User deletedUser = userMap.remove(id);
		loginMap.remove(id);
		if(deletedUser == null)
			return false;
		else
			return true;
	}
	
	//Initialize
	static{
		User usr1 = new User();
		usr1.setusername("Zecheyevstan");
		saveUser(usr1);
		
		User usr2 = new User();
		usr2.setusername("Zhef");;
		saveUser(usr2);
	}
	@Override
	public Collection<User> findAll() {
		Collection<User> users = userMap.values();
		return users;
	}

	@Override
	public User findOne(long id) {
		User user = userMap.get(id);
		return user;
	}

	@Override
	public User create(User user) {
		User savedUser = saveUser(user);
		return savedUser;
	}

	@Override
	public void delete(long id) {
		if(checkIfLoggedOn(id));
			deleteUser(id);
	}

	@Override
	public User update(User user) {
		if (checkIfLoggedOn(user.getid()))
		{
			User updatedUser = saveUser(user);
			return updatedUser;
		}
		else
			return null;
	}

	@Override
	public boolean login(User user) {
		User userFromMap = findOne(user.getid());
		if (userFromMap.compareTo(user) == 0) //They match, credentials are valid
		{
			loginMap.replace(user.getid(), true);
			return true;
		}
		return false;
	}

	@Override
	public boolean logout(long id) {
		User userFromMap = findOne(id);
		if(userFromMap != null)
		{
			loginMap.replace(id, false);
			return true;
		}
		return false;
	}

	@Override
	public boolean checkIfLoggedOn(long id) {
		boolean loggedOn = loginMap.get(id);
		return loggedOn;
	}

}
