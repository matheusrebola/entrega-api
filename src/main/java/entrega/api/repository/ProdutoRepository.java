package entrega.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entrega.api.entity.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID>{

}
