
package domain;

import javax.validation.Valid;

public class Endorser extends Actor {

	private Endorsement	endorsement;


	@Valid
	Endorsement getEndorsement() {
		return this.endorsement;
	}

	void setEndorsement(final Endorsement endorsement) {
		this.endorsement = endorsement;
	}

}
