package example.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	/*
	 * example call: - http://localhost:8080/WebDevSpringMVC/hello/
	 */

	@Autowired
	private HttpServletRequest reqContext;

	@RequestMapping("/hello")
	public ModelAndView test() {
		String message = "Welcome to Spring 4.0 !";

		reqContext.setAttribute("message2", "message2");

		return new ModelAndView("hello", "message", message);
	}

}
