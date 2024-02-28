// Entidade Livro
public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // getters e setters
}

// Entidade Pessoa
public class Pessoa {
    private String nome;
    private String cpf;

    // getters e setters
}

// Entidades relacionadas à universidade
public class Aluno {
    private String matricula;
    private String nome;

    // getters e setters
}

public class Universidade {
    private String nome;
    private String endereco;

    // getters e setters
}

public class Professor {
    private String nome;
    private String departamento;

    // getters e setters
}

public class Disciplina {
    private String nome;
    private Professor professor;

    // getters e setters
}

// Entidades Animal e Cachorro
public class Animal {
    private int id;
    private String tipo;
    private String habitat;

    // getters e setters
}

public class Cachorro extends Animal {
    private String nome;
    private String raca;
    private int idade;

    // getters e setters
}