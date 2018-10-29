
package domain;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Endorsement {

	private Date		moment;
	private String		comments;
	private Customer	customer;
	private HandyWorker	handyWorker;


	@NotNull
	Date getMoment() {
		return this.moment;
	}

	void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	@NotNull
	String getComments() {
		return this.comments;
	}

	void setComments(final String comments) {
		this.comments = comments;
	}

	@NotNull
	Customer getCustomer() {
		return this.customer;
	}

	@NotNull
	HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

}
