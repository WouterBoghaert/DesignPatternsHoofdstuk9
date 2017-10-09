package be.vdab;
public class FotokopiemachineMain {
    public static void main(String[] args) {
        Fotokopiemachine machine = new Fotokopiemachine("123456789");
        Technieker hans = new Technieker("987654321");
        machine.addObserver(hans);
        machine.neemKopies(6000);
        machine.neemKopies(5000);
    }
    
}
