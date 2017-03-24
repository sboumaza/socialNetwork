package persistence;// default package
// Generated 17 mars 2017 11:03:08 by Hibernate Tools 5.2.1.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Videos generated by hbm2java
 */
@Entity
@Table(name = "videos", catalog = "socialnetwork_version2")
public class Videos implements java.io.Serializable {

	private Integer videoId;
	private String url;
	private String caption;
	private Date dateOfUpload;
	private Set<Uservideos> uservideoses = new HashSet<Uservideos>(0);

	public Videos() {
	}

	public Videos(Date dateOfUpload) {
		this.dateOfUpload = dateOfUpload;
	}

	public Videos(String url, String caption, Date dateOfUpload, Set<Uservideos> uservideoses) {
		this.url = url;
		this.caption = caption;
		this.dateOfUpload = dateOfUpload;
		this.uservideoses = uservideoses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "videoID", unique = true, nullable = false)
	public Integer getVideoId() {
		return this.videoId;
	}

	public void setVideoId(Integer videoId) {
		this.videoId = videoId;
	}

	@Column(name = "url", length = 200)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Column(name = "caption", length = 200)
	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateOfUpload", nullable = false, length = 19)
	public Date getDateOfUpload() {
		return this.dateOfUpload;
	}

	public void setDateOfUpload(Date dateOfUpload) {
		this.dateOfUpload = dateOfUpload;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "videos")
	public Set<Uservideos> getUservideoses() {
		return this.uservideoses;
	}

	public void setUservideoses(Set<Uservideos> uservideoses) {
		this.uservideoses = uservideoses;
	}

}