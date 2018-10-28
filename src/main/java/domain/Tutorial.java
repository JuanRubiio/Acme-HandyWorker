
package domain;

import org.joda.time.LocalDate;

public class Tutorial extends DomainEntity {

	private String		title;
	private LocalDate	momentUpdate;
	private String		summary;
	private String		pictures;


	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public LocalDate getMomentUpdate() {
		return this.momentUpdate;
	}

	public void setMomentUpdate(final LocalDate momentUpdate) {
		this.momentUpdate = momentUpdate;
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(final String summary) {
		this.summary = summary;
	}

	public String getPictures() {
		return this.pictures;
	}

	public void setPictures(final String pictures) {
		this.pictures = pictures;
	}

}
