package example.spring.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socket")
public class SocketServiceController {

	/*
	 * example call: -
	 * http://localhost:8080/WebDevSpringRESTfull/socket
	 * /myStrParameter
	 */

	@RequestMapping(value = "/{msg}", method = RequestMethod.GET)
	public void getGreeting(@PathVariable String msg) {
		
		
	}
}