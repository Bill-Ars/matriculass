package com.gestao.matriculass.controller;

import com.gestao.matriculass.entities.Aluno;
import com.gestao.matriculass.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public Aluno criar(@RequestBody Aluno aluno) {
        return alunoService.criar(aluno);
    }

    @PutMapping
    public Aluno atualizar(@RequestBody Aluno aluno) {
        return alunoService.atualizar(aluno);
    }

    @GetMapping("/{id}")
    public Aluno buscar(@PathVariable Long id) {
        return alunoService.buscarPorId(id);
    }

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listarTodos();
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }
}
