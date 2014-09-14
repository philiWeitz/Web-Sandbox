package example.util;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonUtil {

	private JsonUtil() {
		
	}
	
	public static String jsonpFromObject(Object obj, String callback) {
		ObjectMapper mapper = new ObjectMapper();
		String result = StringUtils.EMPTY;
		
    	try {
			result = callback + "(" + mapper.writeValueAsString(obj) + ");";
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return result;
	}
}
