package com.senai.flixs.model;

import jakarta.persistence.*;

@Entity
public class Titulos {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    @Enumerated(EnumType.STRING)
    private TipoTitulos tipo;
    private int anoLancamento;
    private boolean jaAssistiu;
    private double avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public TipoTitulos getTipo() {
        return tipo;
    }

    public void setTipo(TipoTitulos tipo) {
        this.tipo = tipo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isJaAssistiu() {
        return jaAssistiu;
    }

    public void setJaAssistiu(boolean jaAssistiu) {
        this.jaAssistiu = jaAssistiu;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
    }
}
