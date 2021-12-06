package Report;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class MonthlyReport extends Report {
    private Year rokRaportu;
    private Month miesiacRaportu;

    public MonthlyReport(Year rokRaportu, Month miesiacRaportu) {
        this.rokRaportu = rokRaportu;
        this.miesiacRaportu = miesiacRaportu;
        super.dataGeneracjiRaportu = LocalDate.now();
    }

    @Override
    protected void generujRaport() { }

    @Override
    public String getOkresRaportu() { return ("Rok: " + rokRaportu + " | Miesiac: " + miesiacRaportu); }
}
