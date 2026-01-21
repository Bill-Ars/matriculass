package com.gestao.matriculass.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "disciplina")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "disciplina", cascade = CascadeType.ALL)
    private List<Matricula> matriculas = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }
}
