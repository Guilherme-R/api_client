package client_api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client_api.models.Adress;
import client_api.repositories.AdressRepository;
import client_api.services.exceptions.ResourceNotFoundException;

@Service
public class AdressService {

	@Autowired
	AdressRepository repository;
	
	public Adress findById(Long id) {
		Optional<Adress> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

}
