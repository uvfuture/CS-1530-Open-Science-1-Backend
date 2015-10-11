package cs1530.osgfreesurfer.services;

import cs1530.osgfreesurfer.routes.User;
import java.util.Collection;

public interface UserService {

	//Info
	Collection<User> findAll();
	User findOne(long id);
	User create(User user);
	void delete(long id);
	User update(User user);
	
	//Login
	boolean login(User user);
	
	//Logout
	boolean logout(long id);
	
	//Checking
	boolean checkIfLoggedOn(long id);
}
