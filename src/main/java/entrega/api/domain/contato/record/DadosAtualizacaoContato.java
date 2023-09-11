package entrega.api.domain.contato.record;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoContato(
        @NotNull
        Long id,
        String telefone,
        boolean wpp,
        String email
)
{

}
