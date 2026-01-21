package com.gestao.matriculass.repository;

import com.gestao.matriculass.entities.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatriculaRepo extends JpaRepository<Matricula, Long> {

    List<Matricula> findByAlunoId(Long alunoId);

    List<Matricula> findByDisciplinaId(Long disciplinaId);
}
