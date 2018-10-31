package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import javax.persistence.ManyToOne;

@Access(AccessType.PROPERTY)
public class PersonalRecord extends DomainEntity {

	// Atributos ----
	private String name;

	private String photo;

	private String email;

	private String phoneNumber;

	private String linkedinIdProfile;


	@NotBlank
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@URL
	@NotBlank
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	@Email
	@NotBlank
	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@URL
	@NotBlank
	public String getLinkedinIdProfile() {
		return linkedinIdProfile;
	}

	public void setLinkedinIdProfile(final String linkedinIdProfile) {
		this.linkedinIdProfile = linkedinIdProfile;
	}
	
// Relationships ----

	private Curriculum curriculum;

	@Valid
	@ManyToOne(optional=false)
	public Curriculum getCurriculum(){
		return curriculum;
	}
	
	public void setCurriculum(final Curriculum aux){
		curriculum=aux;
	}

}