package client_api.resources.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

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
		adress = client.getAdress();
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
