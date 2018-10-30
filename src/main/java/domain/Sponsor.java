
package domain;

import javax.validation.Valid;

public class Sponsor extends Actor {

	private Sponsorship	sponsorShip;


	@Valid
	Sponsorship getSponsorShip() {
		return this.sponsorShip;
	}

	void setSponsorShip(final Sponsorship sponsorShip) {
		this.sponsorShip = sponsorShip;
	}

}
