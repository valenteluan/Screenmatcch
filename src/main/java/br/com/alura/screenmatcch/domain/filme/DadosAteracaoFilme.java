package br.com.alura.screenmatcch.domain.filme;

public record DadosAteracaoFilme(
        Long id,
        String nome,
        Integer duracao,
        Integer ano,
        String genero) {
}
