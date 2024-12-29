package test.service;

import java.util.List;
import test.entity.Account;
import test.entity.Transaction;

public interface AccountService {
	
	void openAccount( Account account );
	double withdraw( int accNO, double ammount );
	void deposit( int accNo, double amount );
	void transfer( int fromAccNO, int toAccNO, double amount );
	List<Transaction> miniStatament( int accNo );

}
