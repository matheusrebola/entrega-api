package entrega.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entrega.api.entity.Documento;

@Repository
public interface DocumentoRepository extends JpaRepository<Documento, UUID>{

}
