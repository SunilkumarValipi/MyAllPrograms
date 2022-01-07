package com.techno.OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MyClass {
	public static void main(String[] args) {
		
		Girl girl = new Girl();
		girl.setId(1);
		girl.setName("Devil");
		
		Boy boy = new Boy();
		boy.setId(8);
		boy.setName("Idiot");
		boy.setBalance(100000);
		
		girl.setBoy(boy);
         
		boy.setGirl(girl);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tony");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		em.persist(girl);
		em.persist(boy);
		transaction.commit();
		
	}

}
