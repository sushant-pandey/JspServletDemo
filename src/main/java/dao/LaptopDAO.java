package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Laptop;

public class LaptopDAO {
	public List<Laptop> fetchAllLaptops(){
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("HB");
		EntityManager entityManager = factory.createEntityManager();

		entityManager.getTransaction().begin();
		System.out.println("THis call is successful");
		String sqlString = "SELECT * from LAPTOP";
		Query q = entityManager.createNativeQuery(sqlString, Laptop.class);
		List<Laptop> list = q.getResultList();		
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
		return list;
	}
}
