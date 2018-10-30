
package domain;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Sponsorship extends DomainEntity {

	private String		banner;
	private String		link;
	private CreditCard	creditCard;


	@NotBlank
	@URL
	String getBanner() {
		return this.banner;
	}

	void setBanner(final String banner) {
		this.banner = banner;
	}

	@NotBlank
	@URL
	String getLink() {
		return this.link;
	}

	void setLink(final String link) {
		this.link = link;
	}

	@Valid
	CreditCard getCreditCard() {
		return this.creditCard;
	}

	void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}


	//Relationships

	private Tutorial	tutorial;
	private Sponsor		sponsor;


	@Valid
	Tutorial getTutorial() {
		return this.tutorial;
	}

	void setTutorial(final Tutorial tutorial) {
		this.tutorial = tutorial;
	}

	@Valid
	Sponsor getSponsor() {
		return this.sponsor;
	}

	void setSponsor(final Sponsor sponsor) {
		this.sponsor = sponsor;
	}
}
