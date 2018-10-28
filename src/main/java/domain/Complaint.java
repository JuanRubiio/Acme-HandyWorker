
package domain;

import javax.persistence.Entity;

import org.joda.time.LocalDate;

@Entity
public class Complaint extends DomainEntity {

	private String		ticker;
	private LocalDate	moment;
	private String		description;
	private String		attachements;


	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	public LocalDate getMoment() {
		return this.moment;
	}

	public void setMoment(final LocalDate moment) {
		this.moment = moment;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getAttachements() {
		return this.attachements;
	}

	public void setAttachements(final String attachements) {
		this.attachements = attachements;
	}

}
