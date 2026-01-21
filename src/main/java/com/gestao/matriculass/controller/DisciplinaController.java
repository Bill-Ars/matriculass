package com.gestao.matriculass.controller;

import com.gestao.matriculass.entities.Disciplina;
import com.gestao.matriculass.service.DisciplinaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaService disciplinaService;

    @PostMapping
    public Disciplina criar(@RequestBody Disciplina disciplina) {
        return disciplinaService.criar(disciplina);
    }

    @PutMapping
    public Disciplina atualizar(@RequestBody Disciplina disciplina) {
        return disciplinaService.atualizar(disciplina);
    }

    @GetMapping("/{id}")
    public Disciplina buscar(@PathVariable Long id) {
        return disciplinaService.buscarPorId(id);
    }

    @GetMapping
    public List<Disciplina> listar() {
        return disciplinaService.listarTodas();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        disciplinaService.deletar(id);
    }
}
