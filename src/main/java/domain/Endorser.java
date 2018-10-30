
package domain;

import javax.validation.Valid;

public class Endorser extends Actor {

	private Endorsement	endorsement;


	@Valid
	public Endorsement getEndorsement() {
		return this.endorsement;
	}

	public void setEndorsement(final Endorsement endorsement) {
		this.endorsement = endorsement;
	}

}
