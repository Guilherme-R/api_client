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
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

@Entity
public class Adress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String street;
	private String district;
	private String number;
	
	@ManyToOne
	@JoinColumn(name = "CITY_ID")
	private City city;
	
	@OneToMany(mappedBy = "adress")
	private List<Client> clients = new ArrayList<>();
	
	public Adress() {
	}

	public Adress(String id, String street, String district, String number, City city) {
		this.id = id;
		this.street = street;
		this.district = district;
		this.number = number;
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Adress [id=" + id + ", street=" + street + ", district=" + district + ", number=" + number + ", city="
				+ city + "]";
	}
	
}
