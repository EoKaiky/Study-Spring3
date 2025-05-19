package med.voll.api.doctor;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.*;
import med.voll.api.endereco.Endereco;

@Table(name = "tb_doctors")
@Entity(name = "Doctors")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String telefone;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Doctor(DadosCadastroDoctor dados) {
        this.ativo = true;
        this.name = dados.name();
        this.email = dados.email();
        this.telefone = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    public void atualizarInformacoes(@Valid DadosAtualizarDoctor dados) {

        if(dados.name() != null){
        this.name = dados.name();
        }

        if(dados.telefone() != null){
            this.telefone = dados.telefone();
        }

        if(dados.email() != null){
            this.email = dados.email();
        }

        if(dados.enderecoParametro() != null){
            this.endereco.atualizarInformacoes(dados.enderecoParametro());
        }
    }

    public void excluir() {
        this.ativo = false;
    }
}
