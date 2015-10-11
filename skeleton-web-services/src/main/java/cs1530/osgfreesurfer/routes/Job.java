package cs1530.osgfreesurfer.routes;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.Serializable;
import java.math.BigInteger;

public class Job implements Serializable{
	//SerialID

	//Members
    private BigInteger id;
	private String user_id;
    private String image_filename;
	private String log_filename;
	private String state; //{"UPLOADED","PROCESSING","FAILED","COMPLETED"}
	private String job_date;
	private boolean purged;
	
	//Constructors
    public Job() {
		
    }
	public Job(BigInteger id){
		this.id = id;
	}

	//Getters
    public BigInteger getid() {
        return id;
    }

    public String getuser_id() {
        return user_id;
    }
	
	public String getimage_filename() {
        return image_filename;
    }
	
	public String getlog_filename() {
        return log_filename;
    }
	
	public String getstate(){
		return state;
	}
	
	public String getjob_date(){
		return job_date;
	}
	
	public boolean getpurged(){
		return purged;
	}
	
	//Setters
    public void setid(BigInteger id) {
        this.id = id;
    }

    public void setuser_id(String user_id) {
        this.user_id = user_id;
    }
	
	public void setimage_filename(String imageFilename) {
        this.image_filename = imageFilename;
    }
	
	public void setlog_filename(String logFilename) {
        this.log_filename = logFilename;
    }
	
	public void setstate(String state){
		this.state = state;
	}
	
	public void setjob_date(String jobDate){
		this.job_date = jobDate;
	}
	
	public void setpurged(boolean purged){
		this.purged = purged;
	}	
}