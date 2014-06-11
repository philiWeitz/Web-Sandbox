package example.jpa.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;

import example.jpa.model.Greeting;
import example.jpa.serviceDAOImpl.GreetingDAOServiceImpl;


public class GreetingTest {

	@Test
	public void test() {		
		
		Greeting greeting = new Greeting();
		greeting.setCaption("Greetings!");
		greeting.setMessage("Hello World");
		
		GreetingDAOServiceImpl service = new GreetingDAOServiceImpl();
		greeting = service.saveGreeting(greeting);
		assertNotNull(greeting.getId());
		
		Greeting gResult = service.getGreetingById(greeting.getId());
		assertNotNull(gResult);
		assertEquals(greeting.getCaption(), gResult.getCaption());
			
		greeting.setCaption("updated");
		Greeting updated = service.saveGreeting(greeting);
		assertEquals(greeting.getCaption(), updated.getCaption());
		
		List<Greeting> gList = service.getAll();
		assertNotNull(gList);
		assertEquals(1, gList.size());
		
		service.delete(gResult);
		Greeting deleted = service.getGreetingById(gResult.getId());
		assertNull(deleted);
	}
}
