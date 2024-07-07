package br.com.alura.screenmatcch.controller;

import br.com.alura.screenmatcch.domain.filme.DadosCadastroFilme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados) {
        System.out.println(dados);
        return "filmes/formulario";
    }

}
