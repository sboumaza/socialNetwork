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
 * Status generated by hbm2java
 */
@Entity
@Table(name = "status", catalog = "socialnetwork_version2")
public class Status implements java.io.Serializable {

	private StatusId id;
	private Users users;

	public Status() {
	}

	public Status(StatusId id, Users users) {
		this.id = id;
		this.users = users;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "userID", nullable = false)),
			@AttributeOverride(name = "status", column = @Column(name = "status", length = 65535)) })
	public StatusId getId() {
		return this.id;
	}

	public void setId(StatusId id) {
		this.id = id;
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
