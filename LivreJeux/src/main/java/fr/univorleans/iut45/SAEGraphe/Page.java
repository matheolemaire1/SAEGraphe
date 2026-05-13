package fr.univorleans.iut45.SAEGraphe;

import java.util.ArrayList;
import java.util.List;

public class Page{

    private int numero;
    private String enigme;
    private List<String> reponse;

    public Page(int numero,  String enigme){
        this.numero = numero;
        this.enigme = enigme;
        this.reponse = new ArrayList<>();
    }

    public void setReponse(String choix){
        this.reponse.add(choix);
    }

    public int getNum(){
        return this.numero;
    }

    public String getEnigme(){
        return this.enigme;
    }

    public String afficheEnig(){
        int cpt =0;
        String phr = this.getEnigme();
        phr +="\n";
        for(String i : this.reponse){
        phr += String.valueOf(cpt)+" : "+i+"\n";
        cpt +=1;}
        return phr;
    }
}