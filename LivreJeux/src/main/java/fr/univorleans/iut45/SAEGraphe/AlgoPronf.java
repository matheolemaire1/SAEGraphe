package fr.univorleans.iut45.SAEGraphe;

import java.util.List;
import java.util.Stack;

public class AlgoPronf {
    Stack<Page> pile;
    Graphe gr;

    public AlgoPronf(Graphe g){
        this.pile = new Stack<>();
        this.gr = g;
    }

     public boolean start(){
        Page prem = gr.premierePage();
        List<Page> noeudsuiv = gr.successorListOf(prem);
        for(Page p : ){
            pile.push(p);}
        
        while(!pile.isEmpty()){
            Page suiv = pile.pop();
            suiv.lecture();
            System.out.println("La page n° "+suiv.getNum()+" est lu !");
            for(Page p : gr.getGraphe().successorListOf(suiv)){
                if(!p.estLu()){
            pile.push(p);}}
        }
    }
}
