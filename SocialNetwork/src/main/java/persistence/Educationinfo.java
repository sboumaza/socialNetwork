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
 * Educationinfo generated by hbm2java
 */
@Entity
@Table(name = "educationinfo", catalog = "socialnetwork_version2")
public class Educationinfo implements java.io.Serializable {

	private EducationinfoId id;
	private Schoolprograms schoolprograms;
	private Schools schools;
	private Users users;

	public Educationinfo() {
	}

	public Educationinfo(EducationinfoId id, Users users) {
		this.id = id;
		this.users = users;
	}

	public Educationinfo(EducationinfoId id, Schoolprograms schoolprograms, Schools schools, Users users) {
		this.id = id;
		this.schoolprograms = schoolprograms;
		this.schools = schools;
		this.users = users;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "userID", nullable = false)),
			@AttributeOverride(name = "schoolId", column = @Column(name = "schoolID")),
			@AttributeOverride(name = "programId", column = @Column(name = "programID")),
			@AttributeOverride(name = "startDate", column = @Column(name = "startDate", length = 10)),
			@AttributeOverride(name = "endDate", column = @Column(name = "endDate", length = 10)) })
	public EducationinfoId getId() {
		return this.id;
	}

	public void setId(EducationinfoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "programID", insertable = false, updatable = false)
	public Schoolprograms getSchoolprograms() {
		return this.schoolprograms;
	}

	public void setSchoolprograms(Schoolprograms schoolprograms) {
		this.schoolprograms = schoolprograms;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schoolID", insertable = false, updatable = false)
	public Schools getSchools() {
		return this.schools;
	}

	public void setSchools(Schools schools) {
		this.schools = schools;
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
