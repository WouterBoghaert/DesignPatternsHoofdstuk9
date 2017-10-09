package be.vdab;
import java.math.BigDecimal;
import java.util.Observable;
public class Aandeel extends Observable {
    private final String code;
    private BigDecimal koers;
    public Aandeel(String code){
        this.code = code;
    }
    public void setKoers(BigDecimal nieuweKoers){
        this.koers = nieuweKoers;
        setChanged();
        notifyObservers();
    }
    public String getCode(){
        return code;
    }
    public BigDecimal getKoers(){
        return koers;
    }    
}
