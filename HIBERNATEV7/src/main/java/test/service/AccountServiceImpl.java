package test.service;

import java.time.LocalDateTime;
import java.util.List;
import test.dao.AccountTransactionDao;
import test.dao.GenericDao;
import test.entity.Account;
import test.entity.Transaction;
import test.exception.AccountException;

public class AccountServiceImpl implements AccountService{
	
	GenericDao dao = new AccountTransactionDao();
	
	@Override
	public void openAccount(Account account) {
		if( account.getBalance() < 2000 )
			throw new AccountException("Can't Open account in this amount. Min 2000 balance is required");
		else {
			dao.save(account);
		}
	}

	@Override
	public double withdraw(int accNo, double amount) {
		Account account = (Account) dao.findByID(Account.class, accNo);
		
		if(account.getBalance() < amount ) 
			throw new AccountException("Insufficient Balance! Please enter valid amount. ");
		else {
			account.setBalance(account.getBalance()- amount);
		//	dao.save(account);
			
			Transaction transaction = new Transaction();
			transaction.setAmount(amount);
			transaction.setDateOfTx(LocalDateTime.now());
			transaction.setType("Withdraw");
			transaction.setAccount(account);
			
			dao.save(transaction);	
		}
		return 0;
	}

	@Override
	public void deposit(int accNo, double amount) {
		Account account = (Account) dao.findByID(Account.class, accNo);
		
		account.setBalance(account.getBalance() + amount);
		
		Transaction tx = new Transaction();
		tx.setAmount(amount);
		tx.setDateOfTx(LocalDateTime.now());
		tx.setType("Deposit");
		tx.setAccount(account);
		
		dao.save(tx);	
	}

	@Override
	public void transfer(int fromAccNO, int toAccNO, double amount) {
		Account fromAcc = (Account) dao.findByID(Account.class, fromAccNO);
		Account toAcc = (Account) dao.findByID(Account.class, toAccNO);
		if( fromAcc.getBalance() <= amount)
			throw new AccountException("Insufficient Balance! Please enter valid amount. ");
		else {
			fromAcc.setBalance(fromAcc.getBalance() - amount );
			
			Transaction tx1 = new Transaction();
			tx1.setAmount(amount);
			tx1.setDateOfTx(LocalDateTime.now());
			tx1.setType("Transfer");
			tx1.setAccount(fromAcc);
			dao.save(tx1);
			
			toAcc.setBalance( toAcc.getBalance() + amount );
			
			Transaction tx2 = new Transaction();
			tx2.setAmount(amount);
			tx2.setDateOfTx(LocalDateTime.now());
			tx2.setType("Received");
			tx2.setAccount(toAcc);
			dao.save(tx2);
		}
		
	}

	@Override
	public List<Transaction> miniStatament(int accNo) {
		Account account = (Account) dao.findByID(Account.class, accNo);
		
		List<Transaction> list = account.getTransactions();
		for( Transaction tx : list ) {
			System.out.printf("%-5s%-10s%-15f\n", tx.getTxNo(),tx.getType(),tx.getAmount());
		}
		return null;
	}

}
