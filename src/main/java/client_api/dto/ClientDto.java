package client_api.dto;

import java.io.Serializable;

import client_api.models.Client;

public class ClientDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String email;
	
	public ClientDto() {
	}
	
	public ClientDto(Client client) {
		id = client.getId();
		name = client.getName();
		email = client.getEmail();
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
}
