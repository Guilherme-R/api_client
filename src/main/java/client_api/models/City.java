package client_api.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "STATE_ID")
	private State state;
	
	@OneToMany(mappedBy = "city")
	private List<Adress> adress = new ArrayList<>();
	
	public City() {
	}

	public City(String id, String name, State state, List<Adress> adress) {
		super();
		this.id = id;
		this.name = name;
		this.state = state;
		this.adress = adress;
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

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Adress> getAdress() {
		return adress;
	}

	public void setAdress(List<Adress> adress) {
		this.adress = adress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
