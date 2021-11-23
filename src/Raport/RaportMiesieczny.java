package Raport;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class RaportMiesieczny extends Raport {
    private Year rokRaportu;
    private Month miesiacRaportu;

    public RaportMiesieczny(Year rokRaportu, Month miesiacRaportu) {
        this.rokRaportu = rokRaportu;
        this.miesiacRaportu = miesiacRaportu;
        super.dataGeneracjiRaportu = LocalDate.now();
    }

    @Override
    protected void generujRaport() { }

    @Override
    public String getOkresRaportu() { return ("Rok: " + rokRaportu + " | Miesiac: " + miesiacRaportu); }
}
