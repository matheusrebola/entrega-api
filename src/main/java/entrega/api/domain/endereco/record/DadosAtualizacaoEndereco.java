package entrega.api.domain.endereco.record;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.LocalDateTime;

public record DadosAtualizacaoEndereco(
        @NotNull
        Long id,
        LocalDateTime dataCadastro,
        String logradouro,
        String bairro,
        @Pattern(regexp = "\\d{8}")
        String cep,
        String cidade,
        String uf,
        String complemento,
        String numero
) {
}
