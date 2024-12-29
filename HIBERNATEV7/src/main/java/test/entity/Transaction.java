package test.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int txNo;

	@Column(name = "date_of_tx")
	private LocalDateTime dateOfTx;

	private String type;
	private double amount;

	@ManyToOne
	@JoinColumn(name = "accNo")
	private Account account;

	public int getTxNo() {
		return txNo;
	}

	public void setTxNo(int txNo) {
		this.txNo = txNo;
	}

	public LocalDateTime getDateOfTx() {
		return dateOfTx;
	}

	public void setDateOfTx(LocalDateTime dateOfTx) {
		this.dateOfTx = dateOfTx;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
