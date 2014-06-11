package example.jpa.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;


@Entity @SuppressWarnings("serial")
public class Greeting implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	
	@Basic
	private String message;
	
	@Basic
	private String language;

	
	public Greeting() {
		this.message = StringUtils.EMPTY;
		this.language = StringUtils.EMPTY;
	}

	public Greeting(String message, String language) {
		this.message = message;
		this.language = language;
	}

	public String toString() {
		return "Greeting id=" + id + ", message=" + message + ", language="
				+ language;
	}
}