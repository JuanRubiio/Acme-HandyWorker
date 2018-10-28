
package domain;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Referee extends Actor {

	private List<Report>	listReports;


	public List<Report> getListReports() {
		return this.listReports;
	}

	public void setListReports(final List<Report> listReports) {
		this.listReports = listReports;
	}

}
