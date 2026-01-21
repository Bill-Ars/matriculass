package com.gestao.matriculass.service;

import com.gestao.matriculass.entities.Disciplina;
import com.gestao.matriculass.repository.DisciplinaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisciplinaService {

    @Autowired
    private DisciplinaRepo DisciplinaRepo;

    public Disciplina criar(Disciplina Disciplina) {
        return DisciplinaRepo.save(Disciplina);
    }

    public Disciplina atualizar(Disciplina Disciplina) {
        return DisciplinaRepo.save(Disciplina);
    }

    public void deletar(Long id) {
        DisciplinaRepo.deleteById(id);
    }

    public Disciplina buscarPorId(Long id) {
        return DisciplinaRepo.findById(id).orElse(new Disciplina());
    }

    public List<Disciplina> listarTodas() {
        return DisciplinaRepo.findAll();
    }
}
