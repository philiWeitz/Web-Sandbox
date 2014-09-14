package example.spring.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import example.util.JsonUtil;


@RestController
@RequestMapping("/service/greeting")
public class SpringServiceController {

	/*
	 * example call: -
	 * http://localhost:8080/WebDevSpringRESTfull/service/greeting
	 * /myStrParameter
	 */

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String name) {
		String result = "Hello " + name;
		return result;
	}
	
    @RequestMapping (value="jsonp/{namep}", method=RequestMethod.GET, produces = {"application/x-javascript", "application/json", "application/xml"})
    @ResponseBody
    public String getJsonP(@PathVariable String namep, @RequestParam("callback") String jsonpCallback) {        
    	String result = JsonUtil.jsonpFromObject(namep, jsonpCallback);	
        return result;
    }
}