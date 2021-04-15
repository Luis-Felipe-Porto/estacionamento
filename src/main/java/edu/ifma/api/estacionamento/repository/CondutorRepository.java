package edu.ifma.api.estacionamento.repository;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.ifma.api.estacionamento.model.Condutor;

@Repository
public interface CondutorRepository extends JpaRepository<Condutor, Long>{
	@Query("SELECT c FROM Condutor c LEFT JOIN Analise a ON a.condutorAnalisado.id = c.id WHERE a.condutorAnalisado.id is NULL")
	Page<Condutor> pedidosPendente(Pageable pageable);
}
