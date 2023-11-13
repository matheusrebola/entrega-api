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
@Table(name="tb_combo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Combo {
	@Id
	private UUID id;
	
	private String nome;
	
	private Valor valor;
	
	private Produto produto;
	
	private Estabelecimento estabelecimento;
	
	private Data data;
	
	@Column(name="ativo")
	private boolean ativo;
}
