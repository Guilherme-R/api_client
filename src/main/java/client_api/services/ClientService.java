package client_api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client_api.dto.ClientDto;
import client_api.models.Client;
import client_api.repositories.ClientRepository;
import client_api.services.exceptions.ResourceNotFoundException;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repository;
	
	public List<Client> findAll(){
		List<Client> list = repository.findAll();
		return list;
	}

	public Client findById(Long id){
		Optional<Client> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public Client insert(Client obj) {
		return repository.save(obj);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}	
	
	public Client update(Client obj) {
		Optional<Client> optional = repository.findById(obj.getId());
		Client newObj = optional.get();
		updateData(newObj, obj);
		return repository.save(newObj);
	}	
	
	private void updateData(Client newObj, Client obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
	}

	public Client fromDto(ClientDto objDto) {
		return new Client(objDto.getId(), objDto.getName(), objDto.getEmail());
	}


}
