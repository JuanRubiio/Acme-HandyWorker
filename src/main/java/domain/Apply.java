
package domain;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Apply extends DomainEntity {

	//----------Atributos------------
	private Date	moment;
	private String	customerComment;
	private Money	price;
	private String	handyWorkerComments;


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
	public String getCustomerComment() {
		return this.customerComment;
	}

	public void setCustomerComment(final String customerComment) {
		this.customerComment = customerComment;
	}

	@Valid
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


	//------RelationsShip-----------
	private HandyWorker			handyWorker;
	private Collection<Phase>	workplan;
	private FixUpTask			fixUpTask;
	private Collection<Status>	status;


	@NotNull
	@Valid
	public HandyWorker getHandyWorker() {
		return this.handyWorker;
	}

	public void setHandyWorker(final HandyWorker handyWorker) {
		this.handyWorker = handyWorker;
	}

	@Valid
	public Collection<Phase> getWorkPlan() {
		return this.workplan;
	}

	public void setWorkPlan(final Collection<Phase> workplan) {
		this.workplan = workplan;
	}

	@NotNull
	@Valid
	public FixUpTask getFixUpTask() {
		return this.fixUpTask;
	}

	public void setFixUpTask(final FixUpTask fixUpTask) {
		this.fixUpTask = fixUpTask;
	}

	@NotNull
	@Valid
	public Collection<Status> getStatus() {
		return this.status;
	}

	public void setStatus(final Collection<Status> status) {
		this.status = status;
	}

}
