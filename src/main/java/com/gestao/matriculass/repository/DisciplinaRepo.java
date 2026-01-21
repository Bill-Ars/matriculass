package com.gestao.matriculass.repository;

import com.gestao.matriculass.entities.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepo extends JpaRepository<Disciplina, Long> {
}
