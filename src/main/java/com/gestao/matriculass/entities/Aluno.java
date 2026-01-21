package com.gestao.matriculass.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aluno")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Um aluno pode ter várias matrículas
    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)

    private List<Matricula> matriculas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }
}
