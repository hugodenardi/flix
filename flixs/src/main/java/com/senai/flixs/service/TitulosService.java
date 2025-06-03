package com.senai.flixs.service;

import com.senai.flixs.model.Titulos;
import com.senai.flixs.repository.TitulosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
public class TitulosService {
    private final TitulosRepository titulosrepository;
    @Autowired
    public TitulosService(TitulosRepository titulosrepository) {
        this.titulosrepository = titulosrepository;
    }


    public Titulos salvarTitulo(Titulos titulo) {
        titulosrepository.save(titulo);
        return titulo;
    }

    public List<Titulos> buscarTitulos() {
        return titulosrepository.findAll();

    }
    public Titulos atualizarTitulos(Titulos novoTitulo, Long id){
        Titulos titulo = titulosrepository.findById(id).orElseThrow(()->
            new RuntimeException("Não encontrado")
        );
        BeanUtils.copyProperties(novoTitulo, titulo);
        return titulosrepository.save(titulo);
    }
    public Titulos atualizarJaAssistiu(boolean jaAssistiu, Long id){
        Titulos titulo = titulosrepository.findById(id).orElseThrow(()->
                new RuntimeException("Não encontrado")
        );
        titulo.setJaAssistiu(jaAssistiu);
        return titulosrepository.save(titulo);
    }
    public void deletarTitulos(Long id) {
        Titulos titulo = titulosrepository.findById(id).orElseThrow(() ->
                new RuntimeException("Não encontrado")
        );
        titulosrepository.deleteById(id);

    }

}
