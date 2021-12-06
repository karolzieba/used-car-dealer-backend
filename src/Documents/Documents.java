package Documents;

import Car.Vehicle;

import java.util.Date;

public class Documents {
    private Date dataUtworzenia;
    private Vehicle pojazd;

    public Documents(Date data, Vehicle pojazd) {
        this.dataUtworzenia = data;
        this.pojazd = pojazd;
    }

    public void wyswietl() {
        System.out.println("    " +  dataUtworzenia + "   ");
        pojazd.wyswietl();
    }

    public Date getDataUtworzenia() {
        return dataUtworzenia;
    }

    public void setDataUtworzenia(Date dataUtworzenia) {
        this.dataUtworzenia = dataUtworzenia;
    }

    public Vehicle getPojazd() {
        return pojazd;
    }

    public void setPojazd(Vehicle pojazd) {
        this.pojazd = pojazd;
    }
}

