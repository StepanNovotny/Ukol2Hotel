import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class Host {
    private String jmeno;
    private String prijmeni;
    private LocalDate datumNarozeni;

    public Host(String jmeno, String prijmeni, LocalDate datumNarozeni) {
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

//    SimpleDateFormat formatter = new SimpleDateFormat("dd.MMMM.yyyy");
    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (" + datumNarozeni+")";
    }
}
