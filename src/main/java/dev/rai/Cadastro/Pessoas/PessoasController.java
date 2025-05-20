package dev.rai.Cadastro.Pessoas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PessoasController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Hello World";
    }
}
