
package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Report extends DomainEntity {

	private Date		moment;
	private String		description;
	private String		attachements;
	private Boolean		draft;

	private List<Note>	listNotes;


	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@URL
	public String getAttachements() {
		return this.attachements;
	}

	public void setAttachements(final String attachements) {
		this.attachements = attachements;
	}

	public Boolean getDraft() {
		return this.draft;
	}

	public void setDraft(final Boolean draft) {
		this.draft = draft;
	}

	public List<Note> getListNotes() {
		return this.listNotes;
	}

	public void setListNotes(final List<Note> listNotes) {
		this.listNotes = listNotes;
	}
}
