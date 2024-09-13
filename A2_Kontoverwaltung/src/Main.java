public class Main {
    public static void main(String[] args) {
        // Hardcoded account data
        Girokonto girokonto = new Girokonto("Max Mustermann", "10020030", "1234567890", 500.0, 10.0, 1000.0);
        Sparkonto sparkonto = new Sparkonto("Erika Mustermann", "10020030", "0987654321", 2000.0);
        Kreditkonto kreditkonto = new Kreditkonto("Hans Mustermann", "10020030", "1122334455", 1000.0, 500.0);

        // Perform operations
        girokonto.einzahlen(200.0);
        sparkonto.abheben(100.0);
        kreditkonto.ueberweisen(girokonto, 300.0);

        // Print account statements
        girokonto.kontoauszug();
        sparkonto.kontoauszug();
        kreditkonto.kontoauszug();
    }
}