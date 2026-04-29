package fr.univorleans.iut45.SAEGraphe;

public class Page{

    private int numero;
    private boolean fin;
    private String texte;
    private String enigme;

    public Page(int numero, boolean fin, String texte, String enigme){
        this.numero = numero;
        this.fin = fin ;
        this.texte = texte;
        this.enigme = enigme;
    }
    public int getNum(){
        return this.numero;
    }
    public boolean getFin(){
        return this.fin;
    }
}