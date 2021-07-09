package client_api.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import client_api.dto.ClientDto;
import client_api.models.Client;
import client_api.repositories.ClientRepository;
import client_api.services.exceptions.DatabaseException;
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
		try {
			repository.deleteById(id);
		}catch(EmptyResultDataAccessException e) {
			throw new DatabaseException(e.getMessage());
		}
	}	
	
	public Client update(Client obj) {
		try {
			Optional<Client> optional = repository.findById(obj.getId());
			Client newObj = optional.get();
			updateData(newObj, obj);
			return repository.save(newObj);
		}
		catch(NoSuchElementException e){
			throw new ResourceNotFoundException(obj.getId());
		}
	}	
	
	private void updateData(Client newObj, Client obj) {
		newObj.setName(obj.getName());
		newObj.setLastName(obj.getLastName());
		newObj.setEmail(obj.getEmail());
		newObj.setPhone(obj.getPhone());
		newObj.setDateCreate(obj.getDateCreate());
	}

	public Client fromDto(ClientDto objDto) {
		return new Client(objDto.getId(), objDto.getName(), objDto.getLastName(), objDto.getEmail(), 
				objDto.getPhone(), objDto.getDateCreate(), objDto.getAdress());
	}
}
