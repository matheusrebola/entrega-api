package entrega.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_enregador")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Entregador extends UsuarioGenerico{
	
}
