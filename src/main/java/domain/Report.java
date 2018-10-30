
package domain;

import java.util.Collection;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Report extends DomainEntity {

	private Date				moment;
	private String				description;
	private String				attachements;
	private Boolean				draft;

	private Collection<Note>	listNotes;


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

	public Collection<Note> getCollectionNotes() {
		return this.listNotes;
	}

	public void setCollectionNotes(final Collection<Note> listNotes) {
		this.listNotes = listNotes;
	}
}
