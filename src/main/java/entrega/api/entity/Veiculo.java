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
@Table(name="tb_cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Veiculo {
	@Id
	private UUID id;
	
	private String nome;
	
	private String apelido;
	
	private String placa;
	
	private Entregador entregador;
	
	private Documento documento;
	
	private Data data;
	
	@Column(name="ativo")
	private boolean ativo;
}
