package entrega.api.entity;

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
@Table(name="tb_endereco")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco {
	@Id
	private UUID id;
	
	private String cidade;
	
	private String estado;
	
	private String cep;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private Cliente cliente;
	
	private Estabelecimento estabelecimento;
	
	private Entrega entrega;
	
	private Entregador entregador;
	
	private Data data;
	
	@Column(name="ativo")
	private boolean ativo;
}
