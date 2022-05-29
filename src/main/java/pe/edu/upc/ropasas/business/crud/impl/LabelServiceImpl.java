package pe.edu.upc.ropasas.business.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.ropasas.business.crud.LabelService;
import pe.edu.upc.ropasas.model.entity.Label;
import pe.edu.upc.ropasas.model.repository.LabelRepository;

@Service
public class LabelServiceImpl implements LabelService {

	@Autowired
	private LabelRepository labelRepository;
	
	@Override
	public JpaRepository<Label, Integer> getJpaRepository() {
		return this.labelRepository;
	}

}
