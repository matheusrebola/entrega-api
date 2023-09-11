package entrega.api.domain.entregador.record;

import entrega.api.domain.endereco.record.DadosCadastroEndereco;

import java.time.LocalDateTime;

public record DadosCadastroEntregador(
        String nome,
        String sobrenome,
        LocalDateTime dataNascimento,
        DadosCadastroEndereco endereco
) {
}
