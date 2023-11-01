import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MangementRezervaci {
    List<Rezervace> listRezervaci = new ArrayList<>();


    public List<Rezervace> getListRezervaci() {
        return listRezervaci;
    }

    public void zalozitRezervaci(Pokoje pokoj, LocalDate datumOd, LocalDate datumDo, boolean pracovniDovolena,Host...hosti){
        Rezervace rezervace = new Rezervace(pokoj, datumOd, datumDo, pracovniDovolena,hosti);
        listRezervaci.add(rezervace);
    }
    public void zalozitRezervaci(Host host , Pokoje pokoj, LocalDate datumOd, LocalDate datumDo, boolean pracovniDovolena){
        Rezervace rezervace = new Rezervace(host ,pokoj, datumOd, datumDo, pracovniDovolena);
        listRezervaci.add(rezervace);
    }

    public Rezervace getRezervace(int index){
        return listRezervaci.get(index);
    }

    public List<Rezervace> getRezervace(){
        return listRezervaci;
    }

    public void vymazaRezervace(){
        listRezervaci.clear();
    }

    public int getPocetPracovnichRezervaci(){
        int pocetSluzebnichRezervaci =0;
        for (Rezervace rezervace : listRezervaci) {
            if(rezervace.isPracovniDovolena()){
                pocetSluzebnichRezervaci++;
            }
        }
        return pocetSluzebnichRezervaci;
    }

    public int getPrumernyPocetHostu(){

        return getPocetHostu()/listRezervaci.size();
    }

    public int getPocetHostu(){
        int pocetHostu=0;
        for (Rezervace rezervace :listRezervaci) {
            if(rezervace.getListHostu().isEmpty()){
                pocetHostu++;
            }else{
                pocetHostu+=rezervace.getListHostu().size();
            }
        }
        return pocetHostu;
    }

    public List<Rezervace> vypsatRekreacniRezervace(int pocetRezervaci){
        List<Rezervace> rekreacniRezervaceList = new ArrayList<>();
        int pocetRekreacnichRezervaci =0;
        for (Rezervace rezervace:listRezervaci) {
            if(!rezervace.isPracovniDovolena()){
                rekreacniRezervaceList.add(rezervace);
                pocetRekreacnichRezervaci++;
            }
            if(pocetRekreacnichRezervaci==pocetRezervaci){
                break;
            }
        }
        return rekreacniRezervaceList;
    }








}
