
package domain;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class Status extends DomainEntity {

	//--------Values-----------
	public static final String	ADMIN		= "ADMIN";
	public static final String	CUSTOMER	= "CUSTOMER";

	//---------Atributos-----------
	private String				authority;


	//------------Getter & Setter--------------------
	@NotBlank
	public String getAuthority() {
		return this.authority;
	}

	public void setAuthority(final String authority) {
		this.authority = authority;
	}


	//------RelationShip---------------------
	private Apply	apply;


	@Valid
	public Apply getApply() {
		return this.apply;
	}

	public void setApply(final Apply apply) {
		this.apply = apply;
	}

}
