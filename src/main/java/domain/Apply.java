
package domain;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

public class Apply extends DomainEntity {

	//----------Atributos------------
	private Date		moment;
	private String		status;
	private String		customerComment;
	private Money		price;
	private String		handyWorkerComments;
	private List<Phase>	workPlan;


	//----------Getters & Setters-----------
	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	@Pattern(regexp = "PENDING|REJECTED|ACCEPTED")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	@NotBlank
	public String getCustomerComment() {
		return this.customerComment;
	}

	public void setCustomerComment(final String customerComment) {
		this.customerComment = customerComment;
	}

	@NotNull
	public Money getPrice() {
		return this.price;
	}

	public void setPrice(final Money price) {
		this.price = price;
	}

	@NotBlank
	public String getHandyWorkerComments() {
		return this.handyWorkerComments;
	}

	public void setHandyWorkerComments(final String handyWorkerComments) {
		this.handyWorkerComments = handyWorkerComments;
	}

	public List<Phase> getWorkPlan() {
		return this.workPlan;
	}

	public void setWorkPlan(final List<Phase> workPlane) {
		this.workPlan = workPlane;
	}


	//------RelationsShip-----------
	private HandyWorker	handyWorker;
	private Phase		phase;
	private FixUpTask	fixUpTask;


	@Valid
	@NotBlank
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@Valid
	@NotBlank
	public Phase getPhase() {
		return this.phase;
	}

	public void setPhase(final Phase phase) {
		this.phase = phase;
	}

	@Valid
	@NotBlank
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}
}
