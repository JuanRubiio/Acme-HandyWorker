
package domain;

import java.util.Collection;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

public class Configuration extends DomainEntity {

	// Atributos ---- 
	private String				banner;

	private String				welcomMessage;

	private String				welcomMessageEs;

	private Double				vat;

	private String				countryCode;

	private Integer				finderDuration;

	private Collection<String>	cards;


	@NotNull
	@Range(min = 60, max = 1440)
	public Integer getFinderDuration() {
		return this.finderDuration;
	}

	public void setFinderDuration(final Integer finderDuration) {
		this.finderDuration = finderDuration;
	}

	@NotBlank
	@URL
	public String getBanner() {
		return this.banner;
	}

	public void setBanner(final String banner) {
		this.banner = banner;
	}

	@NotBlank
	public String getWelcomMessage() {
		return this.welcomMessage;
	}

	public void setWelcomMessage(final String welcomMessage) {
		this.welcomMessage = welcomMessage;
	}

	@NotBlank
	public String getWelcomMessageEs() {
		return this.welcomMessageEs;
	}

	public void setWelcomMessageEs(final String welcomMessageEs) {
		this.welcomMessageEs = welcomMessageEs;
	}

	@NotNull
	@Min(1)
	public Double getVat() {
		return this.vat;
	}

	public void setVat(final Double vat) {
		this.vat = vat;
	}

	@NotBlank
	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(final String countryCode) {
		this.countryCode = countryCode;
	}

	@NotNull
	public Collection<String> getCards() {
		return this.cards;
	}

	public void setCards(final Collection<String> cards) {
		this.cards = cards;
	}

}
