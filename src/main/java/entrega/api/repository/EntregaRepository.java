package entrega.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entrega.api.entity.Entrega;

@Repository
public interface EntregaRepository extends JpaRepository<Entrega, UUID>{

}
