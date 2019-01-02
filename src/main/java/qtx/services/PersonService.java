package qtx.services;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.apache.commons.beanutils.BeanUtils;

import qtx.entitys.Address;
import qtx.entitys.Person;

public class PersonService {
	
	EntityManagerFactory factory; 
	EntityManager em;
	
	public PersonService() {
		this.factory = Persistence.createEntityManagerFactory("mibasededatos");
	}
	
	public boolean createAddrees(Address add) {
		boolean result = false;
		try {
			this.em = this.factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(add);
			transaction.commit();
			result = true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error de insert address " + e.getMessage());
		} finally {
			em.close();
		}	
		
		return result;
		
	}	
	
	
	public boolean createPerson(Person p) {
		boolean action = false;
		try {
			this.em = this.factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			em.persist(p);
			transaction.commit();
			action = true;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error de insert person" + e.getMessage());
			return false;
			// TODO: handle exception
		}finally {
			em.close();
		}
		
		return action;
	}
	
 
	
	public Person getPersonId(int id) {
		this.em = this.factory.createEntityManager();
		Person p = em.find(Person.class, id);
		em.close();
		return p;
	}
	
	public void CloseFactory() {
		this.factory.close();
		
	}
	
	public boolean upPerson(Person per) {
		boolean action = false;
		try {
			this.em = this.factory.createEntityManager();
			EntityTransaction transaction = em.getTransaction();
			transaction.begin();
			Person pUp = new Person();
			
			pUp = getPersonId(per.getIdPersona());
			if(pUp!=null) {
				System.out.println("Si consiguio la entidad" + pUp.getNombreCompleto().getPrimernombre());
				BeanUtils.copyProperties(per, pUp);
				em.persist(per);
				
				transaction.commit();
				action = true;	
				
			}
			
	}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("error de update persona " + e.getMessage());
			return false;
			// TODO: handle exception
		}finally {
			em.close();
		}
		return action;

}
}
