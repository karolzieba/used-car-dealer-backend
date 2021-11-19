public class Auto {
    private String vin;
    private int rok;
    private String marka;

    public Auto(String vin,int rok,String marka){
        this.vin=vin;
        this.rok=rok;
        this.marka=marka;
    }

    public void wyswietl(){
        System.out.println("marka " + marka + "    rok " + rok + "   vin  " + vin);

    }
}