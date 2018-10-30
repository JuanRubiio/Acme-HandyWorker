
package domain;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

public class Finder extends DomainEntity {

	private String		key;
	private Double		minPrice;
	private Double		maxPrice;
	private Date		minDate;
	private Date		maxDate;
	private Date		lastUpdate;
	private String		warranty;
	private String		category;

	private List<Fixup>	listFixup;


	public String getKey() {
		return this.key;
	}

	public void setKey(final String key) {
		this.key = key;
	}

	public Double getMinPrice() {
		return this.minPrice;
	}

	public void setMinPrice(final Double minPrice) {
		this.minPrice = minPrice;
	}

	public Double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final Double maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Date getMinDate() {
		return this.minDate;
	}

	public void setMinDate(final Date minDate) {
		this.minDate = minDate;
	}

	public Date getMaxDate() {
		return this.maxDate;
	}

	public void setMaxDate(final Date maxDate) {
		this.maxDate = maxDate;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(final String category) {
		this.category = category;
	}

	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(final Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public String getWarranty() {
		return this.warranty;
	}

	public void setWarranty(final String warranty) {
		this.warranty = warranty;
	}

	@Valid
	public List<Fixup> getListFixup() {
		return this.listFixup;
	}

	public void setListFixup(final List<Fixup> listFixup) {
		this.listFixup = listFixup;
	}

}
