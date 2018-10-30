
package domain;

import org.hibernate.validator.constraints.NotBlank;

public class Warranty extends DomainEntity {

	private String	title;
	private String	terms;
	private String	laws;


	@NotBlank
	String getTitle() {
		return this.title;
	}

	void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	String getTerms() {
		return this.terms;
	}

	void setTerms(final String terms) {
		this.terms = terms;
	}

	@NotBlank
	String getLaws() {
		return this.laws;
	}

	void setLaws(final String laws) {
		this.laws = laws;
	}

}
