
package domain;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class HandyWorker extends Endorser {

	//------Atributos---------
	private String	mark;


	//--------Getter & Setter------------
	@NotBlank
	public String getMark() {
		return this.mark;
	}

	public void setMark(final String mark) {
		this.mark = mark;
	}


	//---------Relationships--------------

	private Collection<Tutorial>	tutorial;
	private Curriculum				curriculum;
	private Collection<Finder>		finder;
	private Collection<Apply>		apply;


	@Valid
	public Collection<Tutorial> getTutorial() {
		return this.tutorial;
	}

	public void setTutorial(final Collection<Tutorial> tutorial) {
		this.tutorial = tutorial;
	}

	@NotNull
	@Valid
	public Curriculum getCurriculum() {
		return this.curriculum;
	}

	public void setCurriculum(final Curriculum curriculum) {
		this.curriculum = curriculum;
	}

	@Valid
	public Collection<Finder> getFinder() {
		return this.finder;
	}

	public void setFinder(final Collection<Finder> finder) {
		this.finder = finder;
	}

	@Valid
	public Collection<Apply> getApply() {
		return this.apply;
	}

	public void setApply(final Collection<Apply> apply) {
		this.apply = apply;
	}

}
