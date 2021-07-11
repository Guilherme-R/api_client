package client_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import client_api.models.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long>  {

}
