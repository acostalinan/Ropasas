package pe.edu.upc.ropasas.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.ropasas.business.crud.ClientService;
import pe.edu.upc.ropasas.model.entity.Client;
import pe.edu.upc.ropasas.model.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public JpaRepository<Client, Integer> getJpaRepository() {
		return this.clientRepository;
	}

}
