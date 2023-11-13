package entrega.api.entity;

import java.time.LocalDateTime;
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
@Table(name="tb_data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Data {
	@Id
	private UUID id;
	
	private LocalDateTime dataNascimento;
	
	private LocalDateTime dataCadastro;
	
	private LocalDateTime dataAtualizacao;
	
	private LocalDateTime dataSaida;
	
	private LocalDateTime dataChegada;
	
	private LocalDateTime dataPrevista;
	
	private LocalDateTime dataLimite;
	
	private LocalDateTime dataVencimento;
	
	private Cliente cliente;
	
	private Endereco endereco;
	
	private Estabelecimento estabelecimento;
	
	private Entrega entrega;
	
	private Entregador entregador;
	
	private Veiculo veiculo;
	
	private Valor valor;
	
	private Combo combo;
	
	private Produto produto;
	
	private Documento documento;
	
	@Column(name="ativo")
	private boolean ativo;
}
