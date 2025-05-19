package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.doctor.*;
import med.voll.api.endereco.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroDoctor dados){
        repository.save(new Doctor(dados));
    }

    @GetMapping
    public Page<DadosListagemDoctor> listar(@PageableDefault(size = 10, sort = {"name"}) Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemDoctor::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarDoctor dados){
        var doctor = repository.getReferenceById(dados.id());
        doctor.atualizarInformacoes(dados);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var doctor = repository.getReferenceById(id);
        doctor.excluir();
    }
}