package entrega.api.domain.endereco.record;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;

public record DadosCadastroEndereco(
        @NotBlank
        String logradouro,
        LocalDateTime dataCadastro,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{8}")
        String cep,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        String complemento,
        String numero)
{

}
