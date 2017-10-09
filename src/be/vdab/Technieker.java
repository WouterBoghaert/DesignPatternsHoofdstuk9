package be.vdab;

import java.util.Observable;
import java.util.Observer;

public class Technieker implements Observer {
    private final String personeelsnummer;
    
    public Technieker(String personeelsnummer){
        if (personeelsnummer != null && !personeelsnummer.trim().isEmpty()){
            this.personeelsnummer = personeelsnummer;
        }
        else {
            throw new IllegalArgumentException("Personeelsnummer moet ingevuld zijn!");
        }
    }
    
    @Override
    public void update(Observable observable, Object argument){
        if (!(observable instanceof Fotokopiemachine)){
            throw new IllegalArgumentException();
        }
        Fotokopiemachine fotokopiemachine = (Fotokopiemachine) observable;
        System.out.println("Technieker " + personeelsnummer + " reageert op "
                + "de onderhoudsaanvraag van fotokopiemachine " + fotokopiemachine.getSerienummer());
    }
}
