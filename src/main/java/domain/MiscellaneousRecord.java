package domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Access(AccessType.PROPERTY)
public class MiscellaneousRecord extends DomainEntity {

	// Atributos ---- 
	private String	title;

	private String	attachment;

	private String	comments;

	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

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
	@ManyToOne(optional=false)
	public Curriculum getCurriculum(){
		return curriculum;
	}
	
	public void setCurriculum(final Curriculum aux){
		curriculum=aux;
	}

}

