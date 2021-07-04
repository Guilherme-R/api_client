package client_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client_api.dto.ClientDto;
import client_api.models.Client;
import client_api.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		List<Client> list = repository.findAll();
		return list;
	}

	public Client findById(Long id){
		Optional<Client> client = repository.findById(id);
		return client.get();
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}	
	
	public Client insert(Client obj) {
		return repository.save(obj);
	}
	
	public Client fromDto(ClientDto objDto) {
		return new Client(objDto.getId(), objDto.getName(), objDto.getEmail());
	}


}
