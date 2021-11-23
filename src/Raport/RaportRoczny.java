package Raport;

import java.time.LocalDate;
import java.time.Year;

public class RaportRoczny extends Raport {
    private Year rokRaportu;

    public RaportRoczny(Year rokRaportu) {
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
