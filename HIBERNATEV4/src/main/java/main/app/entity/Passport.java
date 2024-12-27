package main.app.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Passport {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int passId;
	private LocalDate issueDate;
	private LocalDate expiryDate;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "persId")
	private Person person;

	public int getPassId() {
		return passId;
	}

	public void setPassId(int passId) {
		this.passId = passId;
	}

	public LocalDate getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
