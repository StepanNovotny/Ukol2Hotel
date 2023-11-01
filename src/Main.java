import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Host karel = new Host("Karel","Dvařák", LocalDate.of(1990,5,26));
    public static Host karel2 = new Host("Karel","Dvařák", LocalDate.of(1979,1,6));
    public static Host karolina = new Host("Karolína","Tmavá", LocalDate.of(1981,3,15));
    public static Pokoje pokoj1 = new Pokoje("Pokoj č. 1", 1, BigDecimal.valueOf(1000),true,true);
    public static Pokoje pokoj2 = new Pokoje("Pokoj č. 2", 1, BigDecimal.valueOf(1000),true,true);
    public static Pokoje pokoj3 = new Pokoje("Pokoj č. 3", 3, BigDecimal.valueOf(2400),false,true);
    public static MangementRezervaci mangementRezervaci = new MangementRezervaci();
    public static void zapsatRezervace(){

        int denOd = 1;
        int denDo = 2;
        mangementRezervaci.zalozitRezervaci(pokoj3,LocalDate.of(2022,2,1),LocalDate.of(2022,2,4),false,karel,karel2);
        for (int i = 0; i < 10; i++) {
            mangementRezervaci.zalozitRezervaci(pokoj3,LocalDate.of(2022,2,denOd),LocalDate.of(2022,2,denDo),true,karel,karel2,karolina);
            denOd+=2;
            denDo+=2;
        }


        denOd = 1;
        denDo = 2;
        for (int i = 0; i < 8; i++) {
            mangementRezervaci.zalozitRezervaci(karolina,pokoj1,LocalDate.of(2023,8,denOd),LocalDate.of(2023,8,denDo),false);
            denOd+=2;
            denDo+=2;
        }
        mangementRezervaci.zalozitRezervaci(pokoj3,LocalDate.of(2023,5,1),LocalDate.of(2023,5,7),false,karel,karolina);
        mangementRezervaci.zalozitRezervaci(karel,pokoj3,LocalDate.of(2023,6,1),LocalDate.of(2023,6,7),true);
        mangementRezervaci.zalozitRezervaci(karel2,pokoj2,LocalDate.of(2023,7,18),LocalDate.of(2023,7,21),false);
        mangementRezervaci.zalozitRezervaci(karolina,pokoj3,LocalDate.of(2023,8,1),LocalDate.of(2023,8,31),false);
    }
    public static void vypsatStatistikyHostu(){
        int jedenHost=0;
        int dvaHosti=0;
        int viceNezDvaHosti=0;
        for (Rezervace rezervace : mangementRezervaci.getListRezervaci()) {
            if (rezervace.getListHostu()==null||rezervace.getListHostu().isEmpty()){
                jedenHost++;
            } else if (rezervace.getListHostu().size()==2) {
                dvaHosti++;
            }else{
                viceNezDvaHosti++;
            }

        }
        System.out.println("\nPočet rezervací s jedním hostem: "+jedenHost+"\nPočet rezervací se dvěma hosty: "+dvaHosti+"\nPočet rezervací s více něž dvěma hosty: "+viceNezDvaHosti);
    }
    public static void vypsatRezervace(){
        System.out.println(mangementRezervaci.getListRezervaci());
    }
    public static void main(String[] args) {

        zapsatRezervace();
        vypsatRezervace();
        System.out.println("Počet služebních rezervací: " + mangementRezervaci.getPocetPracovnichRezervaci());
        System.out.println("Počet hostů: "+ mangementRezervaci.getPocetHostu());
        System.out.println("Průměrný počet hostů na pokoj: " +mangementRezervaci.getPrumernyPocetHostu());

        System.out.println("Vypsání prvních 8 rekreačních rezervací:"+mangementRezervaci.vypsatRekreacniRezervace(8));
        vypsatStatistikyHostu();
        System.out.println("Vymazání rezervací: ");
        mangementRezervaci.vymazaRezervace();
        System.out.println("Výpis po vymazání");
        vypsatRezervace();
    }
}