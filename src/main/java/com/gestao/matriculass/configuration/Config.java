package com.gestao.matriculass.configuration;

import com.gestao.matriculass.entities.Aluno;
import com.gestao.matriculass.entities.Disciplina;
import com.gestao.matriculass.entities.Matricula;
import com.gestao.matriculass.repository.AlunoRepo;
import com.gestao.matriculass.repository.DisciplinaRepo;
import com.gestao.matriculass.repository.MatriculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test") // Só carrega esta configuração se o profile "test" estiver ativo
public class Config implements CommandLineRunner {

    @Autowired
    private AlunoRepo alunoRepo;

    @Autowired
    private DisciplinaRepo disciplinaRepo;

    @Autowired
    private MatriculaRepo matriculaRepo;

    @Override
    public void run(String... args) throws Exception {
        // Criando Alunos
        Aluno a1 = new Aluno("Carlos");
        Aluno a2 = new Aluno("Ana");
        Aluno a3 = new Aluno("Bill");

        alunoRepo.save(a1);
        alunoRepo.save(a2);
        alunoRepo.save(a3);

        // Criando Disciplinas
        Disciplina d1 = new Disciplina("Matemática");
        Disciplina d2 = new Disciplina("Programação");
        Disciplina d3 = new Disciplina("Física");

        disciplinaRepo.save(d1);
        disciplinaRepo.save(d2);
        disciplinaRepo.save(d3);

        // Criando Matrículas
        Matricula m1 = new Matricula(a1, d1, 2026, "1");
        Matricula m2 = new Matricula(a2, d2, 2026, "1");
        Matricula m3 = new Matricula(a3, d3, 2026, "1");
        Matricula m4 = new Matricula(a1, d2, 2026, "1"); // aluno 1 também na disciplina 2

        matriculaRepo.save(m1);
        matriculaRepo.save(m2);
        matriculaRepo.save(m3);
        matriculaRepo.save(m4);
    }
}
