
package domain;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.joda.time.LocalDate;

@Entity
public class CreditCard extends DomainEntity {

	private String	holderName;
	private String	brandName;
	private String	number;
	private Integer	expiryMonth;
	private Integer	expiryYear;
	private Integer	cvv;


	@NotBlank
	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(final String holderName) {
		this.holderName = holderName;
	}
	@NotBlank
	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}
	@NotBlank
	public String getNumber() {
		return this.number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}

	public Integer getExpiryMonth() {
		Integer res;
		if (this.expiryMonth >= 1 && this.expiryMonth <= 12)
			res = this.expiryMonth;
		else
			throw new IllegalArgumentException("El mes de expiración no es válido.");
		return res;
	}

	public void setExpiryMonth(final Integer expiryMonth) {
		if (expiryMonth >= 1 && expiryMonth <= 12)
			this.expiryMonth = expiryMonth;
		else
			throw new IllegalArgumentException("El mes de expiración no es válido.");
	}

	public Integer getExpiryYear() {
		Integer res;
		if (this.expiryYear >= LocalDate.now().getYear())
			res = this.expiryYear;
		else
			throw new IllegalArgumentException("El año de expiración no es válido.");
		return res;
	}

	public void setExpiryYear(final Integer expiryYear) {
		if (this.expiryYear >= LocalDate.now().getYear())
			this.expiryYear = expiryYear;
		else
			throw new IllegalArgumentException("El año de expiración no es válido.");
	}

	public Integer getCvv() {
		Integer res;
		if (this.cvv <= 999 && this.cvv >= 100)
			res = this.cvv;
		else
			throw new IllegalArgumentException("El código de seguridad no es válido");
		return res;
	}

	public void setCvv(final Integer cvv) {
		if (cvv >= 100 && cvv <= 999)
			this.cvv = cvv;
		else
			throw new IllegalArgumentException("El codigo de seguridad no es válido");
	}

}
