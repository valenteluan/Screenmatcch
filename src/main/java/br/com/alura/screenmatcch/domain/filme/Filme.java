package br.com.alura.screenmatcch.domain.filme;

import jakarta.persistence.*;

@Entity
@Table(name="filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer duracaoEmMinutos;
    private Integer anoLancamento;
    private String genero;

    public Filme() {
    }

    public Filme(DadosCadastroFilme dados) {
        this.nome = dados.nome();
        this.duracaoEmMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void atualizaDados(DadosAteracaoFilme dados) {
        this.nome = dados.nome();
        this.anoLancamento = dados.ano();
        this.duracaoEmMinutos = dados.duracao();
        this.genero = dados.genero();
    }
}
