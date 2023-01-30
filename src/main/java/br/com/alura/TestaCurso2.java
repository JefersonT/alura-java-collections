package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        System.out.println(curso.getAulas());

//        // Forma inadequada, não pode alterar uma lista com um get, apenas visualizar
//        curso.getAulas().add(new Aula("TESTE Trabalhando com Arrylist", 50));

        curso.adiciona(new Aula("Trabalhando com Arrylist", 21));
        curso.adiciona(new Aula("Criando Aula", 20));
        curso.adiciona(new Aula("Modelando com coleções", 22));

        List<Aula> aulasImutaveis = curso.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(curso);
    }
}
