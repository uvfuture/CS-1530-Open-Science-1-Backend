package cs1530.osgfreesurfer.routes;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.Serializable;
import java.math.BigInteger; 

public class User implements Serializable, Comparable<User>{
	//SHA-256
	MessageDigest md;
	
	//Members
    private long id;
	private String username;
    private String first_name;
	private String last_name;
	private String email;
	private String institution;
	private String phone;
	private String password;
	private String salt; //What?

	//Constructors
	public User()
	{
		id = 0;
	}
	public User(long id)
	{
		this.id = id;
	}

	//Getters
    public long getid() {
        return id;
    }

    public String getusername() {
        return username;
    }
	
	public String getfirst_name() {
        return first_name;
    }
	
	public String getlast_name() {
        return last_name;
    }
	
	public String getemail() {
        return email;
    }
	
	public String getinstitution() {
        return institution;
    }
	
	public String getphone() {
        return phone;
    }
	
	public String getpassword() {
        return password;
    }
	
	public String getsalt(){
		return salt;
	}
	
	
	//Setters
	public void setid(long id) {
        this.id = id;
    }

    public void setusername(String username) {
        this.username = username;
    }
	
	public void setfirst_name(String firstname) {
        this.first_name = firstname;
    }
	
	public void setlast_name(String lastname) {
        this.last_name = lastname;
    }
	
	public void setemail(String email) {
        this.email = email;
    }
	
	public void setinstitution(String institution) {
        this.institution = institution;
    }
	
	public void setphone(String phone) {
        this.phone = phone;
    }
	
	public void setpassword(String password) {
        this.password = password;
    }
	
	public void create_salt()
	{
		try
		{
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			byte[] hash = md.digest();
			StringBuilder saltString = new StringBuilder();
			for(int i = 0; i < hash.length;i++)
			{
				String hex = Integer.toHexString(0xff & hash[i]);
				if(hex.length() == 1)
					saltString.append('0');
				saltString.append(hex);
			}
		}
		catch(NoSuchAlgorithmException e)
		{
			e.printStackTrace();
			return;
		}
	}
	
	public void setsalt(String salt){
		this.salt = salt;
	}
	
	public int compareTo(User other)
	{
		if(getusername() == other.getusername() && getpassword().equals(other.getpassword()))
			return 0;
		else
			return 1;
	}
}