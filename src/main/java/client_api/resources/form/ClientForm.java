package client_api.resources.form;

import java.io.Serializable;
import java.time.LocalDateTime;

import client_api.models.Adress;
import client_api.models.Client;

public class ClientForm implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String LastName;
	private String email;
	private String phone;
	private LocalDateTime dateCreate;
	
	private Long adressId;
	
	public ClientForm() {
	}
	
	public ClientForm(Client client) {
		id = client.getId();
		name = client.getName();
		LastName = client.getLastName();
		email = client.getEmail();
		phone = client.getPhone();
		dateCreate = client.getDateCreate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDateTime getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(LocalDateTime dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Long getAdressId() {
		return adressId;
	}

	public void setAdressId(Long adressId) {
		this.adressId = adressId;
	}

	
}
