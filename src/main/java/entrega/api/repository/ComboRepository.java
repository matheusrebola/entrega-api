package entrega.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entrega.api.entity.Combo;

@Repository
public interface ComboRepository extends JpaRepository<Combo, UUID>{

}
