
package domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Section extends DomainEntity {

	private String		title;
	private String		text;
	private String		pictures;
	private Integer		order;

	//external attributes
	private Tutorial	tutorial;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
	@NotBlank
	public String getText() {
		return this.text;
	}

	public void setText(final String text) {
		this.text = text;
	}
	@URL
	public String getPictures() {
		return this.pictures;
	}

	public void setPictures(final String pictures) {
		this.pictures = pictures;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(final Integer order) {
		this.order = order;
	}

	@Valid
	@NotNull
	public Tutorial getTutorial() {
		return this.tutorial;
	}

	public void setTutorial(final Tutorial tutorial) {
		this.tutorial = tutorial;
	}

}
