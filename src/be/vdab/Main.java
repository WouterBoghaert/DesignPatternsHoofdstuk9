package be.vdab;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        Aandeel aandeel = new Aandeel("ORCL");
        Aandeelhouder larry = new Aandeelhouder("Larry");
        Aandeelhouder james = new Aandeelhouder("James");
        aandeel.addObserver(larry);
        aandeel.addObserver(james);
        aandeel.setKoers(BigDecimal.valueOf(39));
        System.out.println();
        aandeel.deleteObserver(james);
        aandeel.setKoers(BigDecimal.valueOf(40));
    }
    
}
