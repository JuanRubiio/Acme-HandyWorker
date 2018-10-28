
package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Message extends DomainEntity {

	// Atributos ---- 
	private Date	date;

	private Actor	sender;

	private Actor	recipient;

	private String	subject;

	private String	body;

	private String	priority;

	private Boolean	spam	= false;


	@NotNull
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return this.date;
	}

	public void setDate(final Date date) {
		this.date = date;
	}

	@Valid
	public Actor getSender() {
		return this.sender;
	}

	public void setSender(final Actor sender) {
		this.sender = sender;
	}

	@Valid
	public Actor getRecipient() {
		return this.recipient;
	}

	public void setRecipient(final Actor recipient) {
		this.recipient = recipient;
	}

	public Boolean getSpam() {
		return this.spam;
	}

	public void setSpam(final Boolean spam) {
		this.spam = spam;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	@NotBlank
	public String getBody() {
		return this.body;
	}

	public void setBody(final String body) {
		this.body = body;
	}

	@NotBlank
	@Pattern(regexp = "HIGH|NEUTRAL|LOW")
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(final String priority) {
		this.priority = priority;
	}


	// Relationships ----------------------------------------------------------

	private Actor					actor;
	private Collection<MessageBox>	messageBoxes;
	private Collection<Tag>			tags;


	@Valid
	public Actor getActor() {
		return this.actor;
	}

	public void setActor(final Actor actor) {
		this.actor = actor;
	}

	@Valid
	public Collection<MessageBox> getMessageBoxes() {
		return this.messageBoxes;
	}

	public void setMessageBoxes(final Collection<MessageBox> messageBoxes) {
		this.messageBoxes = messageBoxes;
	}

	@Valid
	public Collection<Tag> getTags() {
		return this.tags;
	}

	public void setTags(final Collection<Tag> tags) {
		this.tags = tags;
	}

}
