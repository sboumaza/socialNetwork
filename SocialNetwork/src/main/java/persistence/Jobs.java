package persistence;// default package
// Generated 17 mars 2017 11:03:08 by Hibernate Tools 5.2.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Jobs generated by hbm2java
 */
@Entity
@Table(name = "jobs", catalog = "socialnetwork_version2")
public class Jobs implements java.io.Serializable {

	private Integer jobId;
	private String company;
	private String title;
	private String description;
	private Set<Workinfo> workinfos = new HashSet<Workinfo>(0);

	public Jobs() {
	}

	public Jobs(String company, String title, String description, Set<Workinfo> workinfos) {
		this.company = company;
		this.title = title;
		this.description = description;
		this.workinfos = workinfos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "jobID", unique = true, nullable = false)
	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	@Column(name = "company", length = 100)
	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobs")
	public Set<Workinfo> getWorkinfos() {
		return this.workinfos;
	}

	public void setWorkinfos(Set<Workinfo> workinfos) {
		this.workinfos = workinfos;
	}

}