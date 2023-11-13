package entrega.api.entity;

import java.util.UUID;

import entrega.api.entity.enumeradores.StatusEntrega;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_entrega")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Entrega {
	@Id
	private UUID id;
	
	private StatusEntrega status;
	
	private Cliente cliente;
	
	private Endereco endereco;
	
	private Estabelecimento estabelecimento;
	
	private Entregador entregador;
	
	private Veiculo veiculo;
	
	private Valor valor;
	
	private Combo combo;
	
	private Produto produto;
	
	private Data data;
	
	@Column(name="ativo")
	private boolean ativo;
}
