package client_api.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client_api.dto.ClientDto;
import client_api.models.Client;
import client_api.services.ClientService;

@RestController
@RequestMapping("client")
public class ClientController {

	@Autowired
	ClientService service;
	
	@GetMapping
	public ResponseEntity<List<ClientDto>> findAll() {
		List<Client> list = service.findAll();
		List<ClientDto> listDto = list.stream().map(x -> new ClientDto(x)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDto);
	}
	
	@GetMapping("/{id}")
	public ClientDto findById(@PathVariable Long id) {
		Client client = service.findById(id);
		ClientDto clientDto = new ClientDto(client);
		return clientDto;
	}
}
