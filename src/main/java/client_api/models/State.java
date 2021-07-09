package client_api.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sun.istack.NotNull;


@Entity
public class State implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	@NotNull @NotEmpty
	private String name;
	
	@NotNull @NotEmpty
	private String abbreviation;
	
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

	public void addCitys(List<City> citys) {
		this.citys.addAll(citys);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
