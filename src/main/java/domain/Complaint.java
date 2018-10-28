
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.joda.time.LocalDate;

@Entity
public class Complaint extends DomainEntity {

	private String		ticker;
	private LocalDate	moment;
	private String		description;
	private String		attachements;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	@NotBlank
	public LocalDate getMoment() {
		return this.moment;
	}

	public void setMoment(final LocalDate moment) {
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

}
