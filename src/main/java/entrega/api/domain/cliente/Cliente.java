package entrega.api.domain.cliente;

import entrega.api.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import entrega.api.domain.cliente.record.DadosAtualizacaoCliente;
import entrega.api.domain.cliente.record.DadosCadastroCliente;
import entrega.api.domain.contato.Contato;
import entrega.api.domain.endereco.Endereco;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    private String documento;

    private LocalDateTime dataNascimento;
    private LocalDateTime dataCadastro;
    private LocalDateTime dataAtualizacao;
    private LocalDateTime dataExclusao;

    @Embedded
    private Endereco endereco;
    @Embedded
    private Contato contato;
    private boolean ativo;

    public Cliente(DadosCadastroCliente dados){
        this.ativo = true;
        this.dataCadastro = LocalDateTime.now();
        this.nome = dados.nome();
        this.sobrenome = dados.sobrenome();
        this.contato = new Contato(dados.contato());
        this.endereco = new Endereco(dados.endereco());
    }
    public void atualizarInformacoes(DadosAtualizacaoCliente dados){
        if(dados.){

        }
        this.dataAtualizacao = LocalDateTime.now();
    }

    public void excluir() {
        this.ativo = false;
        this.dataExclusao = LocalDateTime.now();
    }
}
