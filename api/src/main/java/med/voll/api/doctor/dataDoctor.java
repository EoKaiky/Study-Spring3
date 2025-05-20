package med.voll.api.doctor;

import med.voll.api.endereco.Endereco;

public record dataDoctor (Long id, String name, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco){

    public dataDoctor(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getTelefone(), doctor.getEspecialidade(), doctor.getEndereco());
    }
}
