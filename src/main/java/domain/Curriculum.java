package domain;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Access;
import javax.persistence.AccessType;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Access(AccessType.PROPERTY)
public class Curriculum extends DomainEntity {

	// Atributos ---- 
	private String	ticker;

	@NotBlank
	public String getTicker() {
		return ticker;
	}
	
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}
	
	// Relationships ----
	
	private PersonalRecord personalRecord;
	private Collection<EducationalRecord> educationalRecord = new ArrayList<EducationalRecord>();
	private Collection<ProfessionalRecord> professionalRecords = new ArrayList<ProfessionalRecord>();
	private Collection<EndorserRecord> endoserRecords = new ArrayList<EndorserRecord>();
	private Collection<MiscellaneousRecord> miscellaneousRecords = new ArrayList<MiscellaneousRecord>();
	private HandyWorker handyWorker;

	@Valid
	@OneToOne(optional=true, mappedBy="curriculum")
	public PersonalRecord getPersonalRecord(){
		return personalRecord;
	}
	
	public void setPersonalRecord(final PersonalRecord personalRecord){
		this.personalRecord = personalRecord;
	}
	
	@Valid
	@NotNull
	@OneToMany(mappedBy="curriculum")
	public Collection<EducationalRecord> getEducationalRecord(){
		return educationalRecord;
	}
	
	public void setEducationalRecord(final Collection<EducationalRecord> edRecord){
		educationalRecord = edRecord;
	}

	@Valid
	@NotNull
	@OneToMany(mappedBy="curriculum")
	public Collection<ProfessionalRecord> getProfessionalRecord(){
		return professionalRecords;
	}
	
	public void setProfessionalRecord(final Collection<ProfessionalRecord> profRecord){
		professionalRecords = profRecord;
	}
	
	@Valid
	@NotNull
	@OneToMany(mappedBy="curriculum")
	public Collection<EndorserRecord> getEndoserRecords(){
		return endoserRecords;
	}
	
	
	public void setEndoserRecords(final Collection<EndorserRecord> endRecords){
		endoserRecords = endRecords;
	}
	
	@Valid
	@NotNull
	@OneToMany(mappedBy="curriculum")
	public Collection<MiscellaneousRecord> getMiscellaneousRecords(){
		return miscellaneousRecords;
	}
	
	public void setMiscellaneousRecords(final Collection<MiscellaneousRecord> misRecords){
		miscellaneousRecords = misRecords;
	}

	@Valid
	@OneToOne()
	public HandyWorker getRanger(){
		return handyWorker;
	}
	
	public void setRanger(final HandyWorker handyWorker){
		this.handyWorker = handyWorker;
	}
		
}
