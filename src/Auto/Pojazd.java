package Auto;

public class Pojazd {
    private String vin;
    private int rok;
    private String marka;

    public Pojazd(String vin, int rok, String marka){
        this.vin=vin;
        this.rok=rok;
        this.marka=marka;
    }

    public void wyswietl(){
        System.out.println("marka " + marka + "    rok " + rok + "   vin  " + vin);

    }
}