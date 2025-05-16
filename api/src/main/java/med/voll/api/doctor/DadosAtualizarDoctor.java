package med.voll.api.doctor;

import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizarDoctor(Long id, String telefone, String name, String email, DadosEndereco enderecoParametro) {
}
