package example.jpa.model;

import javax.persistence.Basic;
import javax.persistence.Entity;


@Entity @SuppressWarnings("serial")
public class Greeting extends AbstractEntity {
	
	@Basic
	private String caption;
	
	@Basic
	private String message;

	
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}