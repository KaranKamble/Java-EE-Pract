package test;

import org.junit.Test;
import test.entity.Account;
import test.service.AccountService;
import test.service.AccountServiceImpl;

public class Testing {

	@Test
	public void open_account() {

		AccountService service = new AccountServiceImpl();
		
		Account account = new Account();
		account.setName("Raghav");
		account.setType("Saving");
		account.setBalance(8000);
		
		service.openAccount(account);
	}
	
	@Test
	public void withdraw_amount() {
		AccountService service = new AccountServiceImpl();
		service.withdraw(5, 1000);
		
	}
	
	@Test
	public void deposit_amount() {
		AccountService service = new AccountServiceImpl();
		service.deposit(4, 200);
		
	}
	
	@Test
	public void transfer_amount() {
		AccountService service = new AccountServiceImpl();
		service.transfer(1,4,1000);
		
	}
	
	@Test
	public void mini_statement() {
		AccountService service = new AccountServiceImpl();
		service.miniStatament(4);
		
	}
}
