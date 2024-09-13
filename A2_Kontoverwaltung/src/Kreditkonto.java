public class Kreditkonto extends Kontoklasse {
    public Kreditkonto(String kontoinhaber, String bankleitzahl, String kontonummer, double ueberziehungsrahmen, double kontostand) {
        super(kontoinhaber, bankleitzahl, kontonummer, ueberziehungsrahmen, 0, kontostand, "Kreditkonto");
    }
}