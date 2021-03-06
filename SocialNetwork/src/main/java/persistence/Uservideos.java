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
 * Uservideos generated by hbm2java
 */
@Entity
@Table(name = "uservideos", catalog = "socialnetwork_version2")
public class Uservideos implements java.io.Serializable {

	private UservideosId id;
	private Users users;
	private Videos videos;

	public Uservideos() {
	}

	public Uservideos(UservideosId id, Users users, Videos videos) {
		this.id = id;
		this.users = users;
		this.videos = videos;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "userID", nullable = false)),
			@AttributeOverride(name = "videoId", column = @Column(name = "videoID", nullable = false)) })
	public UservideosId getId() {
		return this.id;
	}

	public void setId(UservideosId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "videoID", nullable = false, insertable = false, updatable = false)
	public Videos getVideos() {
		return this.videos;
	}

	public void setVideos(Videos videos) {
		this.videos = videos;
	}

}
