import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Hosti adela = new Hosti("Adéla","Malíková", LocalDate.of(1993,3,13));
        Hosti jan = new Hosti("Jan","Dvořáček", LocalDate.of(1995,5,5));
        Pokoje pokoj1 = new Pokoje("Pokoj č. 1", 1, BigDecimal.valueOf(1000),true,true);
        Pokoje pokoj2 = new Pokoje("Pokoj č. 2", 1, BigDecimal.valueOf(1000),true,true);
        Pokoje pokoj3 = new Pokoje("Pokoj č. 3", 3, BigDecimal.valueOf(2400),false,true);


        List<Rezervace> listRezervaci = new ArrayList<>();
        List<Hosti> listHostu1 = new ArrayList<>();
        listHostu1.add(adela);

        listRezervaci.add(new Rezervace(listHostu1,pokoj1,LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),false));
        List<Hosti> listHostu2 = new ArrayList<>();
        listHostu2.add(adela);
        listHostu2.add(jan);
        listRezervaci.add(new Rezervace(listHostu2,pokoj3,LocalDate.of(2021,9,1),LocalDate.of(2021,9,14),false));


        System.out.println(adela);
        System.out.println(jan);
        for (Rezervace rezervace:listRezervaci) {
            System.out.println(rezervace);
        }

    }
}