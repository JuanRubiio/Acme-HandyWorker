
package domain;

import javax.persistence.Entity;

@Entity
public class CreditCard extends DomainEntity {

	private String	holderName;
	private String	brandName;
	private String	number;
	private Integer	expiryMonth;
	private Integer	expiryYear;
	private Integer	cvv;


	public String getHolderName() {
		return this.holderName;
	}

	public void setHolderName(final String holderName) {
		this.holderName = holderName;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(final String brandName) {
		this.brandName = brandName;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(final String number) {
		this.number = number;
	}

	public Integer getExpiryMonth() {
		return this.expiryMonth;
	}

	public void setExpiryMonth(final Integer expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public Integer getExpiryYear() {
		return this.expiryYear;
	}

	public void setExpiryYear(final Integer expiryYear) {
		this.expiryYear = expiryYear;
	}

	public Integer getCvv() {
		return this.cvv;
	}

	public void setCvv(final Integer cvv) {
		this.cvv = cvv;
	}

}
