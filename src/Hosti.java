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

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (" + datumNarozeni+")";
    }
}
