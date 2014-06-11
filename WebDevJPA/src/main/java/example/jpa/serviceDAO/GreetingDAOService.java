package example.jpa.serviceDAO;

import java.util.List;

import example.jpa.model.Greeting;

public interface GreetingDAOService extends AbstractDAOService<Greeting> {
	
	List<Greeting> getGreetings();
	Greeting saveGreeting(Greeting item);
	void deleteGreeting(Greeting item);
	
}
