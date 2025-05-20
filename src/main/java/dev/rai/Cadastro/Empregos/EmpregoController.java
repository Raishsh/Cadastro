package dev.rai.Cadastro.Empregos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EmpregoController {

    @GetMapping("/emprego")
    public String mostraEmprego(){
        return "Ta aqui seu emprego";
    }

}
