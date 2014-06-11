package example.jpa.serviceDAOImpl;

import java.util.List;

import example.jpa.model.Greeting;
import example.jpa.serviceDAO.GreetingDAOService;


public class GreetingDAOServiceImpl extends AbstractDAOServiceImpl<Greeting> implements GreetingDAOService {

	public Greeting getGreetingById(Long id) {
		return getById(id);
	}
	
	public List<Greeting> getGreetings() {
		return getAll();
	}
	
	public Greeting saveGreeting(Greeting item) {
		return saveOrUpdate(item);
	}
	
	public void deleteGreeting(Greeting item) {
		delete(item);
	}
}
