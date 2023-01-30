package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        // Forma errada, pois permite a edição da lista
//        return aulas;

        //forma correta, pois permite apenas a leitura da lista
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    public int getTempoTotal(){
        int tempoTotal = 0;
        return aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso:" +
                "Nome='" + nome + '\'' +
                ", Instrutor='" + instrutor + '\'' +
                ", Aulas=" + aulas +
                ", Tempo Total='" + getTempoTotal() + " min" + '\'' +
                ']';
    }
}
