package entrega.api.domain.entregador;

import entrega.api.domain.endereco.Endereco;
import entrega.api.domain.entregador.record.DadosCadastroEntregador;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "entregadores")
@Entity(name = "Entregador")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Entregador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private LocalDateTime dataNascimento;
    private LocalDateTime dataCadastro;
    private boolean ativo;
    private Endereco endereco;

    public Entregador(DadosCadastroEntregador dados){
        this.ativo = true;
        this.nome = dados.nome();
    }
}
