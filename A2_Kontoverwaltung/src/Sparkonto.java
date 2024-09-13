public class Sparkonto extends Kontoklasse {
    public Sparkonto(String kontoinhaber, String bankleitzahl, String kontonummer, double kontostand) {
        super(kontoinhaber, bankleitzahl, kontonummer, 0, 0, kontostand, "Sparkonto");
    }
}