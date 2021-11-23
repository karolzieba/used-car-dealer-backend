package Raport;

import java.time.LocalDate;

public abstract class Raport {
    protected LocalDate dataGeneracjiRaportu;
    protected int numerRaportu;
    protected int przychod;
    protected int koszty;
    protected int zysk;

    protected abstract void generujRaport();
    public abstract String getOkresRaportu();

    public LocalDate getDataGeneracjiRaportu() {
        return dataGeneracjiRaportu;
    }

    public int getNumerRaportu() {
        return numerRaportu;
    }

    public int getPrzychod() {
        return przychod;
    }

    public int getKoszty() {
        return koszty;
    }

    public int getZysk() {
        return zysk;
    }
}
