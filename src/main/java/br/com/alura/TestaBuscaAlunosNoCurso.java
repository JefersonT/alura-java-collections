package br.com.alura;

import java.util.Collections;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        System.out.println(curso.getAulas());

        curso.adiciona(new Aula("Trabalhando com Arrylist", 21));
        curso.adiciona(new Aula("Criando Aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));


        Aluno a1 = new Aluno("Rodrigo Turini", 123456);
        Aluno a2 = new Aluno("Guilherme Silveira", 963852);
        Aluno a3 = new Aluno("Mauricio Aniche", 789456);
        Aluno a4 = new Aluno("Jeferson", 789654);


        curso.matricua(a1);
        curso.matricua(a2);
        curso.matricua(a3);
        curso.matricua(a4);

        System.out.println("Qual o aluno da matricula 789654");
        System.out.println(curso.buscaMatricula(789654));

    }
}
