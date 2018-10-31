package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.ManyToOne;

public class ProfessionalRecord extends DomainEntity {

	// Atributos ----
	private String companyName;

	private Date begin;

	private Date end;

	private String role;

	private String attachment;

	private String comments;

	@NotBlank
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	@NotNull
	public Date getBegin() {
		return begin;
	}

	public void setBegin(final Date begin) {
		this.begin = begin;
	}
	
	@NotNull
	public Date getEnd() {
		return end;
	}

	public void setEnd(final Date end) {
		this.end = end;
	}

	@NotBlank
	public String getRole() {
		return role;
	}

	public void setRole(final String role) {
		this.role = role;
	}

	@URL
	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(final String attachment) {
		this.attachment = attachment;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(final String comments) {
		this.comments = comments;
	}

// Relationships ----

	private Curriculum curriculum;

	@Valid
	@NotNull
	public Curriculum getCurriculum(){
		return curriculum;
	}
	
	public void setCurriculum(final Curriculum aux){
		curriculum=aux;
	}
	
}
