package com.gestao.matriculass.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "matricula")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Muitas matrículas → um aluno
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    // Muitas matrículas → uma disciplina
    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private Disciplina disciplina;

    private Integer ano;
    private String semestre;

    public Matricula(Aluno aluno, Disciplina disciplina, Integer ano, String semestre) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
    }
}
