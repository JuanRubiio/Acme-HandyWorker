
package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

@Entity
public class Referee extends Actor {

	private List<Report>	listReports;
	private List<Referee>	listReferees;


	@Valid
	public List<Referee> getListReferees() {
		return this.listReferees;
	}

	public void setListReferees(final List<Referee> listReferees) {
		this.listReferees = listReferees;
	}

	public List<Report> getListReports() {
		return this.listReports;
	}

	public void setListReports(final List<Report> listReports) {
		this.listReports = listReports;
	}

}
