package Dokumenty;

import Auto.Pojazd;

import java.util.Date;
public class Dokumenty{
    private Date dataUtworzenia;
    private Pojazd pojazd;
public Dokumenty(Date data, Pojazd pojazd){
    this.dataUtworzenia = data;

    this.pojazd = pojazd;
}

public void wyswietl(){
    System.out.println("    " +  dataUtworzenia + "   ");
    pojazd.wyswietl();

}




}

