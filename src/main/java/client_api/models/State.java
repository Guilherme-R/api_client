package client_api.models;

import java.io.Serializable;

public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String abbreviation;
	
	public State() {
	}

	public State(String id, String name, String abbreviation) {
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", abbreviation=" + abbreviation + "]";
	}
	
}
