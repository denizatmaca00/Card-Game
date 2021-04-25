import java.util.ArrayList;
import java.util.Random;

public abstract class Oyuncu {
    Random random = new Random();
    private String oyuncuAdi;
    private int Skor;
    private int oyuncuID;

    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
    }

    public Oyuncu() {
    }

    static ArrayList<Futbolcu> pcSecilenFutbolcular = new ArrayList<Futbolcu>();
    static ArrayList<Basketbolcu> pcSecilenBasketbolcular = new ArrayList<Basketbolcu>();
    static ArrayList<Futbolcu> pcSecilenFutbolcularYedek = new ArrayList<Futbolcu>();
    static ArrayList<Basketbolcu> pcSecilenBasketbolcularYedek = new ArrayList<Basketbolcu>();

    public void kartListesi() {
        System.out.println("Bilgisayarin Futbolcu Kartlari");
        for (int i = 0; i < 4; i++) {
            int randomIndexf = random.nextInt(Test.futbolcular.size());
            System.out.println("Isim: " + Test.futbolcular.get(randomIndexf).getFutbolcuAdi() + ", Takim: " + Test.futbolcular.get(randomIndexf).getSporcuTakim() + ", Penalti: " + Test.futbolcular.get(randomIndexf).getPenalti() + ", Serbest Vurus: " + Test.futbolcular.get(randomIndexf).getSerbestVurus() + ", Kaleciyle Karsi Karsiya: " + Test.futbolcular.get(randomIndexf).getKaleciKarsiKarsiya());
            pcSecilenFutbolcular.add(Test.futbolcular.get(randomIndexf));
            pcSecilenFutbolcularYedek.add(Test.futbolcular.get(randomIndexf));
            Test.futbolcular.remove(randomIndexf);
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Bilgisayarin Basketbolcu Kartlari");
        for (int i = 0; i < 4; i++) {
            int randomIndexb = random.nextInt(Test.basketbolcular.size());
            System.out.println("Isim: " + Test.basketbolcular.get(randomIndexb).getBastekbolcuAdi() + ", Takim: " + Test.basketbolcular.get(randomIndexb).getBasketbolcuTakim() + ", Ikilik: " + Test.basketbolcular.get(randomIndexb).getIkilik() + ", Ucluk: " + Test.basketbolcular.get(randomIndexb).getUcluk() + ", Serbest Atis: " + Test.basketbolcular.get(randomIndexb).getSerbestAtis());
            pcSecilenBasketbolcular.add(Test.basketbolcular.get(randomIndexb));
            pcSecilenBasketbolcularYedek.add(Test.basketbolcular.get(randomIndexb));
            Test.basketbolcular.remove(randomIndexb);
        }
        System.out.println("\nKullanicinin Futbolcu Kartlari");
        for (int i = 0; i < 4; i++) {
            System.out.println("Isim: " + Test.futbolcular.get(i).getFutbolcuAdi() + " Takim: " + Test.futbolcular.get(i).getSporcuTakim() + ", Penalti: " + Test.futbolcular.get(i).getPenalti() + ", Serbest Vurus: " + Test.futbolcular.get(i).getSerbestVurus() + ", Kaleciyle Karsi Karsiya: " + Test.futbolcular.get(i).getKaleciKarsiKarsiya());
        }
        System.out.println("---------------------------------------------------------------------------------------------------------------");
        System.out.println("Kullanicinin Basketbolcu Kartlari");
        for (int i = 0; i < Test.basketbolcular.size(); i++) {
            System.out.println("Isim: " + Test.basketbolcular.get(i).getBastekbolcuAdi() + ", Takim: " + Test.basketbolcular.get(i).getBasketbolcuTakim() + ", Ikilik: " + Test.basketbolcular.get(i).getIkilik() + ", Ucluk: " + Test.basketbolcular.get(i).getUcluk() + ", Serbest Atis: " + Test.basketbolcular.get(i).getSerbestAtis());
        }
    }

    public abstract void kartSec();  
    public abstract void SkorGoster();

    //GETTER SETTER
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor += Skor;
    }

    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }
}