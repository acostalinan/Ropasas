package pe.edu.upc.ropasas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import pe.edu.upc.ropasas.model.entity.Label;

@Repository
public interface LabelRepository extends JpaRepository<Label, Integer> {

}
