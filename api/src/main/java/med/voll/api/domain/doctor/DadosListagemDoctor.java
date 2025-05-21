package med.voll.api.domain.doctor;

public record DadosListagemDoctor(Long id, String name, String email, String crm, Especialidade especialidade) {

    public DadosListagemDoctor(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getEspecialidade());
    }
}
