package routes;

import java.io.Serializable;

public class Job implements Serializable{

	//Members
    private long id;
	private String user_id;
    private String image_filename;
	private String log_filename;
	private String state; //{"UPLOADED","PROCESSING","FAILED","COMPLETED"}
	private String job_date;
	private boolean purged;
	
	//Constructors
    public Job() {
		
    }
	public Job(){
		this.id = id;
	}

	//Getters
    public long get_id() {
        return id;
    }

    public String get_user_id() {
        return user_id;
    }
	
	public String get_image_filename() {
        return image_filename;
    }
	
	public String get_log_filename() {
        return log_filename;
    }
	
	public String get_state(){
		return state;
	}
	
	public String get_job_date(){
		return job_date;
	}
	
	public boolean get_purged(){
		return purged;
	}
	
	//Setters
    public void set_id(long id) {
        this.id = id;
    }

    public void set_user_id(String user_id) {
        this.user_id = user_id;
    }
	
	public void set_image_filename(String imageFilename) {
        this.image_filename = imageFilename;
    }
	
	public void set_log_filename(String logFilename) {
        this.log_filename = logFilename;
    }
	
	public void set_state(String state){
		this.state = state;
	}
	
	public void set_job_date(String jobDate){
		this.job_date = jobDate;
	}
	
	public void set_purged(boolean purged){
		this.purged = purged;
	}	
	
	public void set_info(){
		//JSON?
	}
}