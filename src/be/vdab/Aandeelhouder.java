package be.vdab;
import java.util.Observable;
import java.util.Observer;
public class Aandeelhouder implements Observer {
    private final String voornaam;
    public Aandeelhouder(String voornaam){
        this.voornaam = voornaam;
    }
    @Override
    public void update(Observable observable, Object argument){
        if(!(observable instanceof Aandeel)){
            throw new IllegalArgumentException();
        }
        Aandeel aandeel = (Aandeel) observable;
        System.out.println(
            voornaam + " reageert op de nieuwe koers van " +
                    aandeel.getCode() + ": " + aandeel.getKoers());
    }
}
