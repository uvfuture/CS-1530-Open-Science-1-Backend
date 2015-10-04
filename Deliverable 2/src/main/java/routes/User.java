package routes;

import java.io.Serializable; 

public class User implements Serializable {

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
		
	}
	public User(long id)
	{
		this.id = id;
	}

	//Getters
    public long get_id() {
        return id;
    }

    public String get_username() {
        return username;
    }
	
	public String get_first_name() {
        return firstName;
    }
	
	public String get_last_name() {
        return lastName;
    }
	
	public String get_email() {
        return email;
    }
	
	public String get_institution() {
        return institution;
    }
	
	public String get_phone() {
        return phone;
    }
	
	public String get_password() {
        return password;
    }
	
	public String get_salt(){
		return salt;
	}
	
	public get_info(){
		//JSON?
	}
	
	
	//Setters
	public void set_id(long id) {
        this.id = id;
    }

    public void set_username(String username) {
        this.username = username;
    }
	
	public void set_first_name(String firstname) {
        this.first_name = firstname
    }
	
	public void set_last_name(String lastname) {
        this.last_name = lastname;
    }
	
	public void set_email(String email) {
        this.email = email;
    }
	
	public void set_institution(String institution) {
        this.institution = institution;
    }
	
	public void set_phone(String phone) {
        this.phone = phone;
    }
	
	public void set_password(String password) {
        this.password = password;
    }
	
	public String set_salt(String salt){
		this.salt = salt;
	}
	
	public set_info(){
		//JSON?
	}
}