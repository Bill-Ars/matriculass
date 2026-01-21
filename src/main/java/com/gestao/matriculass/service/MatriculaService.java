package com.gestao.matriculass.service;

import com.gestao.matriculass.entities.Matricula;
import com.gestao.matriculass.entities.Aluno;
import com.gestao.matriculass.entities.Disciplina;
import com.gestao.matriculass.repository.MatriculaRepo;
import com.gestao.matriculass.repository.AlunoRepo;
import com.gestao.matriculass.repository.DisciplinaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaService {

    @Autowired
    private MatriculaRepo matriculaRepo;

    @Autowired
    private AlunoRepo alunoRepo;

    @Autowired
    private DisciplinaRepo disciplinaRepo;

    // Criar matrícula
    public Matricula criar(Matricula matricula) {
        return matriculaRepo.save(matricula);
    }

    // Atualizar matrícula
    public Matricula atualizar(Matricula matriculaAtualizada) {
        Matricula existente = matriculaRepo.findById(matriculaAtualizada.getId())
                .orElseThrow(() -> new RuntimeException("Matrícula não encontrada"));
        existente.setAluno(matriculaAtualizada.getAluno());
        existente.setDisciplina(matriculaAtualizada.getDisciplina());
        existente.setAno(matriculaAtualizada.getAno());
        existente.setSemestre(matriculaAtualizada.getSemestre());
        return matriculaRepo.save(existente);
    }

    // Deletar matrícula
    public void deletar(Long id) {
        matriculaRepo.deleteById(id);
    }

    // Buscar matrícula por ID
    public Matricula buscarPorId(Long id) {
        return matriculaRepo.findById(id).orElseThrow(() -> new RuntimeException("Matrícula não encontrada"));
    }

    // Listar todas as matrículas
    public List<Matricula> listarTodos() {
        return matriculaRepo.findAll();
    }

    // Listar matrículas de um aluno
    public List<Matricula> listarPorAluno(Long alunoId) {
        Aluno aluno = alunoRepo.findById(alunoId).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
        return matriculaRepo.findAll()
                .stream()
                .filter(m -> m.getAluno().getId().equals(alunoId))
                .toList();
    }

    // Listar matrículas de uma disciplina
    public List<Matricula> listarPorDisciplina(Long disciplinaId) {
        Disciplina disciplina = disciplinaRepo.findById(disciplinaId).orElseThrow(() -> new RuntimeException("Disciplina não encontrada"));
        return matriculaRepo.findAll()
                .stream()
                .filter(m -> m.getDisciplina().getId().equals(disciplinaId))
                .toList();
    }
}
