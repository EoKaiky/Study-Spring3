package med.voll.api.controller;

import med.voll.api.doctor.DadosCadastroDoctor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroDoctor dados){

        System.out.println(dados);
    }

}
