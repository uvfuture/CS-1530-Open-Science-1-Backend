package cs1530.osgfreesurfer.controllers.user;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import cs1530.osgfreesurfer.routes.User;
import cs1530.osgfreesurfer.services.UserService;

@RestController
public class UserController
{	
	@Autowired
	private UserService userService;
	
	//Get a specific user's info
	@RequestMapping(value = "/user{id}/info", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUserById(@PathVariable("id") long id)
	{
		User user = userService.findOne(id);
		if(user==null)
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity<User>(user, HttpStatus.OK); 
	}
	
	@RequestMapping(value = "/user/info", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<User>> getUsers()
	{
		Collection<User> users = userService.findAll();
		return new ResponseEntity<Collection<User>>(users, HttpStatus.OK);
	}
	
	//Make a new user
	@RequestMapping(value = "/user{id}/info", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> createUserFromInfo(@RequestBody User newUser)
	{
		User savedUser = userService.create(newUser);
		return new ResponseEntity<User>(savedUser, HttpStatus.CREATED);
	}
	
	//Update a user
	@RequestMapping(value = "/user{id}/info", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUserFromInfo(@RequestBody User newUser)
	{
		User updatedUser = userService.update(newUser);
		if (updatedUser == null)
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
		else
			return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	//Delete a user
	@RequestMapping(value = "/user{id}/info", method = RequestMethod.DELETE, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> deleteUser(@PathVariable("id") long id, @RequestBody User user)
	{
		userService.delete(id);
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}
	
	
	
	
	
	//Login and logout methods
	//Login this user. Currently compares the user given by JSON to user in map. If match, login
	@RequestMapping(value = "/user{id}/login", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> loginById(@PathVariable("id") long id, @RequestBody User user)
	{
		boolean loggedIn = userService.login(user);
		if(loggedIn)
			return new ResponseEntity<User>(HttpStatus.OK);
		else
			return new ResponseEntity<User>(HttpStatus.LOCKED);
	}
	
	@RequestMapping(value = "/user{id}/logout", method = RequestMethod.POST)
	public ResponseEntity<User> loginById(@PathVariable("id") long id)
	{
		boolean loggedOut = userService.logout(id);
		if(loggedOut)
			return new ResponseEntity<User>(HttpStatus.OK);
		else
			return new ResponseEntity<User>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
}