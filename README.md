Matriculass

Sistema de gestão acadêmica desenvolvido com **Spring Boot**. Permite o gerenciamento de alunos, disciplinas e **matrículas** com operações de CRUD. O projeto utiliza **H2** como banco de dados em memória, facilitando testes e desenvolvimento rápido.

---

Tecnologias utilizadas

- Java 21  
- Spring Boot 4.x  
- Spring Data JPA  
- H2 Database (em memória)  
- Lombok  
- Maven/Gradle  
- REST API  

---

Funcionalidades

1. **Alunos**
   - Criar, listar, atualizar e deletar alunos
   - Buscar aluno por ID

2. **Disciplinas**
   - Criar, listar, atualizar e deletar disciplinas
   - Buscar disciplina por ID

3. **Matrículas**
   - Criar, listar, atualizar e deletar matrículas
   - Listar matrículas de um aluno específico
   - Listar matrículas de uma disciplina específica

4. **Console H2**
   - Habilitado em `/h2-console` para visualizar dados diretamente no navegador

---

## Endpoints disponíveis

### Alunos
- `GET /alunos` → Lista todos os alunos  
- `GET /alunos/{id}` → Busca aluno por ID  
- `POST /alunos` → Cria um novo aluno  
- `PUT /alunos` → Atualiza um aluno  
- `DELETE /alunos/{id}` → Deleta um aluno  

### Disciplinas
- `GET /disciplinas` → Lista todas as disciplinas  
- `GET /disciplinas/{id}` → Busca disciplina por ID  
- `POST /disciplinas` → Cria uma nova disciplina  
- `PUT /disciplinas` → Atualiza uma disciplina  
- `DELETE /disciplinas/{id}` → Deleta uma disciplina  

### Matrículas
- `GET /matriculas` → Lista todas as matrículas  
- `GET /matriculas/{id}` → Busca matrícula por ID  
- `POST /matriculas` → Cria uma nova matrícula  
- `PUT /matriculas` → Atualiza uma matrícula  
- `DELETE /matriculas/{id}` → Deleta uma matrícula  
- `GET /matriculas/aluno/{alunoId}` → Lista matrículas de um aluno  
- `GET /matriculas/disciplina/{disciplinaId}` → Lista matrículas de uma disciplina  

---

com.gestao.matriculass
│
├─ configuration → Configuração inicial (dados de teste)
├─ controller → REST Controllers
├─ entities → Classes de entidade JPA
├─ repository → Interfaces de acesso ao banco
└─ service → Lógica de negócio


Autor
Bill Arsénio Ndayisaba




