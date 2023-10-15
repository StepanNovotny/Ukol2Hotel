import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Hosti {
    String jmeno;
    String prijmeni;
    LocalDate datumNarozeni;

    public Hosti(String jmeno, String prijmeni, LocalDate datumNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.datumNarozeni = datumNarozeni;
    }
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (" + datumNarozeni+")";
    }
}
