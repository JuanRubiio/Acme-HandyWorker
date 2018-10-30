
package domain;

import java.util.Collection;

import javax.validation.Valid;

public class Referee extends Actor {

	private Collection<Report>	collectionReports;
	private Collection<Referee>	collectionReferees;


	@Valid
	public Collection<Referee> getCollectionReferees() {
		return this.collectionReferees;
	}

	public void setCollectionReferees(final Collection<Referee> collectionReferees) {
		this.collectionReferees = collectionReferees;
	}

	public Collection<Report> getListReports() {
		return this.collectionReports;
	}

	public void setCollectionReports(final Collection<Report> collectionReports) {
		this.collectionReports = collectionReports;
	}

}
