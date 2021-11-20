import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;


public class main {


    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd.M.yyyy");
        Dokumenty d = null;
        try {
            d = new Dokumenty((formatter.parse("25.04.2020")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        d.wyswietl();


    }
}