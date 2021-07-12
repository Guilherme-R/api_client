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
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_adress")
public class Adress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String street;
	private String district;
	private String number;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;
	
	@JsonIgnore
	@OneToMany(mappedBy = "adress")
	private List<Client> clients = new ArrayList<>();
	
	public Adress() {
	}

	public Adress(Long id, String street, String district, String number) {
		this.id = id;
		this.street = street;
		this.district = district;
		this.number = number;
//		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public List<Client> getClients() {
		return clients;
	}
//
//	@Override
//	public String toString() {
//		return "Adress [id=" + id + ", street=" + street + ", district=" + district + ", number=" + number + ", city="
//				+ city + "]";
//	}
//	
}
