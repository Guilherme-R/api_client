package client_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client_api.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
}
