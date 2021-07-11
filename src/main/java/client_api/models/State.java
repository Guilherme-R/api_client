package client_api.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String name;
	
	private String abbreviation;
	
	@JsonIgnore
	@OneToMany(mappedBy = "state")
	private List<City> citys = new ArrayList<>();
	
	public State() {
	}

	public State(String id, String name, String abbreviation, List<City> citys) {
		super();
		this.id = id;
		this.name = name;
		this.abbreviation = abbreviation;
		this.citys = citys;
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

	public List<City> getCitys() {
		return citys;
	}
	
}
