package com.gestao.matriculass.repository;

import com.gestao.matriculass.entities.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepo extends JpaRepository<Aluno, Long> {
}
