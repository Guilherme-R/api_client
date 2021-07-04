package client_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client_api.models.Client;

@RestController
@RequestMapping("/")
public class ClientController {

	@GetMapping
	public Client index() {
		Client client = new Client("Pamela", "pamela@gmail.com");
		
		return client;
	}
	
	
}
