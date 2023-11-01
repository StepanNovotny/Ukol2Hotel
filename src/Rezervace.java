import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Rezervace {
    private List<Host> listHostu;

    private Host host;
    private Pokoje pokoj;
    private LocalDate datumOd;
    private LocalDate datumDo;
    private boolean pracovniDovolena;

    public Rezervace(Pokoje pokoj, LocalDate datumOd, LocalDate datumDo, boolean pracovniDovolena,Host...hosti) {
        this.listHostu = pridatHosta(hosti);
        this.pokoj =pokoj;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.pracovniDovolena = pracovniDovolena;
    }

    public Rezervace(Host host , Pokoje pokoj, LocalDate datumOd, LocalDate datumDo, boolean pracovniDovolena) {
        this.host = host;
        this.pokoj =pokoj;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
        this.pracovniDovolena = pracovniDovolena;
    }



    public List<Host> getListHostu() {
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

    public void setListHostu(List<Host> listHostu) {
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

    public long getDelkaPobitu(){
        return ChronoUnit.DAYS.between(getDatumOd(),getDatumDo());
    }

    public BigDecimal getCenaRezervace(){
        return BigDecimal.valueOf(getDelkaPobitu()).multiply(getPokoj().getCenaZaNoc());
    }

    public String vypsatHosty(){
        StringBuilder stringBuilder = new StringBuilder();
        if(listHostu==null||listHostu.isEmpty()){
            listHostu = new ArrayList<>();
            return host.toString();
        } else {
            for (Host host:listHostu) {
                stringBuilder.append(host + ", ");

            }
        }
        return stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length()-1).toString();
    }
    public int vypsatPocetHostu(){
        if(listHostu.isEmpty()){
            return 1;
        }
        return listHostu.size();
    }

    public String maVyhledNaMoreAnoNe(){
        return pokoj.isMaVyhledNaMore()?"ano":"ne";
    }

    public List<Host> pridatHosta(Host... novyHosti){
        listHostu = new ArrayList<>();
        for (Host host:novyHosti) {
            listHostu.add(host);
        }
       return listHostu;
    }


//    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");

    @Override
    public String toString() {
        return  "\n"+datumOd +" až "+ datumDo+":" + vypsatHosty() + "["+vypsatPocetHostu()+", "+maVyhledNaMoreAnoNe()+"] za " + getCenaRezervace() + " Kč";
    }




}
