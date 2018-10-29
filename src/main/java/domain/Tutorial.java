
package domain;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Tutorial extends DomainEntity {

	private String	title;
	private Date	momentUpdate;
	private String	summary;
	private String	pictures;
	private Date	momentCreate;


	public Tutorial() {
		super();
	}

	@NotBlank
	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public Date getMomentUpdate() {
		return this.momentUpdate;
	}

	public void setMomentUpdate(final Date momentUpdate) {
		this.momentUpdate = momentUpdate;
	}
	@NotBlank
	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}
	@URL
	public String getPictures() {
		return this.pictures;
	}

	public void setPictures(final String pictures) {
		this.pictures = pictures;
	}

	public Date getMomentCreate() {
		return this.momentCreate;
	}

	public void setMomentCreate(final Date momentCreate) {
		this.momentCreate = momentCreate;
	}

}
