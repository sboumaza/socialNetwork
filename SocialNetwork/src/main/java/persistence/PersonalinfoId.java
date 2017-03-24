package persistence;// default package
// Generated 17 mars 2017 11:03:08 by Hibernate Tools 5.2.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PersonalinfoId generated by hbm2java
 */
@Embeddable
public class PersonalinfoId implements java.io.Serializable {

	private int userId;
	private String gender;
	private Date dateOfBirth;
	private String phoneNumber;
	private String personalEmail;
	private String workEmail;
	private String bio;

	public PersonalinfoId() {
	}

	public PersonalinfoId(int userId) {
		this.userId = userId;
	}

	public PersonalinfoId(int userId, String gender, Date dateOfBirth, String phoneNumber, String personalEmail,
			String workEmail, String bio) {
		this.userId = userId;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.personalEmail = personalEmail;
		this.workEmail = workEmail;
		this.bio = bio;
	}

	@Column(name = "userID", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "gender", length = 6)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "dateOfBirth", length = 10)
	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Column(name = "phoneNumber", length = 15)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "personalEmail", length = 64)
	public String getPersonalEmail() {
		return this.personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	@Column(name = "workEmail", length = 64)
	public String getWorkEmail() {
		return this.workEmail;
	}

	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}

	@Column(name = "bio", length = 65535)
	public String getBio() {
		return this.bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PersonalinfoId))
			return false;
		PersonalinfoId castOther = (PersonalinfoId) other;

		return (this.getUserId() == castOther.getUserId())
				&& ((this.getGender() == castOther.getGender()) || (this.getGender() != null
						&& castOther.getGender() != null && this.getGender().equals(castOther.getGender())))
				&& ((this.getDateOfBirth() == castOther.getDateOfBirth())
						|| (this.getDateOfBirth() != null && castOther.getDateOfBirth() != null
								&& this.getDateOfBirth().equals(castOther.getDateOfBirth())))
				&& ((this.getPhoneNumber() == castOther.getPhoneNumber())
						|| (this.getPhoneNumber() != null && castOther.getPhoneNumber() != null
								&& this.getPhoneNumber().equals(castOther.getPhoneNumber())))
				&& ((this.getPersonalEmail() == castOther.getPersonalEmail())
						|| (this.getPersonalEmail() != null && castOther.getPersonalEmail() != null
								&& this.getPersonalEmail().equals(castOther.getPersonalEmail())))
				&& ((this.getWorkEmail() == castOther.getWorkEmail()) || (this.getWorkEmail() != null
						&& castOther.getWorkEmail() != null && this.getWorkEmail().equals(castOther.getWorkEmail())))
				&& ((this.getBio() == castOther.getBio()) || (this.getBio() != null && castOther.getBio() != null
						&& this.getBio().equals(castOther.getBio())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + (getGender() == null ? 0 : this.getGender().hashCode());
		result = 37 * result + (getDateOfBirth() == null ? 0 : this.getDateOfBirth().hashCode());
		result = 37 * result + (getPhoneNumber() == null ? 0 : this.getPhoneNumber().hashCode());
		result = 37 * result + (getPersonalEmail() == null ? 0 : this.getPersonalEmail().hashCode());
		result = 37 * result + (getWorkEmail() == null ? 0 : this.getWorkEmail().hashCode());
		result = 37 * result + (getBio() == null ? 0 : this.getBio().hashCode());
		return result;
	}

}