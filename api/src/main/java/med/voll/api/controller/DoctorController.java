package med.voll.api.controller;

import med.voll.api.doctor.DadosCadastroDoctor;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRepository;
import med.voll.api.endereco.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroDoctor dados){
        repository.save(new Doctor(dados));
    }

}
