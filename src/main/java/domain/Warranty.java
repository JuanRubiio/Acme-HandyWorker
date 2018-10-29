
package domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class Warranty {

	private String	title;
	private String	terms;
	private String	laws;


	@NotBlank
	@NotNull
	String getTitle() {
		return this.title;
	}

	void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	@NotNull
	String getTerms() {
		return this.terms;
	}

	void setTerms(final String terms) {
		this.terms = terms;
	}

	@NotBlank
	@NotNull
	String getLaws() {
		return this.laws;
	}

	void setLaws(final String laws) {
		this.laws = laws;
	}

}
