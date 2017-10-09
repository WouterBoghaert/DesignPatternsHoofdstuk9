package be.vdab;

import java.util.Observable;

public class Fotokopiemachine extends Observable {
    private final String serienummer;
    private final static int OM_AANTAL_KOPIES_ONDERHOUD = 10000;
    private int aantalKopiesSindsOnderhoud = 0;
    
    public Fotokopiemachine(String serienummer){
        if (serienummer != null && !serienummer.trim().isEmpty()){
            this.serienummer = serienummer;
        }
        else {
            throw new IllegalArgumentException("Serienummer moet ingevuld zijn!");
        }
    }
    
    public void vraagOnderhoud(){
        setChanged();
        notifyObservers();
    }
    
    public void resetNaOnderhoud(){
        aantalKopiesSindsOnderhoud = 0;
    }
    
    public void neemKopies(int aantal){
        if (aantal > 0){
            aantalKopiesSindsOnderhoud += aantal;
            if (aantalKopiesSindsOnderhoud >= OM_AANTAL_KOPIES_ONDERHOUD){
                vraagOnderhoud();
            }
        }
        else {
            throw new IllegalArgumentException("Aantal kopies moet groter dan nul zijn.");
        }
    }
    
    public String getSerienummer(){
        return serienummer;
    }
}
