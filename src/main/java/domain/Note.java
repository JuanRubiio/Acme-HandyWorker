
package domain;

import java.util.Date;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Note extends DomainEntity {

	private Date	moment;
	private String	mandatory;
	private String	handyworkerComments;
	private String	customerComments;
	private String	refereeComments;

	private Report	report;


	@NotBlank
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getMandatory() {
		return this.mandatory;
	}

	public void setMandatory(final String mandatory) {
		this.mandatory = mandatory;
	}

	public String getHandyworkerComments() {
		return this.handyworkerComments;
	}

	public void setHandyworkerComments(final String handyworkerComments) {
		this.handyworkerComments = handyworkerComments;
	}

	public String getCustomerComments() {
		return this.customerComments;
	}

	public void setCustomerComments(final String customerComments) {
		this.customerComments = customerComments;
	}

	public String getRefereeComments() {
		return this.refereeComments;
	}

	public void setRefereeComments(final String refereeComments) {
		this.refereeComments = refereeComments;
	}

	public Report getReport() {
		return this.report;
	}

	public void setReport(final Report report) {
		this.report = report;
	}
}
