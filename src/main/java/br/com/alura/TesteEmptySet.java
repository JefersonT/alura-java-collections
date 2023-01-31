package br.com.alura;

import java.util.*;

public class TesteEmptySet {

    public static void main(String[] args) {

        // UnsupportedOperationException
        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo"); //o que acontece aqui?
    }

}