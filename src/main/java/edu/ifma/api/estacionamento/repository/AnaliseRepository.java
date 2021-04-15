package edu.ifma.api.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.ifma.api.estacionamento.model.Analise;

@Repository
public interface AnaliseRepository extends JpaRepository<Analise, Long>{

}
