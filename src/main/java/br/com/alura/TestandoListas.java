package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String curso01 = "Java e Java.io";
        String curso02 = "Java e Java.util";
        String curso03 = "Java Collections";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso01);
        cursos.add(curso02);
        cursos.add(curso03);

        System.out.println(cursos);

        cursos.remove(1);

        System.out.println(cursos);

        System.out.println("Primeiro Curso: " + cursos.get(0));

        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("Aula : " + cursos.get(i));
        }

        System.out.println(cursos);
        Collections.sort(cursos);
        System.out.println(cursos);

    }
}