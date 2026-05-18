package fr.univorleans.iut45.SAEGraphe;

import java.util.Stack;

public class AlgoPronf {
    Stack<Page> pile;
    Graphe gr;

    public AlgoPronf(Graphe g){
        this.pile = new Stack<>();
        this.gr = g;
    }
}
