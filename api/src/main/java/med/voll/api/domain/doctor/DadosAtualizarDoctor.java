package med.voll.api.domain.doctor;

import med.voll.api.domain.endereco.DadosEndereco;

public record DadosAtualizarDoctor(Long id, String telefone, String name, String email, DadosEndereco enderecoParametro) {
}
