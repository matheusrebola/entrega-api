package entrega.api.domain.endereco.record;

import jakarta.validation.constraints.NotBlank;

public record DadosListagemEndereco(
        Long id,
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        String complemento,
        String numero
)
{
    //TODO: criar construtor
}
