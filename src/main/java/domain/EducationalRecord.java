package domain;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class EducationalRecord extends DomainEntity {

	// Atributos ---- 
	private String	title;

	private Date	begin;

	private Date	end;

	private String	institution;

	private String	attachment;

	private String	comments;


	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
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
	public String getInstitution() {
		return institution;
	}

	public void setInstitution(final String institution) {
		this.institution = institution;
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