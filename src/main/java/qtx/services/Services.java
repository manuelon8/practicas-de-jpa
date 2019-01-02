package qtx.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import qtx.entitys.Department;
import qtx.entitys.Employee;
import qtx.entitys.Nationality;
import qtx.entitys.Person;
import qtx.entitys.Project;

public class Services {
	
	EntityManagerFactory factory; 
	EntityManager em;
	
	
	
	public Services() {
		super();
		this.factory = Persistence.createEntityManagerFactory("mibasededatos");
	}



	public boolean createDeparment(Department dep) {
		boolean result = false;
		try {
			this.em = this.factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(dep);
			transaction.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error de insert deparment " + e.getMessage());
		} finally {
			em.close();
		}	
		
		return result;
	}

	
	public boolean createEmployee(Employee emp) {
		boolean result = false;
		try {
			this.em = this.factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(emp);
			transaction.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error de insert empleado" + e.getMessage());
		} finally {
			em.close();
		}	
		
		return result;
	}
	
	/**
	 * 
	 * nationality part
	 * 
	 */
	public boolean createNationality(Nationality nat) {
		boolean result = false;
		try {
			this.em = this.factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(nat);
			transaction.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error de insert nationality " + e.getMessage());
		} finally {
			em.close();
		}	
		
		return result;
	}
	
	/**
	 * deparment part
	 */
	
	public boolean createDeparmentList(Department listDep) {
		boolean result = false;
		try {
			this.em = this.factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(listDep);
			transaction.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error de insert list person " + e.getMessage());
		} finally {
			em.close();
		}	
		
		return result;
	}
	
	/**
	 * project part
	 */
	

	
}
