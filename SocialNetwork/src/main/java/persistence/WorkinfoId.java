package persistence;// default package
// Generated 17 mars 2017 11:03:08 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * WorkinfoId generated by hbm2java
 */
@Embeddable
public class WorkinfoId implements java.io.Serializable {

	private int userId;
	private int jobId;
	private Date startDate;
	private Date endDate;

	public WorkinfoId() {
	}

	public WorkinfoId(int userId, int jobId) {
		this.userId = userId;
		this.jobId = jobId;
	}

	public WorkinfoId(int userId, int jobId, Date startDate, Date endDate) {
		this.userId = userId;
		this.jobId = jobId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	@Column(name = "userID", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "jobID", nullable = false)
	public int getJobId() {
		return this.jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	@Column(name = "startDate", length = 10)
	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Column(name = "endDate", length = 10)
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WorkinfoId))
			return false;
		WorkinfoId castOther = (WorkinfoId) other;

		return (this.getUserId() == castOther.getUserId()) && (this.getJobId() == castOther.getJobId())
				&& ((this.getStartDate() == castOther.getStartDate()) || (this.getStartDate() != null
						&& castOther.getStartDate() != null && this.getStartDate().equals(castOther.getStartDate())))
				&& ((this.getEndDate() == castOther.getEndDate()) || (this.getEndDate() != null
						&& castOther.getEndDate() != null && this.getEndDate().equals(castOther.getEndDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getJobId();
		result = 37 * result + (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		result = 37 * result + (getEndDate() == null ? 0 : this.getEndDate().hashCode());
		return result;
	}

}