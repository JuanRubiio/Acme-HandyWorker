
package domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Sponsorship {

	private String		banner;
	private String		link;
	private CreditCard	creditCard;
	private Tutorial	tutorial;
	private Sponsor		sponsor;


	@NotBlank
	@URL
	@NotNull
	String getBanner() {
		return this.banner;
	}

	void setBanner(final String banner) {
		this.banner = banner;
	}

	@NotBlank
	@URL
	@NotNull
	String getLink() {
		return this.link;
	}

	void setLink(final String link) {
		this.link = link;
	}

	@Valid
	@NotNull
	CreditCard getCreditCard() {
		return this.creditCard;
	}

	void setCreditCard(final CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@NotNull
	Tutorial getTutorial() {
		return this.tutorial;
	}

	@NotNull
	Sponsor getSponsor() {
		return this.sponsor;
	}
}
