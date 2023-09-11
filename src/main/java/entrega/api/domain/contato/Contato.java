package entrega.api.domain.contato;


import entrega.api.domain.contato.record.DadosAtualizacaoContato;
import entrega.api.domain.contato.record.DadosCadastroContato;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

@Embeddable
@Table(name = "enderecos")
@Entity(name = "Endreco")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Contato {
    private Long id;
    private String telefone;
    private boolean wpp;
    private String email;

    public Contato(DadosCadastroContato dados) {
        this.telefone = dados.telefone();
        this.wpp = dados.wpp();
        this.email = dados.email();
    }

    public void atualizarInformacoes(DadosAtualizacaoContato dados){
        if (dados.telefone() !=null){
            this.telefone = dados.telefone();
        }
        if (dados.wpp() != this.wpp) {
            this.wpp = dados.wpp();
        }
        if (dados.email() !=null){
            this.email = dados.email();
        }
    }

    public Contato(Contato contato) {
    }
}
