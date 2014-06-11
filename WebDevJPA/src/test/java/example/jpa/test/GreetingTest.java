package example.jpa.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.junit.Test;

import example.jpa.model.Greeting;


public class GreetingTest {

	@Test
	public void test() {		
		EntityManager em = Persistence.
				createEntityManagerFactory("hello-world").createEntityManager();

		Greeting greeting = new Greeting("Hello World","english");
		
		try {
			em.getTransaction().begin();			
            em.persist(greeting);     
            em.getTransaction().commit();
            
		} catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
        finally{
            em.close();
        }
	}
}
