import java.time.LocalDate;
import java.util.List;

public class Rezervace {
    List<Hosti> listHostu;
    Pokoje pokoj;
    LocalDate datumOd;
    LocalDate datumDo;
    boolean pracovniDovolena;

    public Rezervace(List<Hosti> listHostu,Pokoje pokoj, LocalDate datumOd, LocalDate datumDo, boolean pracovniDovolena) {
        this.listHostu = listHostu;
        this.pokoj =pokoj;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.pracovniDovolena = pracovniDovolena;
    }

    public List<Hosti> getListHostu() {
        return listHostu;
    }

    public Pokoje getPokoj() {
        return pokoj;
    }

    public LocalDate getDatumOd() {
        return datumOd;
    }

    public LocalDate getDatumDo() {
        return datumDo;
    }

    public boolean isPracovniDovolena() {
        return pracovniDovolena;
    }

    public void setListHostu(List<Hosti> listHostu) {
        this.listHostu = listHostu;
    }

    public void setPokoj(Pokoje pokoj) {
        this.pokoj = pokoj;
    }

    public void setDatumOd(LocalDate datumOd) {
        this.datumOd = datumOd;
    }

    public void setDatumDo(LocalDate datumDo) {
        this.datumDo = datumDo;
    }

    public void setPracovniDovolena(boolean pracovniDovolena) {
        this.pracovniDovolena = pracovniDovolena;
    }

    @Override
    public String toString() {
        return "\nHosti: " + listHostu +
                "\n" + pokoj.getCisloPokoje() +
                "\nDatum od: " + datumOd +
                "\nDatum do: " + datumDo +
                "\nPracovni dovolena: " + pracovniDovolena ;
    }

}
