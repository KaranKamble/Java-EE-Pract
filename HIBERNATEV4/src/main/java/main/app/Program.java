package main.app;

import java.time.LocalDate;

import main.app.dao.GenericDao;
import main.app.dao.PersonPassportDao;
import main.app.entity.Passport;
import main.app.entity.Person;

public class Program {

	public static void main(String[] args) {
	
		GenericDao dao = new PersonPassportDao();
		
//		Person person = new Person();
//		person.setName("Ram");
//		person.setBirthDate(LocalDate.of(2000,4,14));
//		dao.save(person);
		
//		Person person = (Person) dao.findByPK(Person.class, 4);
//		
//		Passport passport = new Passport();
//		passport.setIssueDate(LocalDate.of(2022,11,4));
//		passport.setExpiryDate(LocalDate.of(2032,11,4));
//		passport.setPerson(person);
//		dao.save(passport);
		
	
		Person person = new Person();
		person.setName("Jay");
		person.setBirthDate(LocalDate.of(2001,6,11));
		
		Passport passport = new Passport();
		passport.setIssueDate(LocalDate.of(2006,7,8));
		passport.setExpiryDate(LocalDate.of(2006,7,6));
		passport.setPerson(person);
		
		dao.save(passport);

	}

}
