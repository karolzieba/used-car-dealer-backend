package Report;

import java.time.LocalDate;
import java.time.Year;

public class YearlyReport extends Report {
    private Year rokRaportu;

    public YearlyReport(Year rokRaportu) {
        this.rokRaportu = rokRaportu;
        super.dataGeneracjiRaportu = LocalDate.now();
    }

    @Override
    protected void generujRaport() { }

    @Override
    public String getOkresRaportu() {
        return ("Rok: " + rokRaportu);
    }
}
