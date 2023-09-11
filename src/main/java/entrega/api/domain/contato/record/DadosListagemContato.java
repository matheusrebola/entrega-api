package entrega.api.domain.contato.record;

import entrega.api.domain.contato.Contato;

public record DadosListagemContato(
        Long id,
        String telefone,
        boolean wpp,
        String email
) {
    public DadosListagemContato(Contato contato){
        this(
                contato.getId(),
                contato.getTelefone(),
                contato.isWpp(),
                contato.getEmail()
                );
    }
}
