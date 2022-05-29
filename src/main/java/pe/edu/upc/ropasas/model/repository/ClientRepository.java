package pe.edu.upc.ropasas.model.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.ropasas.model.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
