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

    public String getCisloPokoje() {
        return cisloPokoje;
    }

    public int getPocetLuzek() {
        return pocetLuzek;
    }

    public BigDecimal getCenaZaNoc() {
        return cenaZaNoc;
    }

    public boolean isMaBalkon() {
        return maBalkon;
    }

    public boolean isMaVyhledNaMore() {
        return maVyhledNaMore;
    }

    public void setCisloPokoje(String cisloPokoje) {
        this.cisloPokoje = cisloPokoje;
    }

    public void setPocetLuzek(int pocetLuzek) {
        this.pocetLuzek = pocetLuzek;
    }

    public void setCenaZaNoc(BigDecimal cenaZaNoc) {
        this.cenaZaNoc = cenaZaNoc;
    }

    public void setMaBalkon(boolean maBalkon) {
        this.maBalkon = maBalkon;
    }

    public void setMaVyhledNaMore(boolean maVyhledNaMore) {
        this.maVyhledNaMore = maVyhledNaMore;
    }

    @Override
    public String toString() {
        return  cisloPokoje +
                "\nPočet lůžek: " + pocetLuzek +
                "\nCena za noc: " + cenaZaNoc +
                "\nBalkón: " + maBalkon +
                "\nVýhled na moře: " + maVyhledNaMore;
    }
}
