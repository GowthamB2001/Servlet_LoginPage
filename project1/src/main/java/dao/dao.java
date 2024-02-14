package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.dto;

public class dao {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager m=emf.createEntityManager();
	EntityTransaction t=m.getTransaction();

	public void loginpage(dto d) {
		t.begin();
		m.persist(d);
		t.commit();
		
	}

}
