package com.gestao.matriculass.service;

import com.gestao.matriculass.entities.Aluno;
import com.gestao.matriculass.repository.AlunoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AlunoService {

    @Autowired
    private AlunoRepo alunoRepo;

    public Aluno criar(Aluno aluno) {
        return alunoRepo.save(aluno);
    }

    public Aluno atualizar(Aluno aluno) {
        return alunoRepo.save(aluno);
    }

    public void deletar(Long id) {
        alunoRepo.deleteById(id);
    }

    public Aluno buscarPorId(Long id) {
        return alunoRepo.findById(id).orElse(new Aluno());
    }

    public List<Aluno> listarTodos() {
        return alunoRepo.findAll();
    }
}


