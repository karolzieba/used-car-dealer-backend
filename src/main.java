import Auto.Pojazd;
import Dokumenty.Dokumenty;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class main {


    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.M.yyyy");
        Pojazd p = new Pojazd("12344",1999,"Audi");

        try {
            Dokumenty d = new Dokumenty((formatter.parse("25.04.2020")), p);
            d.wyswietl();
        } catch (ParseException e) {
            e.printStackTrace();
        }




    }
}