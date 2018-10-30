
package domain;

import javax.validation.Valid;

public class Sponsor extends Actor {

	private Sponsorship	sponsorShip;


	@Valid
	public Sponsorship getSponsorShip() {
		return this.sponsorShip;
	}

	public void setSponsorShip(final Sponsorship sponsorShip) {
		this.sponsorShip = sponsorShip;
	}

}
