package entrega.api.domain.cliente.record;

import entrega.api.domain.contato.record.DadosCadastroContato;
import entrega.api.domain.endereco.record.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String sobrenome,
        @NotNull
        DadosCadastroContato contato,
        LocalDateTime dataNascimento,
        @NotNull @Valid
        DadosCadastroEndereco endereco
)
{

}
