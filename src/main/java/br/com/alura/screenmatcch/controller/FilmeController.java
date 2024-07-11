package br.com.alura.screenmatcch.controller;

import br.com.alura.screenmatcch.domain.filme.DadosCadastroFilme;
import br.com.alura.screenmatcch.domain.filme.Filme;
import br.com.alura.screenmatcch.domain.filme.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired 
    private FilmeRepository repository;

    @GetMapping("/formulario")
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

    @GetMapping
    public String carregaPaginaListagem(Model model) {
        model.addAttribute("lista", repository.findAll());
        return "filmes/listagem";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados) {
        var filme = new Filme(dados);
        repository.save(filme);
        return "redirect:/filmes"; //Vai redirecionar e automaticamente chamar a função carregaPaginaListagem
    }

    @DeleteMapping
    public String removeFilme() {
        System.out.println("Filme Excluido!");
        return "redirect:/filmes";
    }

}
