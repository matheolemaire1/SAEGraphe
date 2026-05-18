package fr.univorleans.iut45.SAEGraphe;

public class PageNotFoundException extends RuntimeException{
    
    public PageNotFoundException(){
        super();
    }

    public PageNotFoundException(String message) {
        super(message);
    }
}
