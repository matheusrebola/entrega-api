package entrega.api.entity;

import java.util.UUID;

import entrega.api.entity.enumeradores.TipoDocumento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_documento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Documento {
	@Id
	private UUID id;
	
	private TipoDocumento tipoDocumento;
	
	private String numeroDocumento;
	
	private Cliente cliente;
	
	private Estabelecimento estabelecimento;
	
	private Entregador entregador;
	
	private Veiculo veiculo;
	
	private Data data;
	
	@Column(name="ativo")
	private boolean ativo;
}
