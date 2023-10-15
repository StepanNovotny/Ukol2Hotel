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


    @Override
    public String toString() {
        return "\nHosti: " + listHostu +
                "\nPokoj: " + pokoj +
                "\nDatum od: " + datumOd +
                "\nDatum do: " + datumDo +
                "\nPracovni dovolena: " + pracovniDovolena ;
    }

}
