package routes.controllers.user

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import routes.User;

@RestController
public class Login()
{
	//Login this user
	@RequestMapping(value = "/user{id}/login", method = RequestMethod.GET)
	public ResponseEntity<User> getUserById(@PathVariable("id") long id)
	{
		//For now, just make a user with that id. Later, find one
		User user = new User(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	//Change a specific user's info
	@RequestMapping(value = "/user{id}/login", method = RequestMethod.POST)
	public ResponseEntity<User> updateUserById(@PathVariable("id") long id)
	{
		//For now, just make a user with that id. Later, fine one
		User user = new User(id);
		user.set_institution("Other institute");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
}