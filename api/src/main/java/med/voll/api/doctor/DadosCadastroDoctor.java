package med.voll.api.doctor;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroDoctor(String name, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
