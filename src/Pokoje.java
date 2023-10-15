import java.math.BigDecimal;

public class Pokoje {

    String cisloPokoje;
    int pocetLuzek;
    BigDecimal cenaZaNoc;
    boolean maBalkon;
    boolean maVyhledNaMore;

    public Pokoje(String cisloPokoje, int pocetLuzek, BigDecimal cenaZaNoc, boolean maBalkon, boolean maVyhledNaMore) {
        this.cisloPokoje = cisloPokoje;
        this.pocetLuzek = pocetLuzek;
        this.cenaZaNoc = cenaZaNoc;
        this.maBalkon = maBalkon;
        this.maVyhledNaMore = maVyhledNaMore;
    }

    @Override
    public String toString() {
        return cisloPokoje;
    }
}
