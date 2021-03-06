package persistence;// default package
// Generated 17 mars 2017 11:03:08 by Hibernate Tools 5.2.1.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Workinfo generated by hbm2java
 */
@Entity
@Table(name = "workinfo", catalog = "socialnetwork_version2")
public class Workinfo implements java.io.Serializable {

	private WorkinfoId id;
	private Jobs jobs;
	private Users users;

	public Workinfo() {
	}

	public Workinfo(WorkinfoId id, Jobs jobs, Users users) {
		this.id = id;
		this.jobs = jobs;
		this.users = users;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "userID", nullable = false)),
			@AttributeOverride(name = "jobId", column = @Column(name = "jobID", nullable = false)),
			@AttributeOverride(name = "startDate", column = @Column(name = "startDate", length = 10)),
			@AttributeOverride(name = "endDate", column = @Column(name = "endDate", length = 10)) })
	public WorkinfoId getId() {
		return this.id;
	}

	public void setId(WorkinfoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "jobID", nullable = false, insertable = false, updatable = false)
	public Jobs getJobs() {
		return this.jobs;
	}

	public void setJobs(Jobs jobs) {
		this.jobs = jobs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID", nullable = false, insertable = false, updatable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

}
