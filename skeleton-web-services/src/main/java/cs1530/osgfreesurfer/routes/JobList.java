package cs1530.osgfreesurfer.routes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="jobs")
public class JobList implements Serializable
{
	//Members
	private List<Job> jobs = new ArrayList<Job>();
	
	//Getter
	public List<Job> getJobs(){
		return jobs;
	}
	
	//Setter
	public void setJobs(List<Job> jobs){
		this.jobs = jobs;
	}
}