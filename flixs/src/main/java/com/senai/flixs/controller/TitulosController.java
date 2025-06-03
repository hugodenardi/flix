package com.senai.flixs.controller;

import com.senai.flixs.model.Titulos;
import com.senai.flixs.service.TitulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/titulos")
public class TitulosController {

    @Autowired
    private final TitulosService titulosService;

    public TitulosController(TitulosService titulosService) {
        this.titulosService = titulosService;
    }

    @GetMapping
    public List<Titulos> buscarTitulos(){
        return titulosService.buscarTitulos();
    }

    @PostMapping
    public Titulos gravarTitulo(@RequestBody Titulos titulos) {
        return titulosService.salvarTitulo(titulos);
    }

    @PutMapping ("/{id}")
    public Titulos atualizarTitulo(@RequestBody Titulos novoTitulo, @PathVariable Long id) {
        return titulosService.atualizarTitulos(novoTitulo, id);
    }
    public record AtualizarAssistidoDto(boolean jaAssistiu){

    }
    @PutMapping ("/{id}/assistiu")
    public Titulos atualizarJaAssistiu(@RequestBody AtualizarAssistidoDto dto, @PathVariable Long id) {

        return titulosService.atualizarJaAssistiu(dto.jaAssistiu(), id);
    }

    @DeleteMapping ("/{id}")
    public String deletarFilme(@PathVariable Long id) {
        titulosService.deletarTitulos(id);
        return "Título deletado com sucesso";
    }
}
