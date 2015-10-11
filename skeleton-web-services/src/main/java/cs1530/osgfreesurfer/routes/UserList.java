package cs1530.osgfreesurfer.routes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="users")
public class UserList implements Serializable
{
	//Members
	private List<User> users = new ArrayList<User>();
	
	//Getter
	public List<User> getUsers(){
		return users;
	}
	
	//Setter
	public void setUsers(List<User> users){
		this.users = users;
	}
}