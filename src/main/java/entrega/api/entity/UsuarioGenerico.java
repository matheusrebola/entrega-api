package entrega.api.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioGenerico {
	@Id
	protected UUID id;
	
	protected String nome;
	
	protected String sobrenome;
	
	protected Documento documento;
	
	protected Endereco endereco;
	
	protected Data data;
	
	@Column(name="vl_ativo")
	private boolean ativo;
}
