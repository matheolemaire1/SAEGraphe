package fr.univorleans.iut45.SAEGraphe;

import java.util.ArrayList;
import java.util.List;

public class Page{

    private int numero;
    private String enigme;
    private List<String> reponse;
    private boolean lecture;

    public Page(int numero,  String enigme){
        this.numero = numero;
        this.enigme = enigme;
        this.reponse = new ArrayList<>();
        this.lecture = false;
    }

    public Page(int numero,  String enigme,List<String> rep){
        this.numero = numero;
        this.enigme = enigme;
        this.reponse = rep;
        this.lecture = false;
    }

    public void setReponse(String choix){
        this.reponse.add(choix);
    }

    public int getNum(){
        return this.numero;
    }

    public String getTexte(){
        return this.enigme;
    }

    public boolean estLue(){
        return this.lecture;
    }

    public void lire(){
        this.lecture = true;
    }
    
    public String afficheEnig(){
        int cpt =0;
        String phr = this.getTexte();
        phr +="\n";
        for(String i : this.reponse){
        phr += String.valueOf(cpt)+" : "+i+"\n";
        cpt +=1;}
        return phr;
    }
}