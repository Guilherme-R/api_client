package client_api.dto;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.persistence.OneToMany;

import client_api.models.Adress;
import client_api.models.Client;

public class ClientDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String LastName;
	private String email;
	private String phone;
	private LocalDateTime dateCreate;
	
	private Adress adress;
	
	public ClientDto() {
	}
	
	public ClientDto(Client client) {
		id = client.getId();
		name = client.getName();
		LastName = client.getLastName();
		email = client.getEmail();
		phone = client.getPhone();
		dateCreate = client.getDateCreate();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return LastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public LocalDateTime getDateCreate() {
		return dateCreate;
	}

	public Adress getAdress() {
		return adress;
	}
	
}
