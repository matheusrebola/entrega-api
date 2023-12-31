package entrega.api.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Valor {
	@Id
	private UUID id;
	
	private BigDecimal preco;
	
	private Entrega entrega;
	
	private Combo combo;
	
	private Produto produto;
	
	private Data data;
	
	@Column(name="ativo")
	private boolean ativo;
}
