package entrega.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entrega.api.entity.Valor;

@Repository
public interface ValorRepository extends JpaRepository<Valor, UUID>{

}
