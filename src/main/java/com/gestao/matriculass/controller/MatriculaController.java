package com.gestao.matriculass.controller;

import com.gestao.matriculass.entities.Matricula;
import com.gestao.matriculass.service.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaService matriculaService;

    @PostMapping
    public Matricula criar(@RequestBody Matricula matricula) {
        return matriculaService.criar(matricula);
    }

    @PutMapping
    public Matricula atualizar(@RequestBody Matricula matricula) {
        return matriculaService.atualizar(matricula);
    }

    @GetMapping("/{id}")
    public Matricula buscar(@PathVariable Long id) {
        return matriculaService.buscarPorId(id);
    }

    @GetMapping
    public List<Matricula> listar() {
        return matriculaService.listarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        matriculaService.deletar(id);
    }

    @GetMapping("/aluno/{alunoId}")
    public List<Matricula> listarPorAluno(@PathVariable Long alunoId) {
        return matriculaService.listarPorAluno(alunoId);
    }

    @GetMapping("/disciplina/{disciplinaId}")
    public List<Matricula> listarPorDisciplina(@PathVariable Long disciplinaId) {
        return matriculaService.listarPorDisciplina(disciplinaId);
    }
}
